package by.kharaneka.androidacademymovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_detail: TextView = findViewById(R.id.tv_details_movie)
        tv_detail.setOnClickListener { moveToMovieDetail() }
    }

    private fun moveToMovieDetail() {
        val intent: Intent = Intent(this,MovieDetailsActivity::class.java)
        startActivity(intent)
    }
}