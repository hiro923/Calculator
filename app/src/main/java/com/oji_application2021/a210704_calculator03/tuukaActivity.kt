package com.oji_application2021.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.oji_application2021.a210704_calculator03.databinding.ActivityTuukaBinding

class tuukaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTuukaBinding   //bindViewを使うためのなんか

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //bindViewを使うためのなんか
        binding = ActivityTuukaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //初期化
        var calcResult = ""                          //画面に表示する数・表示されている数
        binding.tuukaInView.text = "入力"
        //inSpinner
        val inSpinner = findViewById<Spinner>(R.id.tuuka_inspinner)
        val inAdapter = ArrayAdapter.createFromResource(this, R.array.tuuka1, android.R.layout.simple_spinner_item)
        inAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        inSpinner.adapter = inAdapter
        var inspinnerResult = ""
        //outSpinner
        val outSpinner = findViewById<Spinner>(R.id.tuuka_outspinner)
        val outAdapter = ArrayAdapter.createFromResource(this, R.array.tuuka1, android.R.layout.simple_spinner_item)
        outAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        inSpinner.adapter = outAdapter
        var outspinnerResult = ""

        // 「inSpinner」の取得
        inSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            // 項目が選択された時に呼ばれる
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                inspinnerResult = parent?.selectedItem as String
            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        // 「outSpinner」の取得
        outSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            // 項目が選択された時に呼ばれる
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                outspinnerResult = parent?.selectedItem as String
            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        //「変換」ボタン
        binding.tuukaHenkan.setOnClickListener {    //TODO  為替レートを取得する必要あり
            when (inspinnerResult) {
                "JPY" -> {Log.d("TAG", "when : JPY")}
                "CNY" -> {Log.d("TAG", "when : CNY")}
                "USD" -> {Log.d("TAG", "when : USD")}
                "EUR" -> {Log.d("TAG", "when : EUR")}
                "KRW" -> {Log.d("TAG", "when : KRW")}
            }
        }

        //「ac」ボタン
        binding.tuukaAC.setOnClickListener {
            calcResult = ""
            binding.tuukaInView.text = calcResult
        }

        //数字ボタン
        binding.tuuka0.setOnClickListener {
            calcResult += "0"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka1.setOnClickListener {
            calcResult += "1"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka2.setOnClickListener {
            calcResult += "2"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka3.setOnClickListener {
            calcResult += "3"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka4.setOnClickListener {
            calcResult += "4"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka5.setOnClickListener {
            calcResult += "5"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka6.setOnClickListener {
            calcResult += "6"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka7.setOnClickListener {
            calcResult += "7"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka8.setOnClickListener {
            calcResult += "8"
            binding.tuukaInView.text = calcResult
        }
        binding.tuuka9.setOnClickListener {
            calcResult += "9"
            binding.tuukaInView.text = calcResult
        }
    }
}

