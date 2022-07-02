package com.example.fragmentcomm

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

@Suppress("DEPRECATION")
class ViewPagerAdapter (var contex: Context, fm: FragmentManager, var totalTabs: Int) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> thirdFragment()
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }

}