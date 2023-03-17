package com.lars.biblialars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.lars.biblialars.adapter.ListAntiguoAdapter
import com.lars.biblialars.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var Binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)
        replaceFragment(Guardado())

        Binding.bottomNavigationView.setOnNavigationItemSelectedListener {

            when(it.itemId){
                R.id.guardado -> replaceFragment(Guardado())
                R.id.antiguo -> replaceFragment(Antiguo())
                R.id.nuevo -> replaceFragment(Nuevo())
                R.id.apoyo -> replaceFragment(Apoyo())

                else -> {

                }

            }
            true

        }
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.frame_layout,fragment)
        fragmentTransition.commit()
    }
}