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
            outViewResult = ""
            binding.amazonKakakuView.text = calcResult
        }


        //数字ボタン
        if (sentaku == "1") {
            binding.main0.setOnClickListener {
                calcResult += "0"
                binding.amazonKakakuView.text = calcResult
            }
            binding.main1.setOnClickListener {
                calcResult += "1"
                binding.amazonKakakuView.text = calcResult
            }
            binding.main2.setOnClickListener {
                calcResult += "2"
                binding.amazonKakakuView.text = calcResult
            }
            binding.main3.setOnClickListener {
                calcResult += "3"
                binding.amazonKakakuView.text = calcResult.toString()
            }
            binding.main4.setOnClickListener {
                calcResult += "4"
                binding.amazonKakakuView.text = calcResult.toString()
            }
            binding.main5.setOnClickListener {
                calcResult += "5"
                binding.amazonKakakuView.text = calcResult.toString()
            }
            binding.main6.setOnClickListener {
                calcResult += "6"
                binding.amazonKakakuView.text = calcResult.toString()
            }
            binding.main7.setOnClickListener {
                calcResult += "7"
                binding.amazonKakakuView.text = calcResult.toString()
            }
            binding.main8.setOnClickListener {
                calcResult += "8"
                binding.amazonKakakuView.text = calcResult.toString()
            }
            binding.main9.setOnClickListener {
                calcResult += "9"
                binding.amazonKakakuView.text = calcResult.toString()
            }

        }

        //数字ボタン
        if (sentaku == "2") {
            binding.main0.setOnClickListener {
                souryouResult += "0"
                binding.amazonSouryouView.text = souryouResult
            }
            binding.main1.setOnClickListener {
                souryouResult += "1"
                binding.amazonSouryouView.text = souryouResult
            }
            binding.main2.setOnClickListener {
                souryouResult += "2"
                binding.amazonSouryouView.text = souryouResult
            }
            binding.main3.setOnClickListener {
                souryouResult += "3"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main4.setOnClickListener {
                souryouResult += "4"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main5.setOnClickListener {
                souryouResult += "5"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main6.setOnClickListener {
                souryouResult += "6"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main7.setOnClickListener {
                souryouResult += "7"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main8.setOnClickListener {
                souryouResult += "8"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main9.setOnClickListener {
                souryouResult += "9"
                binding.amazonSouryouView.text = souryouResult.toString()
            }

        }

        //スピナー
        val spinner = findViewById<Spinner>(R.id.amazon_spinner)
        val adapter = ArrayAdapter.createFromResource(this, R.array.amazon, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // OnItemSelectedListenerの実装
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            // 項目が選択された時に呼ばれる
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val spinnerResult = parent?.selectedItem as String
            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        if (spinner == "本"){

        }



        //出力ボタン
        binding.amazonOut.setOnClickListener {
            outViewResult =
        }
    }
}