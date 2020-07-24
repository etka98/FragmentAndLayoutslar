package com.example.fragmentandlayoutslar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var firstFragment : FragmentFirstScreen
    var mng = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = FragmentFirstScreen()
        var trans = mng.beginTransaction()
        trans.add(R.id.frameLayout, firstFragment, "firstFragment")
        trans.commit()

    }
}