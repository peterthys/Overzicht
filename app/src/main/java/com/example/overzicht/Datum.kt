package com.example.overzicht

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Datum (
    @PrimaryKey(autoGenerate = false)
    val dagEnMaandEnJaar : Date
        )