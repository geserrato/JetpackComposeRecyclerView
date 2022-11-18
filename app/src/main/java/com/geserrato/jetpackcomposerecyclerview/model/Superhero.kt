package com.geserrato.jetpackcomposerecyclerview.model

import androidx.annotation.DrawableRes

data class Superhero(
    var superHeroName: String,
    var realName: String,
    var publisher: String,
    @DrawableRes var photo: Int
)
