
package com.example.dz26

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class NewUserActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)
        val editName = findViewById<EditText>(R.id.edit_name)
        val editSurname = findViewById<EditText>(R.id.edit_surname)
        val editAge = findViewById<EditText>(R.id.edit_age)

        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyIntent = Intent()
            if ((TextUtils.isEmpty(editName.text))||(TextUtils.isEmpty(editSurname.text))||(TextUtils.isEmpty(editAge.text))) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val name = editName.text.toString()
                val surname = editSurname.text.toString()
                val age = editAge.text.toString()
                replyIntent.putExtra(NAME, name)
                replyIntent.putExtra(SURNAME, surname)
                replyIntent.putExtra(AGE, age)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }
    }

    companion object {
        const val NAME = "com.example.android.userlistsql.NAME"
        const val SURNAME = "com.example.android.userlistsql.SURNAME"
        const val AGE = "com.example.android.userlistsql.AGE"
    }
}
