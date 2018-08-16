package com.intretech.app.navigationdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment(){

    lateinit var name : String

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first,null);
        onClick(view)
        Log.d("zyp","first create")
        return view
    }

    fun onClick(view :View){

       view?.btn_second?.setOnClickListener(){
           Navigation.findNavController(view!!).navigate(R.id.test_fragment_first);
       }

     view!!.btn_second.setOnTouchListener { v, motionEvent ->
         if (motionEvent.action == MotionEvent.ACTION_DOWN){

         }else if(motionEvent.action == MotionEvent.ACTION_UP){

         }

        false;
     }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("zyp","first destroy")
    }
}