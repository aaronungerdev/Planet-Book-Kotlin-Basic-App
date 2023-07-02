package com.unger.planetbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.unger.planetbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var planetList: ArrayList<Planets>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        planetList= ArrayList<Planets>()

        val earth = Planets("Earth",4.543f,R.drawable.earth)
        val neptune = Planets("Neptune",4.503f,R.drawable.neptune)
        val jupiter = Planets("Jupiter",4.603f,R.drawable.jupiter)
        val mercury = Planets("Mercury",4.503f,R.drawable.mercury)

        planetList.add(earth)
        planetList.add(neptune)
        planetList.add(jupiter)
        planetList.add(mercury)


        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val planetAdapter = PlanetAdapter(planetList)
        binding.recyclerView.adapter=planetAdapter


    }
}