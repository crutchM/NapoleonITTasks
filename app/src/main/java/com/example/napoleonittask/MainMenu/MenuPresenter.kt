package com.example.napoleonittask.MainMenu

import com.example.napoleonittask.MainMenu.MenuView
import moxy.MvpPresenter

class MenuPresenter : MvpPresenter<MenuView>(){

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