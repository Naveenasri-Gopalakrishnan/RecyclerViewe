package com.example.recyclerviewe

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import java.util.ArrayList
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class FirstFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById<Button>(R.id.btn_frag)

        btn.setOnClickListener {

            val i = Intent(this@FirstFragment,SecondFragment::class.java)
            startActivity(i)

            btn.visibility = View.GONE
        }
    }


    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager

        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.frame_layout, fragment)

        fragmentTransaction.commit()
    }
}
