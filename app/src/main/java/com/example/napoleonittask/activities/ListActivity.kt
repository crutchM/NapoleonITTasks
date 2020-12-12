package com.example.napoleonittask.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.napoleonittask.Product
import com.example.napoleonittask.R
import com.example.napoleonittask.fragments.PosBarFragment

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_products)
        val product = Product(1, "майонез провонсаль", "мазик", 69, "https://otkorobki.ru/files/goods/11/1198126/52667_big.jpg")
        supportFragmentManager.beginTransaction().add(R.id.scrollView, PosBarFragment.newInstance(product))
                .commit()

    }
}