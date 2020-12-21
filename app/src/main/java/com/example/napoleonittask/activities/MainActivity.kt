package com.example.napoleonittask.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.example.napoleonittask.Presenters.MenuPresenter
import com.example.napoleonittask.R
import com.example.napoleonittask.fragments.AdminMenuFragment
import com.example.napoleonittask.fragments.MenuFragment
import moxy.MvpView

class MainActivity : AppCompatActivity(), MvpView{
    var premissions = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main, MenuFragment()).commit()
        val MenuPresenter = MenuPresenter();
        if(!MenuPresenter.authState)
            MenuPresenter.CheckAuthorisation(false)
        MenuPresenter.CheckPremissions(1);
    }

    fun goToAuthScreen(){
        startActivity(Intent(this, AuthActivity::class.java))
    }

    fun addAdminMenuFragment(){
        supportFragmentManager.beginTransaction().add(R.id.main, AdminMenuFragment()).commit()
    }
}


