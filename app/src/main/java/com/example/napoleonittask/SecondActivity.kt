package com.example.napoleonittask

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        addData();
        getChangedData();
    }

    private fun addData(){
        var product = intent.getSerializableExtra("product") as Product;
        et1.setText(product.name);
        et2.setText(product.type);
        et3.setText(product.index.toString());
        et4.setText(product.count.toString());
    }

    private fun getChangedData(){
        button.setOnClickListener(){
            val newProduct = Product(et3.text.toString().toInt(), et1.text.toString(), et2.text.toString(), et4.text.toString().toInt());
            val inten0 = Intent();
            inten0.putExtra("newProduct", newProduct);
            setResult(Activity.RESULT_OK, inten0);
            finish();
        }
    }
}