
package com.example.dz26

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey
    @ColumnInfo
        (name = "name") val name: String,
    @ColumnInfo
        (name = "surname") val surname: String,

    @ColumnInfo
        (name = "age") val age: Int,
    @ColumnInfo
        (name = "image") val image: String)
