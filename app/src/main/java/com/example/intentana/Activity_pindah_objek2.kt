package com.example.intentana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.intentana.R
import org.w3c.dom.Text

class   Activity_pindah_Data1 : AppCompatActivity() {
    companion object{
        const val EXTRA_TEXT = "EXTRA_TEXT"
    }

    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data1)

        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text yang di kirim : $tvReceived"

        tvPenerima.text = Text
    }
}