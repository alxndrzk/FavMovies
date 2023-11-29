package com.example.favmovies

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val name: String,
    val description: String,
    val rate : String,
    val photo: Int

) : Parcelable
