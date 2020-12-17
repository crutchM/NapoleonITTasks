package com.example.napoleonittask.Presenters
import com.example.napoleonittask.activities.AuthActivity
import com.example.napoleonittask.activities.SearchViews.SearchViewLogin
import moxy.MvpPresenter

class LoginPresenter : MvpPresenter<SearchViewLogin>() {

    private val chars : CharArray = "!@#$%^&*()_+=-?/.><,".toCharArray();
    fun validate(login: String, password: String )
    {
        val authActivity = AuthActivity();
        when{
            !loginIsCorrect(login) -> authActivity.showLoginError()
            !passWordIsCorrect(password) -> authActivity.showPasswordError()
        }
    }

    fun loginIsCorrect(login : String) : Boolean{
        login.forEach {
            if(chars.contains(it))
                return false
        }
        return true
    }

    fun passWordIsCorrect(password: String) :Boolean{
        return password.toIntOrNull() == null
    }
}