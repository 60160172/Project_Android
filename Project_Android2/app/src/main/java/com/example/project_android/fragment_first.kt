package com.example.project_android

import android.app.FragmentManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

/**
 * A simple [Fragment] subclass.
 */
class fragment_first : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_fragment_first, container, false)
        // Inflate the layout for this fragment

        val button : Button = view.findViewById(R.id.btnNextPage);

        button.setOnClickListener {

            Toast.makeText(context,"Change to fragment 2 Success", Toast.LENGTH_LONG).show()

            val fragment_first = Recycler_view()
            val fm = fragmentManager
            val transaction : FragmentTransaction = fm!!.beginTransaction()
            transaction.replace(R.id.layout, fragment_first,"Recycler_view")
            transaction.addToBackStack("fragment_list_view")
            transaction.commit()

        }
        val button2 : Button = view.findViewById(R.id.btnNextPage2);

        button2.setOnClickListener {

            Toast.makeText(context,"Change to fragment 2 Success", Toast.LENGTH_LONG).show()

            val MainChart = MainChart()
            val fk = fragmentManager
            val transaction : FragmentTransaction = fk!!.beginTransaction()
            transaction.replace(R.id.layout, MainChart,"fragment_MainChart")
            transaction.addToBackStack("fragment_MainChart")
            transaction.commit()

        }
        val button3 : Button = view.findViewById(R.id.btnNextPage3);

        button3.setOnClickListener {


            Toast.makeText(context,"Change to fragment 2 Success", Toast.LENGTH_LONG).show()

            val two = two()
            val fk = fragmentManager
            val transaction : FragmentTransaction = fk!!.beginTransaction()
            transaction.replace(R.id.layout, two,"fragment_two")
            transaction.addToBackStack("fragment_two")
            transaction.commit()


        }


        return view

    }

}
