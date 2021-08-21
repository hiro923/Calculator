package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a210704_calculator03.databinding.ActivityCalculatorBinding
import com.example.a210704_calculator03.databinding.ActivityNengouBinding
import java.lang.ArithmeticException

class NengouActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNengouBinding   //bindViewを使うためのなんか

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bindViewを使うためのなんか
        binding = ActivityNengouBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //初期化
        var calcResult = ""                          //画面に表示する数・表示されている数

        //TODO 年号(令和、平成、昭和)を選択するスピナーを作る & when分文でそれぞれの年号ごとによって計算方法を変更
        //西暦化ボタン
        binding.nengouSeirekika.setOnClickListener {
        }

        //年号化ボタン
        binding.nengouNengouka.setOnClickListener {

        }

        //「ac」ボタン
        binding.nengouAC.setOnClickListener {
            calcResult = ""
            binding.nengouInView.text = calcResult
        }

        //数字ボタン
        binding.nengou0.setOnClickListener {
            calcResult += "0"
            binding.nengouInView.text = calcResult
        }
        binding.nengou1.setOnClickListener {
            calcResult += "1"
            binding.nengouInView.text = calcResult
        }
        binding.nengou2.setOnClickListener {
            calcResult += "2"
            binding.nengouInView.text = calcResult
        }
        binding.nengou3.setOnClickListener {
            calcResult += "3"
            binding.nengouInView.text = calcResult.toString()
        }
        binding.nengou4.setOnClickListener {
            calcResult += "4"
            binding.nengouInView.text = calcResult.toString()
        }
        binding.nengou5.setOnClickListener {
            calcResult += "5"
            binding.nengouInView.text = calcResult.toString()
        }
        binding.nengou6.setOnClickListener {
            calcResult += "6"
            binding.nengouInView.text = calcResult.toString()
        }
        binding.nengou7.setOnClickListener {
            calcResult += "7"
            binding.nengouInView.text = calcResult.toString()
        }
        binding.nengou8.setOnClickListener {
            calcResult += "8"
            binding.nengouInView.text = calcResult.toString()
        }
        binding.nengou9.setOnClickListener {
            calcResult += "9"
            binding.nengouInView.text = calcResult.toString()
        }
    }
}