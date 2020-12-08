package by.kharaneka.androidacademymovies

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.card.MaterialCardView

class FragmentMoviesList: Fragment() {
    private var cardMovieClickListener: ClickListenerMoviesList? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)

        view?.findViewById<MaterialCardView>(R.id.card_movie)?.apply {
            setOnClickListener{
                cardMovieClickListener?.showMovieDetailsClickMovieCard()
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ClickListenerMoviesList){
            cardMovieClickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        cardMovieClickListener = null
    }
}