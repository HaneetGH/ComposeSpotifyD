package com.guru.composecookbook.ui.demoui.spotify.data

import java.io.Serializable

data class Album(
    val id: Int,
    val genre: String = "Pop",
    val artist: String,
    val song: String,
    val descriptions: String,
    val imageId: String,
    val swiped: Boolean = false
) : Serializable