package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a210704_calculator03.databinding.ActivityCalculatorBinding
import com.example.a210704_calculator03.databinding.ActivityHeikinBinding
import java.lang.ArithmeticException

class HeikinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeikinBinding   //bindViewを使うためのなんか

    //初期化
    var calcResult = ""                          //画面に表示する数・表示されている数
    var valueList = mutableListOf<String>()      //入力される数字　を格納

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bindViewを使うためのなんか
        binding = ActivityHeikinBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var a = 2 * 3

        binding.heikinnInView.text = "0"
        binding.heikinnDateView.text = ""


        //「入力」ボタン
        binding.heikinnNyuuryoku.setOnClickListener {

            //calcResultの中身が""の場合、valueListには入れない
            if(calcResult != ""){

                valueList.add(calcResult)   //画面の数をvalueListへ
//                var text = StringBuilder()
//                for (i in valueList.indices){     //TODO  valueListの中身を順にtextへ追加ていき、入れ終わったらheikinDateViewへtextを代入
//                    text.append(valueList[i])
//                }
//                binding.heikinnDateView.text = text
            }

            //リストの中身を計算
            var finalResult = 0
            for (i in valueList.indices){
                Log.d("TAG", "valueList: " + valueList.indices)
                Log.d("TAG", "valueList: " + valueList[i])
                finalResult += valueList[i].toInt()
            }

            finalResult /= valueList.size

            //計算結果を出力
            calcResult = finalResult.toString()
            binding.heikinnOutView.text = calcResult

            //初期化
            calcResult = ""
            binding.heikinnInView.text = calcResult
        }

        //「ac」ボタン
        binding.heikinnAC.setOnClickListener {
            valueList = arrayListOf<String>()
            calcResult = ""
            binding.heikinnInView.text = calcResult
        }

        //数字ボタン
        binding.heikinn0.setOnClickListener {
            calcResult += "0"
            binding.heikinnInView.text = calcResult
        }
        binding.heikinn1.setOnClickListener {
            calcResult += "1"
            binding.heikinnInView.text = calcResult
        }
        binding.heikinn2.setOnClickListener {
            calcResult += "2"
            binding.heikinnInView.text = calcResult
        }
        binding.heikinn3.setOnClickListener {
            calcResult += "3"
            binding.heikinnInView.text = calcResult.toString()
        }
        binding.heikinn4.setOnClickListener {
            calcResult += "4"
            binding.heikinnInView.text = calcResult.toString()
        }
        binding.heikinn5.setOnClickListener {
            calcResult += "5"
            binding.heikinnInView.text = calcResult.toString()
        }
        binding.heikinn6.setOnClickListener {
            calcResult += "6"
            binding.heikinnInView.text = calcResult.toString()
        }
        binding.heikinn7.setOnClickListener {
            calcResult += "7"
            binding.heikinnInView.text = calcResult.toString()
        }
        binding.heikinn8.setOnClickListener {
            calcResult += "8"
            binding.heikinnInView.text = calcResult.toString()
        }
        binding.heikinn9.setOnClickListener {
            calcResult += "9"
            binding.heikinnInView.text = calcResult.toString()
        }
    }
}