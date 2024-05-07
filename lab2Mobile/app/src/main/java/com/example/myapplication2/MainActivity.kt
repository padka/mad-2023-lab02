package com.example.myapplication2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Получаем ссылки на виджеты по их идентификаторам
        val textView: TextView = findViewById(R.id.helloWorldText)
        val imageView: ImageView = findViewById(R.id.helloWorldImage)

        // Применяем отступы системных панелей к textView и imageView
        applySystemInsetsToView(textView)
        applySystemInsetsToView(imageView)
    }

    // Функция для установки слушателя отступов для view
    private fun applySystemInsetsToView(view: View) {
        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
