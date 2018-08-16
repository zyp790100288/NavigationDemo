package com.intretech.app.navigationdemo



import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_viewpager_bar.*
import java.util.*

/**
 * BottomNavigationView  +  Viewpager
 *
 */
class NavigationBarViewPagerActivity : AppCompatActivity(){
    var fragmentAdapter : FragmentAdapter? = null
    var fragments : MutableList<Fragment>? = null;

    var titles : List<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager_bar)
        fragments = ArrayList();
        fragments!!.add(BottomFirstFragment())
        fragments!!.add(BottomSecondFragment())
        fragments!!.add(BottomThirdFragment())
        fragmentAdapter = FragmentAdapter(supportFragmentManager,fragments!!)
        vp_fragment.adapter = fragmentAdapter
        vp_fragment.offscreenPageLimit = 3

        btn_nav_viewpage.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home -> vp_fragment.setCurrentItem(0)
                R.id.navigation_dashboard  -> vp_fragment.setCurrentItem(1)
                R.id.navigation_notifications -> vp_fragment.setCurrentItem(2)
                else -> Log.d("","")
            }
            true
        }

    /*    btn_nav_viewpage.setOnNavigationItemSelectedListener(object : BottomNavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(p0: MenuItem): Boolean {
                when (p0.itemId) {
                    R.id.navigation_home -> vp_fragment.setCurrentItem(0)
                    R.id.navigation_dashboard -> vp_fragment.setCurrentItem(1)
                    R.id.navigation_notifications -> vp_fragment.setCurrentItem(2)
                    else -> Log.d("", "")
                }
              return   true
            }}
            )*/



     vp_fragment.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
         override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

         }

         override fun onPageScrollStateChanged(state: Int) {

         }

         override fun onPageSelected(position: Int) {
            btn_nav_viewpage.menu.getItem(position).setChecked(true)
         }
     });





    }



}