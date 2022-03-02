package orlando.camacho.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var movies: ArrayList<Movie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fill_movies()
        var adapter = MoviesAdapter(this, movies)
        var listView: ListView = findViewById(R.id.listy)
        listView.adapter = adapter
    }

    fun fill_movies(){
        movies.add(Movie(1, getString(R.string.mov1), getString(R.string.mov1_desc), 119, R.drawable._917))
        movies.add(Movie(2, getString(R.string.mov2), getString(R.string.mov2_desc), 102, R.drawable.bighero6))
        movies.add(Movie(3, getString(R.string.mov3), getString(R.string.mov3_desc), 148, R.drawable.inception))
        movies.add(Movie(4, getString(R.string.mov4), getString(R.string.mov4_desc), 100, R.drawable.leapyear))
        movies.add(Movie(5, getString(R.string.mov5), getString(R.string.mov5_desc), 98, R.drawable.mib))
    }
}