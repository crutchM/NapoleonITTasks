package com.example.napoleonittask.MainMenu

import android.content.Intent
import android.os.Bundle
import com.example.napoleonittask.R
import com.example.napoleonittask.authorisation.AuthActivity
import moxy.MvpAppCompatActivity
import moxy.MvpView
import moxy.ktx.moxyPresenter
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

class MainActivity : MvpAppCompatActivity(), MvpView,
    MenuView {
    var premissions = 1;
    private val menuPresenter: MenuPresenter by moxyPresenter { MenuPresenter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main,
            MenuFragment()
        ).commit()
        
        if(!menuPresenter.authState)
            menuPresenter.CheckAuthorisation(true)
        menuPresenter.CheckPremissions(1)

    }

    override fun goToAuthScreen(){
        startActivity(Intent(this, AuthActivity::class.java))
    }

    override fun addAdminMenuFragment(){
        supportFragmentManager.beginTransaction().add(R.id.main,
            AdminMenuFragment()
        ).commit()
    }
}

interface MenuView : MvpView{
    @StateStrategyType(AddToEndStrategy::class)
    fun goToAuthScreen()

    @StateStrategyType(AddToEndStrategy::class)
    fun addAdminMenuFragment()
}

