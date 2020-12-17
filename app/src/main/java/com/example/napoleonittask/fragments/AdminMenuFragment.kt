package com.example.napoleonittask.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.napoleonittask.R
import com.example.napoleonittask.activities.DeleteAddActivity
import kotlinx.android.synthetic.main.fragment_admin_menu.*

class AdminMenuFragment : Fragment(R.layout.fragment_admin_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onclick()
    }

    fun onclick(){
        add_buton.setOnClickListener{
            startActivity(Intent(activity, DeleteAddActivity::class.java))
        }
    }
}