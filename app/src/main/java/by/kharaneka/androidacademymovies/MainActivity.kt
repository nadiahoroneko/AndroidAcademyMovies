package by.kharaneka.androidacademymovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.TextView
import java.lang.reflect.Array.newInstance
import java.net.URLClassLoader.newInstance


class MainActivity : AppCompatActivity(), ClickListenerMoviesList, ClickListenerMovieDetails {
    private var fragmentMoviesList: FragmentMoviesList? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {
            fragmentMoviesList = FragmentMoviesList()
            fragmentMoviesList?.apply {
                supportFragmentManager.beginTransaction()
                        .add(R.id.main_fragment, this, FRAGMENT_MOVIES_LIST_TAG)
                        .commit()
            }
        } else{
            fragmentMoviesList = supportFragmentManager.findFragmentByTag(FRAGMENT_MOVIES_LIST_TAG) as? FragmentMoviesList
        }
    }

    override fun showMovieDetailsClickMovieCard() {
        supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.main_fragment, FragmentMoviesDetails())
                .commit()
    }

    override fun backClick() {
        onBackPressed()
    }

    companion object{
        const val FRAGMENT_MOVIES_LIST_TAG = "FragmentMoviesList"
    }


}