package com.example.napoleonittask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private var product : Product? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener();
    }

    private fun setListener(){
        add.setOnClickListener{
            try {
                val product = Product(id.getText().toString().toInt(), name.getText().toString(), type.getText().toString(), count.getText().toString().toInt());
                val intent = Intent(this, SecondActivity::class.java);

            } catch (e : Exception){}
        }
    }
}


