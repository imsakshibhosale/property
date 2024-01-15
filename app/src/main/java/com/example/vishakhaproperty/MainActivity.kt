package com.example.vishakhaproperty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import android.view.Menu



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the SearchView
        val searchView = findViewById<SearchView>(R.id.searchView)

        // Set up a listener to react to query changes
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Handle the search query submission (e.g., perform a search)
                performSearch(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Handle the search query text change (optional)
                return true
            }
        })
    }

    private fun performSearch(query: String?) {
        // Implement your search logic here
        // You can use the query parameter to perform a search operation
        // For example, update a RecyclerView adapter based on the search query
    }

    // Other methods and overrides...

}




