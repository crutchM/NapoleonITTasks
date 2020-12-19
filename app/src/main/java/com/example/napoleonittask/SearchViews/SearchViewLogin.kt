package com.example.napoleonittask.SearchViews

import moxy.MvpView
import moxy.viewstate.strategy.alias.Skip

interface SearchViewLogin : MvpView {
    @Skip
    fun showLoginError()

    @Skip
    fun showPasswordError()
}


