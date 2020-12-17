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
        var auth = "null"
        val intent = Intent(this, AuthActivity::class.java)
        if (auth == null) {
            startActivity(intent)
            val newauth = intent.getParcelableExtra<Parcelable>("auth")
            auth = newauth.toString()
        }
        supportFragmentManager.beginTransaction().add(R.id.main, MenuFragment()).commit()
        if(premissions == 1)
            supportFragmentManager.beginTransaction().add(R.id.main, AdminMenuFragment()).commit()
    }
}


