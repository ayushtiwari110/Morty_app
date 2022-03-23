package com.example.morty_app.feature_morty.domain.model

import com.example.morty_app.feature_morty.data.remote.dto.InfoDto

data class Morty(
    val info: InfoDto,
    val results: List<Result>
)