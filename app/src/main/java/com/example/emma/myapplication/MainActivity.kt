package com.example.emma.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persoa:ArrayList<Persoa>? = null
    var lista:RecyclerView? = null
    var layoutManager:RecyclerView.LayoutManager? = null
    var adaptador:AdaptadorCustom? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        persoa = ArrayList()
        persoa?.add(Persoa("Juan",R.drawable.platillo1))
        persoa?.add(Persoa("Juan",R.drawable.platillo2))
        persoa?.add(Persoa("Juan",R.drawable.platillo3))
        persoa?.add(Persoa("Juan",R.drawable.platillo4))
        persoa?.add(Persoa("Juan",R.drawable.platillo5))
        persoa?.add(Persoa("Juan",R.drawable.platillo5))
        persoa?.add(Persoa("Juan",R.drawable.platillo7))
        persoa?.add(Persoa("Juan",R.drawable.platillo8))
        persoa?.add(Persoa("Juan",R.drawable.platillo1))

        lista = findViewById(R.id.lista)
        layoutManager = LinearLayoutManager(this)
        adaptador = AdaptadorCustom(persoa!!)
        lista?.layoutManager = layoutManager
        lista?.adapter = adaptador
    }
}
