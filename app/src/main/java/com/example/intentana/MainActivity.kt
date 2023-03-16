package com.example.intentana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity,Activity_Pindah1::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data -> run {
                val intentData1 = Intent(this@MainActivity, Activity_pindah_Data1::class.java)
                intentData1.putExtra (Activity_pindah_Data1.EXTRA_TEXT, "hallo, ayo belajar kotlin")
                startActivity(intentData1)

            }
            R.id.btn_pindah_objek -> run {
                val cars = Cars(
                    "Toyota Yaris",
                    2020,
                    "BM 2020 SAR"
                )

                val intentObjects = Intent(this@MainActivity, Activity_pindah_objek1::class.java)
                intentObjects.putExtra(Activity_pindah_objek1.EXTRA_CARS, cars)
                startActivity(intentObjects)

            }
        }
    }
}