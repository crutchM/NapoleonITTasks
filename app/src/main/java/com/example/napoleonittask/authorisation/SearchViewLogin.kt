package com.example.napoleonittask.authorisation

import moxy.MvpView
import moxy.viewstate.strategy.*
import moxy.viewstate.strategy.alias.Skip

interface SearchViewLogin : MvpView {

    @StateStrategyType(SkipStrategy::class)
    fun showLoginError()


    @StateStrategyType(SkipStrategy::class)
    fun showPasswordError()

    @StateStrategyType(AddToEndStrategy::class)
    fun goToActivity()
}


