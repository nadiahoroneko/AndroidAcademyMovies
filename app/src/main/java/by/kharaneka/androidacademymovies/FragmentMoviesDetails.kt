package by.kharaneka.androidacademymovies

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentMoviesDetails: Fragment() {
    private var backClickListner: ClickListenerMovieDetails? = null

    override fun onCreateView(
            inflater: LayoutInflater, //преобразует во  View
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View?{
        val view = inflater.inflate(R.layout.fragment_movies_detail, container, false)

        view?.findViewById<TextView>(R.id.tv_back)?.apply {
            setOnClickListener{
                backClickListner?.backClick()
            }
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ClickListenerMovieDetails){
            backClickListner = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        backClickListner = null
    }
}