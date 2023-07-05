package dev.clarine.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.clarine.twitterclone.databinding.TweetListItemBinding
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent


class TweetRvAdapter(private val tweetsList: List<TweetData>) : RecyclerView.Adapter<TweetsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        val binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        val tweet = tweetsList[position]
        holder.binding.apply {
            tvDisplay.text = tweet.displayName
            tvHandle.text = tweet.handle
            tvTweet.text = tweet.tweet
            tvReplyCount.text = tweet.replyCount.toString()
            tvLikeCount.text = tweet.likeCount.toString()
        }
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
    class TweetsViewHolder(val binding: TweetListItemBinding) : RecyclerView.ViewHolder(binding.root)
}

class TweetsViewHolder(val binding: TweetListItemBinding) : RecyclerView.ViewHolder(binding.root)