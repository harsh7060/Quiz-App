package com.example.quizapp

object Constant {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_ques"
    const val CORRECT_ANSWERS : String = "correct_ans"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val q1 = Question(
            1,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_india,
            "USA","India",
            "Pakistan","Italy",
            2
        )

        questionList.add(q1)

        //2
        val q2 = Question(
            2,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","India",
            "USA","Italy",
            1
        )

        questionList.add(q2)

        //3
        val q3 = Question(
            3,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina","India",
            "USA","New Zealand",
            4
        )

        questionList.add(q3)

        //4
        val q4 = Question(
            4,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "Austria","Australia",
            "USA","UK",
            2
        )

        questionList.add(q4)

        //5
        val q5 = Question(
            5,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Brazil","England",
            "Hungary","Germany",
            1
        )

        questionList.add(q5)

        //6
        val q6 = Question(
            6,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "India","France",
            "UK","Germany",
            4
        )

        questionList.add(q6)

        //7
        val q7 = Question(
            7,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","India",
            "Belgium","Italy",
            3
        )

        questionList.add(q7)

        //8
        val q8 = Question(
            8,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_fiji,
            "Austria","India",
            "Chile","fiji",
            4
        )

        questionList.add(q8)

        //9
        val q9 = Question(
            9,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Poland","Denmark",
            "USA","Chile",
            2
        )

        questionList.add(q9)

        //10
        val q10 = Question(
            10,
            "What Country does this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait","India",
            "Belgium","Italy",
            1
        )

        questionList.add(q10)


        return questionList

    }
}