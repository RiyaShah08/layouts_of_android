package com.example.layouts_p6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class relative : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relativeactivity)

        bottomnavigate.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.linear -> {
                        val intent = Intent(this@relative, MainActivity::class.java)
                        startActivity(intent)
                    }

                    R.id.constraint -> {
                        val intent = Intent(this@relative, constraint::class.java)
                        startActivity(intent)
                    }

                    R.id.relative -> {
                        val intent = Intent(this@relative, relative::class.java)
                        startActivity(intent)
                    }
                }
                    return@OnNavigationItemSelectedListener true
                })
    }
}