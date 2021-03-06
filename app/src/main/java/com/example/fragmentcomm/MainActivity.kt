package com.example.fragmentcomm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        tabLayout.addTab(tabLayout.newTab().setText("Input"))
        tabLayout.addTab(tabLayout.newTab().setText("hasil Nama"))
        tabLayout.addTab(tabLayout.newTab().setText("Hasil Umur"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = ViewPagerAdapter(this, supportFragmentManager,
            tabLayout.tabCount)

        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}