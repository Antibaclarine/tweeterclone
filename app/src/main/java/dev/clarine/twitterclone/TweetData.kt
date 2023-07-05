package dev.clarine.twitterclone

data class TweetData(
    var avatar:String,
    var displayName:String,
    var handle:String,
    var tweet:String,
    var replyCount:Int,
    var rtcount:Int,var likeCount:Int
)
