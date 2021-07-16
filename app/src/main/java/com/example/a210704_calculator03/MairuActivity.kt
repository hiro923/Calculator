package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a210704_calculator03.databinding.ActivityMairuBinding
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
        var kmka = 1.609344
        binding.mairuInView.text = "0"

        //「ac」ボタン
        binding.mairuAC.setOnClickListener {
            valueList = arrayListOf<String>()
            operateList = arrayListOf<String>()
            calcResult = ""
            binding.mairuInView.text = calcResult
        }


        //数字ボタン
        binding.mairu0.setOnClickListener {
            calcResult += "0"
            binding.mairuInView.text = calcResult
        }
        binding.mairu1.setOnClickListener {
            calcResult += "1"
            binding.mairuInView.text = calcResult
        }
        binding.mairu2.setOnClickListener {
            calcResult += "2"
            binding.mairuInView.text = calcResult
        }
        binding.mairu3.setOnClickListener {
            calcResult += "3"
            binding.mairuInView.text = calcResult.toString()
        }
        binding.mairu4.setOnClickListener {
            calcResult += "4"
            binding.mairuInView.text = calcResult.toString()
        }
        binding.mairu5.setOnClickListener {
            calcResult += "5"
            binding.mairuInView.text = calcResult.toString()
        }
        binding.mairu6.setOnClickListener {
            calcResult += "6"
            binding.mairuInView.text = calcResult.toString()
        }
        binding.mairu7.setOnClickListener {
            calcResult += "7"
            binding.mairuInView.text = calcResult.toString()
        }
        binding.mairu8.setOnClickListener {
            calcResult += "8"
            binding.mairuInView.text = calcResult.toString()
        }
        binding.mairu9.setOnClickListener {
            calcResult += "9"
            binding.mairuInView.text = calcResult.toString()
        }


        //「＝」ボタン
        binding.mairuKMka.setOnClickListener {

            //calcResultの中身が""の場合、valueListにはいれない
            if(calcResult != ""){

                valueList.add(calcResult)   //画面の数をvalueListへ
//                var text = StringBuilder()
//                for (i in valueList.indices){     //TODO  valueListの中身を順にtextへ追加ていき、入れ終わったらcalcHistoryへtextを代入
//                    text.append(valueList[i])
//                }
//                binding.calcHistory.text = text

            }

            //計算結果を出力
            Integer.parseInt(binding.mairuInView.text) * kmka= calcResult
            binding.mairuOutView.text = calcResult

            //初期化 (calcResultを除く)
            valueList = mutableListOf<String>()
            operateList = mutableListOf<String>()
        }
    }
}
