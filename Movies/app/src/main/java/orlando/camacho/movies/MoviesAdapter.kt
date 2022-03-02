package orlando.camacho.movies

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MoviesAdapter: BaseAdapter {
    lateinit var context: Context
    var movies:ArrayList<Movie> = ArrayList()

    constructor(context: Context, movies:ArrayList<Movie>){
        this.context = context
        this.movies = movies
    }

    override fun getCount(): Int {
        return movies.size
    }

    override fun getItem(p0: Int): Any {
        return movies[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflator = LayoutInflater.from(context)
        var view = inflator.inflate(R.layout.movie_view, null)

        var image: ImageView = view.findViewById(R.id.img_view)
        var title: TextView = view.findViewById(R.id.tv_name)

        var movie:Movie = movies[p0]

        image.setImageResource(movie.img)
        title.setText(movie.name)

        return view
    }
}