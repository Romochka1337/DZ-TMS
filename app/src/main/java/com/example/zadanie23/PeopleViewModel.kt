package com.example.zadanie23

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async

class PeopleViewModel:ViewModel() {
    init{
        viewModelScope.async(Dispatchers.IO) {
            usersList.add(User("Вольфганг Амадей", "Моцарт", 35,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Wolfgang-amadeus-mozart_1.jpg/250px-Wolfgang-amadeus-mozart_1.jpg" ))
            usersList.add(User("Людвиг Ван", "Бетховен", 56, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Beethoven.jpg/274px-Beethoven.jpg"))
            usersList.add(User("Иоганн Себастьян", "Бах", 65, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Johann_Sebastian_Bach.jpg/260px-Johann_Sebastian_Bach.jpg"))
            usersList.add(User("Владимир", "Ленин", 53, "https://www.meme-arsenal.com/memes/ede66b8da458aac93faae50f80e4cc7e.jpg"))
            usersList.add(User("Джозеф", "Байден", 90, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Joe_Biden_presidential_portrait.jpg/274px-Joe_Biden_presidential_portrait.jpg"))
            usersList.add(User("Дональд", "Трамп", 50, "https://moe.shikimori.one/system/user_images/original/48969/1263267.jpg"))
            usersList.add(User("Александр", "Пушкин", 38, "https://upload.wikimedia.org/wikipedia/commons/5/56/Kiprensky_Pushkin.jpg"))
            usersList.add(User("Александр", "Лука", 67, "https://img5tv.cdnvideo.ru/webp/shared/files/201908/1_955491.jpg"))
            usersList.add(User("Какой-то", "Мужик", 56, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Bundesarchiv_Bild_183-H1216-0500-002%2C_Adolf_Hitler.jpg/250px-Bundesarchiv_Bild_183-H1216-0500-002%2C_Adolf_Hitler.jpg"))
            usersList.add(User("Владимир", "Путин", 70, "https://cdnn21.img.ria.ru/images/07e6/04/0c/1783086041_0:104:3096:1846_1920x0_80_0_0_a41a71b97d0ec70f22b5812c81f42a6c.jpg"))
        }
    }
    var usersList:MutableList<User> = mutableListOf<User>()
}