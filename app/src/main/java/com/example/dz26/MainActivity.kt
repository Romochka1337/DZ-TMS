package com.example.dz26

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val newUserActivityRequestCode = 1
    private val userViewModel: UserViewModel by viewModels {
        UserViewModelFactory((application as UsersApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = UserListAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this@MainActivity, NewUserActivity::class.java)
            startActivityForResult(intent, newUserActivityRequestCode)
        }
        userViewModel.allUsers.observe(owner = this) { users ->
            users.let { adapter.submitList(it) }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

        if (requestCode == newUserActivityRequestCode && resultCode == Activity.RESULT_OK) {
            intentData?.getStringExtra(NewUserActivity.NAME)?.let { name ->
                intentData?.getStringExtra(NewUserActivity.SURNAME)?.let { surname ->
                    intentData?.getStringExtra(NewUserActivity.AGE)?.let { age ->
                        val user = User(name, surname, age.toInt(), "https://moe.shikimori.one/system/user_images/original/48969/1263267.jpg")
                        userViewModel.insert(user)
                    }
                }
            }
        } else {
            Toast.makeText(
                applicationContext,
                R.string.empty_not_saved,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
