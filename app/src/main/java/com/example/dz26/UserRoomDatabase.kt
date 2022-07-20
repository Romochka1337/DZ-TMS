package com.example.dz26

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [User::class], version = 2)
abstract class UserRoomDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: UserRoomDatabase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): UserRoomDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserRoomDatabase::class.java,
                    "user_database"
                )

                    .fallbackToDestructiveMigration()
                    .addCallback(UserDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class UserDatabaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.userDao())
                    }
                }
            }
        }

        suspend fun populateDatabase(userDao: UserDao) {
            userDao.deleteAll()
            userDao.insert(User("Вольфганг Амадей", "Моцарт", 35,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Wolfgang-amadeus-mozart_1.jpg/250px-Wolfgang-amadeus-mozart_1.jpg" ))
            userDao.insert(User("Людвиг Ван", "Бетховен", 56, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Beethoven.jpg/274px-Beethoven.jpg"))
            userDao.insert(User("Иоганн Себастьян", "Бах", 65, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Johann_Sebastian_Bach.jpg/260px-Johann_Sebastian_Bach.jpg"))
            userDao.insert(User("Владимир", "Ленин", 53, "https://www.meme-arsenal.com/memes/ede66b8da458aac93faae50f80e4cc7e.jpg"))
            userDao.insert(User("Джозеф", "Байден", 90, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Joe_Biden_presidential_portrait.jpg/274px-Joe_Biden_presidential_portrait.jpg"))
            userDao.insert(User("Дональд", "Трамп", 50, "https://moe.shikimori.one/system/user_images/original/48969/1263267.jpg"))
            userDao.insert(User("Александр", "Пушкин", 38, "https://upload.wikimedia.org/wikipedia/commons/5/56/Kiprensky_Pushkin.jpg"))
            userDao.insert(User("Александр", "Лука", 67, "https://img5tv.cdnvideo.ru/webp/shared/files/201908/1_955491.jpg"))
            userDao.insert(User("Какой-то", "Мужик", 56, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Bundesarchiv_Bild_183-H1216-0500-002%2C_Adolf_Hitler.jpg/250px-Bundesarchiv_Bild_183-H1216-0500-002%2C_Adolf_Hitler.jpg"))
            userDao.insert(User("Владимир", "Путин", 70, "https://cdnn21.img.ria.ru/images/07e6/04/0c/1783086041_0:104:3096:1846_1920x0_80_0_0_a41a71b97d0ec70f22b5812c81f42a6c.jpg"))
        }
    }
}
