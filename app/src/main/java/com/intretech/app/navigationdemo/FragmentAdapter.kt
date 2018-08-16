package com.intretech.app.navigationdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter



class FragmentAdapter(val fm : FragmentManager,val fragments : List<Fragment>) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragments.get(position).toString()
    }



}