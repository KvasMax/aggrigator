package mini.max.aggregator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mini.max.reddit.RedditFeature

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            RedditFeature.openScreen(supportFragmentManager, R.id.rootLayout)
        }
    }
}
