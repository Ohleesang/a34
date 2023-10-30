package com.example.a34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(s: String): String {
                var answer = ""
                var temp = CharArray(s.length)
                temp = s.toCharArray()
                temp.sortDescending()
                answer = StringBuilder().append(temp).toString()
                return answer
            }
        }
        val a = Solution()
        a.solution("Zbcdefg")
    }

}