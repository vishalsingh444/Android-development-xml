package com.vishalsingh444888.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.vishalsingh444888.testapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btnApply.setOnClickListener {
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()
            val birthDate = binding.birthDate.text.toString()
            val country = binding.country.text.toString()
            Log.d("MainActivity","$firstName $lastName, born on $birthDate, from $country just applied to the form")
        }

    }
}