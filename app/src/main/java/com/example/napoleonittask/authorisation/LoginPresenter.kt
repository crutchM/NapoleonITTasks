package com.example.napoleonittask.authorisation
import moxy.MvpPresenter


class LoginPresenter : MvpPresenter<SearchViewLogin>() {

    private val chars : CharArray = "!@#$%^&*()_+=-?/.><,".toCharArray()

    fun validate(login: String, password: String )
    {

        when{
            !loginIsCorrect(login) -> viewState.showLoginError()
            !passWordIsCorrect(password) -> viewState.showPasswordError()
            else ->{
                viewState.goToActivity()

            }

        }

    }

    fun loginIsCorrect(login : String) : Boolean{
        if(login == null) return false
        login.forEach {
            if(chars.contains(it))
                return false
        }
        return true
    }


     fun passWordIsCorrect(password: String) :Boolean{
         return password.toIntOrNull() == null || password == null
    }
}