package com.example.napoleonittask.authorisation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.napoleonittask.MainMenu.MainActivity
import com.example.napoleonittask.R
import kotlinx.android.synthetic.main.activity_authorisation.*
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class AuthActivity : MvpAppCompatActivity(),
    SearchViewLogin {
    private val presenter: LoginPresenter by moxyPresenter { LoginPresenter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorisation)
        login.setOnClickListener{
                presenter.validate(loginField.text.toString(), passwordField.text.toString())

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

    override fun goToActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("AUTH", "true")
        startActivity(intent)
    }

}
