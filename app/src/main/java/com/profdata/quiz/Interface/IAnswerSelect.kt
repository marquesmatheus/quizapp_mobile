package com.profdata.quiz.Interface

import com.profdata.quiz.Model.CurrentQuestion

interface IAnswerSelect {
    fun selectedAnswer():CurrentQuestion
    fun showCorrectAnswer()
    fun disableAnswer()
    fun resetQuestion()

}