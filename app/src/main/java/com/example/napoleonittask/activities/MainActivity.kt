package com.example.napoleonittask.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.example.napoleonittask.R
import com.example.napoleonittask.fragments.AdminMenuFragment
import com.example.napoleonittask.fragments.MenuFragment

class MainActivity : AppCompatActivity() {
    var premissions = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var auth = true
        val intent = Intent(this, AuthActivity::class.java)
        if (auth) {
            startActivity(intent)
            val newauth = intent.getParcelableExtra<Parcelable>("auth")
        }
        supportFragmentManager.beginTransaction().add(R.id.main, MenuFragment()).commit()
        if(premissions == 1)
            supportFragmentManager.beginTransaction().add(R.id.main, AdminMenuFragment()).commit()
    }
}


