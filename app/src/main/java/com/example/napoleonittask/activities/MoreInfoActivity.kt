package com.example.napoleonittask.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.napoleonittask.data.Product
import com.example.napoleonittask.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_more_info.*

class MoreInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_info)
        val newProduct = intent.getParcelableExtra<Product>("PRODUCT")
        Picasso.get().load(newProduct!!.url).into(picture)
        moreInfo.text = "id: " + newProduct.index.toString() + "\n" + "name: " + newProduct.name + "\n" + "type: " + newProduct.type + "\n" + "count: " + newProduct.count.toString()
        goBack.setOnClickListener{
            finish()
        }
    }
}