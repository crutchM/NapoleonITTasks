package com.example.napoleonittask.MainMenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.napoleonittask.R
import com.example.napoleonittask.AddOrDeletePos.DeleteAddActivity
import kotlinx.android.synthetic.main.fragment_admin_menu.*

class AdminMenuFragment : Fragment(R.layout.fragment_admin_menu) {
    private var addOrDeleteActivity = ""
    private val intent =Intent(activity, DeleteAddActivity::class.java)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onclick()
    }

    fun onclick(){
        add_buton.setOnClickListener{
            intent.putExtra("FROM","ADD")
            startActivity(intent)
        }

        delete_buton.setOnClickListener{
            intent.putExtra("FROM", "DELETE")
            startActivity(Intent(activity, DeleteAddActivity::class.java))
        }
    }
}