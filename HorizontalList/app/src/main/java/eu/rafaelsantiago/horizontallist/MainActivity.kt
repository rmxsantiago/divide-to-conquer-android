package eu.rafaelsantiago.horizontallist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerViewAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    private val listOfCountries = listOf( "Argentina", "Bolivia", "Brazil", "Chile",
            "Colombia", "Ecuador", "French Guiana", "Guyana", "Paraguay", "Peru",
            "Suriname", "Uruguay", "Venezuela")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        viewAdapter = RecyclerViewAdapter(listOfCountries)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)?.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }!!
    }
}