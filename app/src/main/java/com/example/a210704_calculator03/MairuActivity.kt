package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a210704_calculator03.databinding.ActivityCalculatorBinding
import com.example.a210704_calculator03.databinding.ActivityMainBinding
import com.example.a210704_calculator03.databinding.ActivityMairuBinding
import java.lang.ArithmeticException

class MairuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMairuBinding   //bindViewを使うためのなんか

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mairu)

        //bindViewを使うためのなんか
        binding = ActivityMairuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //初期化
        var calcResult = ""                          //画面に表示する数・表示されている数
        var valueList = mutableListOf<String>()      //入力される数字　を格納
        var operateList = mutableListOf<String>()    //入力される演算子を格納
        binding.mairuOutView.text = "0"

        //「ac」ボタン
        binding.mairuAC.setOnClickListener {
            valueList = arrayListOf<String>()
            operateList = arrayListOf<String>()
            calcResult = ""
            binding.mairuOutView.text = calcResult
        }


        //数字ボタン
        binding.mairu0.setOnClickListener {
            calcResult += "0"
            binding.mairuOutView.text = calcResult
        }
        binding.mairu1.setOnClickListener {
            calcResult += "1"
            binding.mairuOutView.text = calcResult
        }
        binding.mairu2.setOnClickListener {
            calcResult += "2"
            binding.mairuOutView.text = calcResult
        }
        binding.mairu3.setOnClickListener {
            calcResult += "3"
            binding.mairuOutView.text = calcResult.toString()
        }
        binding.mairu4.setOnClickListener {
            calcResult += "4"
            binding.mairuOutView.text = calcResult.toString()
        }
        binding.mairu5.setOnClickListener {
            calcResult += "5"
            binding.mairuOutView.text = calcResult.toString()
        }
        binding.mairu6.setOnClickListener {
            calcResult += "6"
            binding.mairuOutView.text = calcResult.toString()
        }
        binding.mairu7.setOnClickListener {
            calcResult += "7"
            binding.mairuOutView.text = calcResult.toString()
        }
        binding.mairu8.setOnClickListener {
            calcResult += "8"
            binding.mairuOutView.text = calcResult.toString()
        }
        binding.mairu9.setOnClickListener {
            calcResult += "9"
            binding.mairuOutView.text = calcResult.toString()
        }
    }
}