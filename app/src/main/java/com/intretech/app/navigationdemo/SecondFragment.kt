package com.intretech.app.navigationdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*

class SecondFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first,null);
        onClick(view)
        Log.d("zyp"," second create")
        return view
    }

    fun onClick(view :View?){
        var btn = view!!.btn_second;
        btn.text ="second"
        btn.setOnClickListener(){
            Navigation.findNavController(view!!).navigate(R.id.test_fragment_second);
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("zyp"," second destroy")
    }
}