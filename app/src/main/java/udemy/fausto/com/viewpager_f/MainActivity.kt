package udemy.fausto.com.viewpager_f

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(FragmentOne(), "One")
        adapter.addFragment(FragmentTwo(), "Two")
        adapter.addFragment(FragmentThree(), "Three")
        adapter.addFragment(FragmentFour(), "Four")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }





}


