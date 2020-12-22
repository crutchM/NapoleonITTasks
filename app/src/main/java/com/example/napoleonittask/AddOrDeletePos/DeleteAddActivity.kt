package com.example.napoleonittask.AddOrDeletePos

import android.os.Bundle
import com.example.napoleonittask.R
import moxy.MvpAppCompatActivity
import moxy.MvpView
import moxy.ktx.moxyPresenter
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

class DeleteAddActivity : MvpAppCompatActivity(), MvpView,
    DeleteAddView {
    private val presenter:DeleteAddPresenter by moxyPresenter { DeleteAddPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_delete_pos)
        presenter.chooseFUnctional(intent.getParcelableExtra("FROM"))
    }

    override fun chooseFunctionalAdd() {
        supportFragmentManager.beginTransaction().add(R.id.addDelete, AddFragment())
    }

    override fun chooseFunctionalDelete() {
        supportFragmentManager.beginTransaction().add(R.id.addDelete, DeleteFragment())
    }


}

interface DeleteAddView: MvpView{

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun chooseFunctionalAdd()

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun chooseFunctionalDelete()

}