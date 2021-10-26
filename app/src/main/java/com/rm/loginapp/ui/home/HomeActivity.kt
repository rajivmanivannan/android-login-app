package com.rm.loginapp.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rm.loginapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

  private lateinit var binding: ActivityHomeBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityHomeBinding.inflate(layoutInflater)
    setContentView(binding.root)
  }
}