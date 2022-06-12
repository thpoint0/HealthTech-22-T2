package com.example.mhapp4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mhapp4.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment
        val navController = navHostFragment.navController
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_favorites, R.id.navigation_library, R.id.navigation_rooms, R.id.navigation_trends))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val selectedImage = findViewById<ImageView>(R.id.RecommendedScrollImage1)
        selectedImage.setClickable(true)
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        selectedImage.setOnClickListener(View.OnClickListener { // Intent class will help to go to next activity using
            // it's object named intent.
            // SecondActivty is the name of new created EmptyActivity.
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        })
    }
}
