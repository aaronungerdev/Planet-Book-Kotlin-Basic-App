package com.unger.planetbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unger.planetbookkotlin.databinding.ActivityDetailsBinding
import com.unger.planetbookkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val planet = intent.getSerializableExtra("planet") as Planets
        binding.planetName.text = planet.name
        binding.age.text = planet.age.toString()
        binding.imageView.setImageResource(planet.image)
    }
}