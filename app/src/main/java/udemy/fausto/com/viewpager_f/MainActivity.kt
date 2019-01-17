package udemy.fausto.com.viewpager_f

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.widget.DialogTitle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MyViewPageAdapter(supportFragmentManager)

        adapter.addFragment(FragmentOne(), "One")
        adapter.addFragment(FragmentTwo(), "Two")
        adapter.addFragment(FragmentThree(), "Three")
        adapter.addFragment(FragmentFour(), "Four")

        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }



    class MyViewPageAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager)  {

        private val  fragmentList: MutableList<Fragment> = ArrayList()
        private val  titleList: MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }

    }

}
