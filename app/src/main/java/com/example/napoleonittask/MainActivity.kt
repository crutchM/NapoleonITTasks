package com.example.napoleonittask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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
                val product = Product(id.text.toString().toInt(), name.text.toString(), type.text.toString(), count.text.toString().toInt());
                val intent = Intent(this, SecondActivity::class.java);
                intent.putExtra("product", product);
                startActivityForResult(intent, 0);
            } catch (e : Exception){
                Toast.makeText(this, "no input", Toast.LENGTH_SHORT).show();
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val newProduct = data?.getSerializableExtra("newProduct") as Product;
        id.setText(newProduct.index.toString());
        name.setText(newProduct.name);
        type.setText(newProduct.type);
        count.setText(newProduct.count.toString());
    }
}


