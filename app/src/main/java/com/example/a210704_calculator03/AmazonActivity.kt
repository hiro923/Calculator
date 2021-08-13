package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.a210704_calculator03.databinding.ActivityAmazonBinding
import com.example.a210704_calculator03.databinding.ActivityMairuBinding

class AmazonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAmazonBinding   //bindViewを使うためのなんか

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon)

        //bindViewを使うためのなんか
        binding = ActivityAmazonBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //初期化
        var calcResult = "" //画面に表示する数・表示されている数
        var souryouResult = ""
        var outViewResult = ""
        var sentaku = "0"
        binding.amazonKakakuView.text = "0"

        //選択ボタン
        binding.amazonSentaku.setOnClickListener {
            sentaku = "1"
        }

        //選択ボタン2
        binding.amazonSentaku2.setOnClickListener {
            sentaku = "2"
        }


        //「ac」ボタン
        binding.mainAC.setOnClickListener {
            calcResult = ""
            souryouResult = ""
            outViewResult = ""
            binding.amazonKakakuView.text = calcResult
        }


        //数字ボタン
        binding.main0.setOnClickListener {
            plusValue(0)
        }

        binding.main1.setOnClickListener {
            plusvalue(1)
        }
        binding.main2.setOnClickListener {
            plusValue(2)
        }
        binding.main3.setOnClickListener {
            plusValue(3)
        }
        binding.main4.setOnClickListener {
            plusValue(4)
        }
        binding.main5.setOnClickListener {
            plusValue(5)
        }
        binding.main6.setOnClickListener {
            plusValue(6)
        }
        binding.main7.setOnClickListener {
            plusValue(7)
        }
        binding.main8.setOnClickListener {
            plusValue(8)
        }
        binding.main9.setOnClickListener {
            plusValue(9)
        }
        //スピナー
        val spinner = findViewById<Spinner>(R.id.amazon_spinner)
        val adapter = ArrayAdapter.createFromResource(this, R.array.amazon, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        var spinnerResult = ""
        // OnItemSelectedListenerの実装
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            // 項目が選択された時に呼ばれる
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                 spinnerResult = parent?.selectedItem as String
            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        var spinnernumber = 0
        if(spinnerResult == "本"||spinnerResult == "CD・レコード"||spinnerResult == "DVD"||spinnerResult == "ビデオ"
            ||spinnerResult == "PCソフト"||spinnerResult == "TVゲーム"||spinnerResult == "ペット用品"||spinnerResult == "文房具・オフィス用品"){
            spinnernumber = 1.15.toInt()
        }
        if(spinnerResult == "おもちゃ"||spinnerResult == "ドラッグストア"||spinnerResult == "美容"||spinnerResult == "スポーツ・アウトドア"
            ||spinnerResult == "車・バイク用品"){
            spinnernumber = 1.1.toInt()
        }

        //出力ボタン
        binding.amazonOut.setOnClickListener {
            outViewResult = (calcResult.toInt() + souryouResult.toInt() *spinnernumber).toString()
            binding.amazonOutView.text = outViewResult
        }

        //計算用関数
        fun plusValue (x: Int){
            if(sentaku == "1") {
                calcResult += x
                binding.amazonSouryouView.text = calcResult
            }
            else if (sentaku == "2"){
                souryouResult += x
                binding.amazonSouryouView.text = souryouResult
            }
        }

    }
}