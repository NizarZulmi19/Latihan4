package com.example.latihan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.imageButtonAdd)
        imgBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Data telah berhasil di input", Toast.LENGTH_LONG)
                .show()
            val imgBtn = findViewById<ImageButton>(R.id.Hapus)
            imgBtn.setOnClickListener {
                Toast.makeText(this@MainActivity, "Data telah terhapus", Toast.LENGTH_LONG).show()
            }
        }
    }
}