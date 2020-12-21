package com.example.napoleonittask.Presenters

import android.content.Intent
import com.example.napoleonittask.activities.MainActivity
import moxy.MvpPresenter

class MenuPresenter : MvpPresenter<MainActivity>(){

    var authState = false

    fun CheckAuthorisation(auth : Boolean)
    {
        authState = auth
        if(!authState)
            viewState.goToAuthScreen()
    }

    fun CheckPremissions(premission : Int) {
        if (premission == 1)
            viewState.addAdminMenuFragment()
    }
}