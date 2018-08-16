package com.intretech.app.navigationdemo



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_navigation_bar.*

/**
 * BottomNavigationView  +  Navigation
 *  fragment 切换时会create和destroy
 */
class NavigationBarActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_bar)
        var naviHostFragment : NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_bar_host_fragment) as NavHostFragment
        var navController = naviHostFragment.navController
        NavigationUI.setupWithNavController(btn_nav,navController)




    }



}