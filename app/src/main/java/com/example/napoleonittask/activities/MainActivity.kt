package com.example.napoleonittask.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.napoleonittask.R
import com.example.napoleonittask.fragments.MenuFragment

class MainActivity : AppCompatActivity() {
    val premissions = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main, MenuFragment()).commit()

    }


}


