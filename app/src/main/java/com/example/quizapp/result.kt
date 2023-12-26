package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var correctAns : Int = 0
        var totalQues : Int = 0

        var tvName = findViewById<TextView>(R.id.tv_name)
        var tvScore = findViewById<TextView>(R.id.tv_score)
        var btnRestart = findViewById<Button>(R.id.btn_restart)

        tvName.text = intent.getStringExtra(Constant.USER_NAME)
        correctAns = intent.getIntExtra(Constant.CORRECT_ANSWERS,0)
        totalQues = intent.getIntExtra(Constant.TOTAL_QUESTIONS,0)

        tvScore.text = "Your score is ${correctAns} out of ${totalQues}"

        btnRestart.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}