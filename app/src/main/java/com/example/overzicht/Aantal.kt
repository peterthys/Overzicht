package com.example.overzicht

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Aantal (
    @PrimaryKey(autoGenerate = false)
    val aantalPinten :String,
    val dagEnMaandEnJaar : Date
        )
