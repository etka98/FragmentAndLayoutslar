package com.example.fragmentandlayoutslar

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.first_screen_layout.view.*

class FragmentFirstScreen : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.first_screen_layout, container, false)

        view.changeBtn.setOnClickListener {
            var cont = context as FragmentActivity
            var mng = cont.supportFragmentManager
            var secondFragment = FragmentSecondScreen()
            var trans = mng.beginTransaction()
            trans.add(R.id.frameLayout, secondFragment, "secondFragment")
            trans.commit()

            var firstFragment = mng.findFragmentByTag("firstFragment")
            if(firstFragment != null){
                var trans2 = mng.beginTransaction()
                trans2.hide(firstFragment)
                trans2.commit()
            }

        }

        return view
    }
}