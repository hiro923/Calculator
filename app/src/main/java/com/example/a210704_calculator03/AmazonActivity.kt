package com.example.a210704_calculator03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        var calcResult = ""                          //画面に表示する数・表示されている数
        var valueList = mutableListOf<String>()
        var souryouResult = ""
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
            valueList = arrayListOf<String>()
            calcResult = ""
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
                calcResult += "0"
                binding.amazonSouryouView.text = souryouResult
            }
            binding.main1.setOnClickListener {
                calcResult += "1"
                binding.amazonSouryouView.text = souryouResult
            }
            binding.main2.setOnClickListener {
                calcResult += "2"
                binding.amazonSouryouView.text = souryouResult
            }
            binding.main3.setOnClickListener {
                calcResult += "3"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main4.setOnClickListener {
                calcResult += "4"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main5.setOnClickListener {
                calcResult += "5"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main6.setOnClickListener {
                calcResult += "6"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main7.setOnClickListener {
                calcResult += "7"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main8.setOnClickListener {
                calcResult += "8"
                binding.amazonSouryouView.text = souryouResult.toString()
            }
            binding.main9.setOnClickListener {
                calcResult += "9"
                binding.amazonSouryouView.text = souryouResult.toString()
            }

        }


    }
}