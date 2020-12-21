package com.example.napoleonittask.SearchViews

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType
import moxy.viewstate.strategy.alias.Skip

interface SearchViewLogin : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    @Skip
    fun showLoginError()

    @StateStrategyType(OneExecutionStateStrategy::class)
    @Skip
    fun showPasswordError()
}


