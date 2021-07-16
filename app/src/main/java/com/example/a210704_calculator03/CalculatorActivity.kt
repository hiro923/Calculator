
//TODO    履歴部分のプログラムを作成

package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a210704_calculator03.databinding.ActivityCalculatorBinding
import java.lang.ArithmeticException
import java.lang.StringBuilder

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding   //bindViewを使うためのなんか

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bindViewを使うためのなんか
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //初期化
        var calcResult = ""                          //画面に表示する数・表示されている数
        var valueList = mutableListOf<String>()      //入力される数字　を格納
        var operateList = mutableListOf<String>()    //入力される演算子を格納
        binding.calcResult.text = "0"
        binding.calcHistory.text = ""


        //「+」ボタン
        binding.calcPlus.setOnClickListener {
            valueList.add(calcResult)               //画面の値をリストに追加
            operateList.add("+")                    //operateLiseに"+"を追加
            calcResult = ""                         //calsResultを初期化
            binding.calcResult.text = calcResult    //画面に値を出力
        }
        //「-」ボタン
        binding.calcMinus.setOnClickListener {
            valueList.add(calcResult)
            operateList.add("-")
            calcResult = ""
            binding.calcResult.text = calcResult
        }
        //「×」ボタン
        binding.calcAsterisk.setOnClickListener {
            valueList.add(calcResult)
            operateList.add("*")
            calcResult = ""
            binding.calcResult.text = calcResult
        }
        //「÷」ボタン
        binding.calcSlash.setOnClickListener {
            valueList.add(calcResult)
            operateList.add("/")
            calcResult = ""
            binding.calcResult.text = calcResult
        }

        //「%」ボタン
        binding.calc0.setOnClickListener {
            valueList.add(calcResult)
            operateList.add("%")
            calcResult = ""
            binding.calcResult.text = calcResult
        }

        //「ac」ボタン
        binding.calcAc.setOnClickListener {
            valueList = arrayListOf<String>()
            operateList = arrayListOf<String>()
            calcResult = ""
            binding.calcResult.text = calcResult
        }

        //「＝」ボタン
        binding.calcEqual.setOnClickListener {

            //calcResultの中身が""の場合、valueListにはいれない
            if(calcResult != ""){

                valueList.add(calcResult)   //画面の数をvalueListへ
//                var text = StringBuilder()
//                for (i in valueList.indices){     //TODO  valueListの中身を順にtextへ追加ていき、入れ終わったらcalcHistoryへtextを代入
//                    text.append(valueList[i])
//                }
//                binding.calcHistory.text = text

            }

            //最後に演算子を入力した場合のエラー回避
            if(operateList.size >= valueList.size){
                Log.d("TAG", "remove")
                operateList.removeAt(operateList.size - 1)  //operateListの末尾を削除
            }

            //リストの中身を計算
            var finalResult = Integer.parseInt(valueList[0])
            for (i in operateList.indices){
                Log.d("TAG", "valueList: " + valueList[i])
                if (operateList[i] == "+"){
                    finalResult += Integer.parseInt(valueList[i+1])
                }
                else if (operateList[i] == "-"){
                    finalResult -= Integer.parseInt(valueList[i+1])
                }
                else if (operateList[i] == "*"){
                    finalResult *= Integer.parseInt(valueList[i+1])
                }
                else if (operateList[i] == "/"){
                    try {
                        finalResult /= Integer.parseInt(valueList[i+1])
                    } catch (e: ArithmeticException){   //数を0で割った場合
                        binding.calcResult.text = "error"
                        //初期化
                        valueList = mutableListOf<String>()
                        operateList = mutableListOf<String>()
                        calcResult = ""
                        return@setOnClickListener
                    }
                }
                else if (operateList[i] == "%"){
                    finalResult %= Integer.parseInt(valueList[i+1])
                }
            }
            //計算結果を出力
            calcResult = finalResult.toString()
            binding.calcResult.text = calcResult

            //初期化 (calcResultを除く)
            valueList = mutableListOf<String>()
            operateList = mutableListOf<String>()
        }

        //数字ボタン
        binding.calc0.setOnClickListener {
            calcResult += "0"
            binding.calcResult.text = calcResult
        }
        binding.calc1.setOnClickListener {
            calcResult += "1"
            binding.calcResult.text = calcResult
        }
        binding.calc2.setOnClickListener {
            calcResult += "2"
            binding.calcResult.text = calcResult
        }
        binding.calc3.setOnClickListener {
            calcResult += "3"
            binding.calcResult.text = calcResult.toString()
        }
        binding.calc4.setOnClickListener {
            calcResult += "4"
            binding.calcResult.text = calcResult.toString()
        }
        binding.calc5.setOnClickListener {
            calcResult += "5"
            binding.calcResult.text = calcResult.toString()
        }
        binding.calc6.setOnClickListener {
            calcResult += "6"
            binding.calcResult.text = calcResult.toString()
        }
        binding.calc7.setOnClickListener {
            calcResult += "7"
            binding.calcResult.text = calcResult.toString()
        }
        binding.calc8.setOnClickListener {
            calcResult += "8"
            binding.calcResult.text = calcResult.toString()
        }
        binding.calc9.setOnClickListener {
            calcResult += "9"
            binding.calcResult.text = calcResult.toString()
        }

    }
}