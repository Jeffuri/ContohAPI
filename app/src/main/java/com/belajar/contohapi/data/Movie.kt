package com.belajar.contohapi.data

import com.google.gson.annotations.SerializedName

class Movie {
    @SerializedName("name")
    var name = ""
    @SerializedName("year")
    var year = ""
}