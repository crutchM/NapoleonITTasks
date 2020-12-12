package com.example.napoleonittask.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.napoleonittask.R
import com.example.napoleonittask.activities.ListActivity
import com.example.napoleonittask.activities.ModSearchActivity
import kotlinx.android.synthetic.main.fragment_menu.*

class MenuFragment : Fragment(R.layout.fragment_menu){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    fun onClick(){
        full_list.setOnClickListener{
            val intent = Intent(activity, ListActivity::class.java)
            startActivity(intent)
        }

        mod_search.setOnClickListener{
            val intent = Intent(activity, ModSearchActivity::class.java)
            startActivity(intent)
        }
    }
}