package com.profdata.quiz.Common

import com.profdata.quiz.Model.Category
import com.profdata.quiz.Model.CurrentQuestion
import com.profdata.quiz.Model.Question
import com.profdata.quiz.QuestionFragment
import java.lang.StringBuilder

object Common {

    val KEY_GO_TO_QUESTION: String? = "position_go_to"
    val KEY_BACK_FROM_RESULT:String? = "back_from_result"



    val TOTAL_TIME = 30*60*1000 // 20 min
    var answerSheetList:MutableList<CurrentQuestion> = ArrayList()
    var answerSheetListFiltered:MutableList<CurrentQuestion> = ArrayList()

    var questionList:MutableList<Question> = ArrayList()
    var selectedCategory: Category?=null

    var fragmentList:MutableList<QuestionFragment> = ArrayList()

    var selected_values:MutableList<String> = ArrayList()

    var timer = 0
    var right_answer_count=0
    var wrong_answer_count=0
    var no_answer_count=0
    var data_question=StringBuilder()

    enum class ANSWER_TYPE{
        NO_ANSWER,
        RIGHT_ANSWER,
        WRONG_ANSWER
    }
}