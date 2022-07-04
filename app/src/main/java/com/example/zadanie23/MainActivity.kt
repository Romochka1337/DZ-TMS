package com.example.zadanie23
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zadanie23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var userList: MutableList<User> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvList.adapter = com.example.zadanie23.adapter.PeopleAdapter(getUsersData())
    }
    private fun getUsersData() = mutableListOf<User>(
        User("Вольфганг Амадей", "Моцарт", 35,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Wolfgang-amadeus-mozart_1.jpg/250px-Wolfgang-amadeus-mozart_1.jpg" ),
        User("Людвиг Ван", "Бетховен", 56, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Beethoven.jpg/274px-Beethoven.jpg"),
        User("Иоганн Себастьян", "Бах", 65, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Johann_Sebastian_Bach.jpg/260px-Johann_Sebastian_Bach.jpg"),
        User("Владимир", "Ленин", 53, "https://www.meme-arsenal.com/memes/ede66b8da458aac93faae50f80e4cc7e.jpg"),
        User("Джозеф", "Байден", 90, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Joe_Biden_presidential_portrait.jpg/274px-Joe_Biden_presidential_portrait.jpg"),
        User("Дональд", "Трамп", 50, "https://moe.shikimori.one/system/user_images/original/48969/1263267.jpg"),
        User("Александр", "Пушкин", 38, "https://upload.wikimedia.org/wikipedia/commons/5/56/Kiprensky_Pushkin.jpg"),
        User("Александр", "Лука", 67, "https://img5tv.cdnvideo.ru/webp/shared/files/201908/1_955491.jpg"),
        User("Какой-то", "Мужик", 56, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Bundesarchiv_Bild_183-H1216-0500-002%2C_Adolf_Hitler.jpg/250px-Bundesarchiv_Bild_183-H1216-0500-002%2C_Adolf_Hitler.jpg"),
        User("Владимир", "Путин", 70, "https://cdnn21.img.ria.ru/images/07e6/04/0c/1783086041_0:104:3096:1846_1920x0_80_0_0_a41a71b97d0ec70f22b5812c81f42a6c.jpg"),
    )
}