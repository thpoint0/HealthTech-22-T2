package com.example.mhapp4

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aemerse.slider.ImageCarousel
import com.aemerse.slider.model.CarouselItem
import com.example.mhapp4.databinding.ActivityMainBinding
import com.example.mhapp4.model.Song
import com.example.mhapp4.model.SongAdapter
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    lateinit var songs: ArrayList<Song>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

//        val navView: BottomNavigationView = binding.navView
//
//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(setOf(
//            R.id.navigation_favorites, R.id.navigation_library, R.id.navigation_trends, R.id.navigation_rooms))
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)

        // Lookup the recyclerview in activity layout
//        val rvContacts = findViewById<View>(R.id.songLists) as RecyclerView
//        // Initialize contacts
//        songs = Song.createSongList(20)
//        // Create adapter passing in the sample user data
//        val adapter = SongAdapter(songs)
//        // Attach the adapter to the recyclerview to populate items
//        rvContacts.adapter = adapter
//        // Set layout manager to position the items
//        rvContacts.layoutManager = LinearLayoutManager(this)
        // That's all!

//        val recyclerView = findViewById<RecyclerView>(R.id.songLists)
//        recyclerView.itemAnimator = SlideInLeftAnimator()




//        // Kotlin
//        val carousel: ImageCarousel = findViewById(R.id.carousel)
//
//// Register lifecycle. For activity this will be lifecycle/getLifecycle() and for fragment it will be viewLifecycleOwner/getViewLifecycleOwner().
//        carousel.registerLifecycle(lifecycle)
//
//        val list = mutableListOf<CarouselItem>()
//
//// Image URL with caption
//        list.add(
//            CarouselItem(
//                imageUrl = "https://images.unsplash.com/photo-1532581291347-9c39cf10a73c?w=1080",
//                caption = "Photo by Aaron Wu on Unsplash"
//            )
//        )
//
//// Just image URL
//        list.add(
//            CarouselItem(
//                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080"
//            )
//        )
//
//// Image URL with header
//        val headers = mutableMapOf<String, String>()
//        headers["header_key"] = "header_value"
//
//        list.add(
//            CarouselItem(
//                imageUrl = "https://images.unsplash.com/photo-1534447677768-be436bb09401?w=1080",
//                headers = headers
//            )
//        )
//
//// Image drawable with caption
//        list.add(
//            CarouselItem(
//                imageDrawable = R.drawable.ic_home_black_24dp,
//                caption = "Photo by Kimiya Oveisi on Unsplash"
//            )
//        )
//
//// Just image drawable
//        list.add(
//            CarouselItem(
//                imageDrawable = R.drawable.ic_notifications_black_24dp
//            )
//        )
//
//// ...
//
//        carousel.setData(list)

    }
}