package dev.clarine.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.clarine.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }
    fun displayTweets(){
        var tweet1=TweetData(" ","abc","@machakos","abcdf",488,678,89)
        var tweet2=TweetData(" ","abc","@machakos","abcdf",488,678,89)
        var tweet3=TweetData(" ","abc","@machakos","abcdf",488,678,89)
        var tweet4=TweetData(" ","abc","@machakos","abcdf",488,678,89)
        var tweetList= listOf<TweetData>(tweet1,tweet2,tweet3,tweet4)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        val tweetAdapter=TweetsRvAdapter(tweetList)
        binding.rvTweets.adapter=tweetAdapter
    }
}