package com.example.napoleonittask.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.napoleonittask.data.Product
import com.example.napoleonittask.R
import com.example.napoleonittask.activities.MoreInfoActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_position_bar.*

class PosBarFragment : Fragment(R.layout.fragment_position_bar) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var product = arguments?.getParcelable<Product>("PRODUCT")
        Picasso.get().load(product?.url).into(productImage)
        textView.setText(product?.index.toString() + "\n" + product?.name)
        oncLick(product!!)

    }

    fun oncLick(jopa : Product){
        view?.setOnClickListener{
            val newAct = Intent(activity, MoreInfoActivity::class.java)
            newAct.putExtra("PRODUCT", jopa)
            startActivity(newAct)
        }
    }
    companion object {
        fun newInstance(product: Product): PosBarFragment {
            val args = Bundle().apply { putParcelable("PRODUCT", product) }
            val fragment = PosBarFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
