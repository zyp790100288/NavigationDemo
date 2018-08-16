package com.intretech.app.navigationdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NavigationActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation);

    }

  /*  override fun onSupportNavigateUp(): Boolean {
        return  return Navigation.findNavController(this@NavigationActivity, R.id.my_nav_host_fragment).navigateUp();
    }*/
}