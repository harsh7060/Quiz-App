package com.example.quizapp

data class Question(
    val id : Int,
    val question : String,
    val image : Int,
    val optionFirst : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val correctOption : Int
)
