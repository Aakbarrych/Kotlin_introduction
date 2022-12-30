package com.example.kotlinintroduction3month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinintroduction3month.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.container, MusicFragment()).commit()
        }

    }
}