package com.iglo.jmo.activity

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.iglo.jmo.R
import com.iglo.jmo.activity.fragment.BeritaFragment
import com.iglo.jmo.activity.fragment.HomeFragment
import com.iglo.jmo.databinding.LayoutMenuBinding

class MenuActivity : AppCompatActivity() {
    lateinit var binding: LayoutMenuBinding
    val layoutResourceId : Int  = R.layout.layout_menu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(this), layoutResourceId, null,false
        )
        binding.lifecycleOwner = this
        setContentView(binding.root)

        val homeFragment = HomeFragment()
        val beritaFragment = BeritaFragment()

        setCurrentFragment(homeFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(homeFragment)
                R.id.berita->setCurrentFragment(beritaFragment)

            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}