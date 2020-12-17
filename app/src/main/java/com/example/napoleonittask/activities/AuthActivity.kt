package com.example.napoleonittask.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.napoleonittask.Presenters.LoginPresenter
import com.example.napoleonittask.R
import com.example.napoleonittask.activities.SearchViews.SearchViewLogin
import kotlinx.android.synthetic.main.activity_authorisation.*

class AuthActivity : AppCompatActivity(), SearchViewLogin {
    private val presenter = LoginPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorisation)
        login.setOnClickListener{
            presenter.validate(loginField.text.toString(), passwordField.text.toString())
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("auth", "true")
                startActivity(intent)
            }
        }

    private fun showErrorToast(name: String)
    {
        Toast.makeText(this, "ошибка в поле: $name", Toast.LENGTH_SHORT).show();
    }

    override fun showLoginError() {
        showErrorToast("логин")
    }

    override fun showPasswordError() {
        showErrorToast("пароль")
    }

}
