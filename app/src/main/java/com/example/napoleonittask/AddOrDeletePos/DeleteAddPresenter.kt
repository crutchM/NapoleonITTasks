package com.example.napoleonittask.AddOrDeletePos

import com.example.napoleonittask.AddOrDeletePos.DeleteAddView
import moxy.MvpPresenter

class DeleteAddPresenter: MvpPresenter<DeleteAddView>() {

    fun chooseFUnctional(state : String){
        when{
            state == "ADD" -> viewState.chooseFunctionalAdd()
            state == "DELETE" -> viewState.chooseFunctionalDelete()
        }
    }
}