package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a210704_calculator03.databinding.ActivitySyouhizeiBinding

class SyouhizeiActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySyouhizeiBinding   //bindViewを使うためのなんか

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mairu)

        //bindViewを使うためのなんか
        binding = ActivitySyouhizeiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //初期化
        var calcResult = ""                          //画面に表示する数・表示されている数
        var valueList = mutableListOf<String>()      //入力される数字　を格納
        binding.syouhizeiInView.text = "0"

        //「ac」ボタン
        binding.syouhizeiAC.setOnClickListener {
            valueList = arrayListOf<String>()
            calcResult = ""
            binding.syouhizeiInView.text = calcResult
        }


        //数字ボタン
        binding.syouhizei0.setOnClickListener {
            calcResult += "0"
            binding.syouhizeiInView.text = calcResult
        }
        binding.syouhizei1.setOnClickListener {
            calcResult += "1"
            binding.syouhizeiInView.text = calcResult
        }
        binding.syouhizei2.setOnClickListener {
            calcResult += "2"
            binding.syouhizeiInView.text = calcResult
        }
        binding.syouhizei3.setOnClickListener {
            calcResult += "3"
            binding.syouhizeiInView.text = calcResult.toString()
        }
        binding.syouhizei4.setOnClickListener {
            calcResult += "4"
            binding.syouhizeiInView.text = calcResult.toString()
        }
        binding.syouhizei5.setOnClickListener {
            calcResult += "5"
            binding.syouhizeiInView.text = calcResult.toString()
        }
        binding.syouhizei6.setOnClickListener {
            calcResult += "6"
            binding.syouhizeiInView.text = calcResult.toString()
        }
        binding.syouhizei7.setOnClickListener {
            calcResult += "7"
            binding.syouhizeiInView.text = calcResult.toString()
        }
        binding.syouhizei8.setOnClickListener {
            calcResult += "8"
            binding.syouhizeiInView.text = calcResult.toString()
        }
        binding.syouhizei9.setOnClickListener {
            calcResult += "9"
            binding.syouhizeiInView.text = calcResult.toString()
        }

        //「税込」ボタン
        binding.syouhizeiZeikomika.setOnClickListener {

            //calcResultの中身が""の場合、valueListにはいれない
            if (calcResult != "") {

                valueList.add(calcResult)   //画面の数をvalueListへ

                //計算結果を出力
                var kmResult = Math.floor(binding.syouhizeiInView.text.toString().toInt() * 1.1)
                binding.syouhizeiOutView.text = kmResult.toString()

                //初期化 (calcResultを除く)
                valueList = mutableListOf<String>()
            }

            //「税抜き」ボタン
            binding.syouhizeiZeinukika.setOnClickListener {

                //calcResultの中身が""の場合、valueListにはいれない
                if (calcResult != "") {

                    valueList.add(calcResult)   //画面の数をvalueListへ

                    //計算結果を出力
                    var kmResult =Math.ceil(binding.syouhizeiInView.text.toString().toInt() * 0.9)
                    binding.syouhizeiOutView.text = kmResult.toString()

                    //初期化 (calcResultを除く)
                    valueList = mutableListOf<String>()
                }
            }
        }
    }
}