package com.example.overzicht

import androidx.room.Embedded
import androidx.room.Relation

data class DatumEnAantal(
    @Embedded val datum: Datum,
    @Relation(
        parentColumn = "dagEnMaandEnJaar",
        entityColumn = "dagEnMaandEnJaar"
    )
    val aantal: Aantal

)