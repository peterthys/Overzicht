package com.example.overzicht

import androidx.room.*
import java.util.*

@Dao
interface DatumDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun insertDatum(datum: Datum)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAantal(aantal: Aantal)
    @Transaction
    @Query("SELECT * FROM datum WHERE dagEnMaandEnJaar = :dagEnMaandEnJaar")
    suspend fun getDatumAndAantalByDatum(dagEnMaandEnJaar : Date):List<DatumEnAantal>
    @Transaction
    @Query("SELECT * FROM aantal WHERE aantalPinten = :aantal")
    suspend fun getAantalAndDatumByAantal(aantal: Aantal):List<DatumEnAantal>

}