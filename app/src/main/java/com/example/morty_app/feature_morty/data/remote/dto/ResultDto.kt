package com.example.morty_app.feature_morty.data.remote.dto

import com.example.morty_app.feature_morty.domain.model.Result

data class ResultDto(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationDto,
    val name: String,
    val origin: OriginDto,
    val species: String,
    val status: String,
    val type: String,
    val url: String
){
    fun ResultDto.toResult():Result{
        return Result(
            id = id,
            image = image,
            name = name,
            species = species,
            status = status,
            type = type,
            gender = gender
        )
    }
}