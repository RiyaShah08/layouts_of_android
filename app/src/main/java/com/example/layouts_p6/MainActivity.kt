package com.example.layouts_p6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomnavigate.setOnNavigationItemSelectedListener(
                BottomNavigationView.OnNavigationItemSelectedListener {
                    when(it.itemId) {
                        R.id.linear -> {
                            val intent = Intent(this@MainActivity, MainActivity::class.java)
                            startActivity(intent)
                        }

                        R.id.constraint -> {
                            val intent = Intent(this@MainActivity, constraint::class.java)
                            startActivity(intent)
                        }

                        R.id.relative -> {
                            val intent = Intent(this@MainActivity, relative::class.java)
                            startActivity(intent)
                        }
                    }
                        return@OnNavigationItemSelectedListener true
                })
    }
}