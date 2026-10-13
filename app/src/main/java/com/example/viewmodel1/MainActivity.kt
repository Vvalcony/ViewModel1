package com.example.viewmodel1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount = findViewById<TextView>(R.id.tvCount)
        val btnUp = findViewById<Button>(R.id.btnUp)
        val btnDown = findViewById<Button>(R.id.btnDown)
        val btnReset = findViewById<Button>(R.id.btnReset)

        viewModel.count.observe(this) { value ->
            tvCount.text = value.toString()
        }

        btnUp.setOnClickListener { viewModel.up() }
        btnDown.setOnClickListener { viewModel.down() }
        btnReset.setOnClickListener { viewModel.reset() }
    }
}