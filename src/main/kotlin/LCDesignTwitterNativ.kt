
data class TweetN(
    val tweetID: Long
)

data class UserN(
    val userID: Long,
    val userTweets: MutableList<TweetN>,
    val userFollows: MutableList<Long>, // a list of users this user follows
)

// getTweetsByUserId(userId)
class TwitterN {

    private val userList = mutableListOf<UserN>()

    fun postTweet(userId: Long, tweetId: Long) {
        var user: UserN? = null
        userList.all { it.userID != userId }.let {
            if (it) {
                user = UserN(userId, mutableListOf(), mutableListOf()) // ?how would u call this val?
                userList.add(user!!)
            }
        }

        val tweet = TweetN(tweetId)
        user?.userTweets?.add(tweet)
    }

    fun follow(followerId: Long, followeeId: Long) { // this fun does two things:
        for (user in userList) { // we will loop over the userList
            if (followerId == user.userID) { // when we find the follower (ex user 1) in the user list we will
                user.userFollows.add(followeeId) // add the followee (ex user 2) to user 1 list of who they follow
            }
        }
    }

    fun unfollow(followerId: Long, followeeId: Long) { // this will again perform two actions:
        for (user in userList) {
            if (followerId == user.userID) {
                user.userFollows.remove(followeeId)
            }
        }
    }

    fun getNewsFeed(userId: Long): List<Long> { // this fun returns a sorted list of tweets by users the user follows or by the user itself
        val newsFeed = mutableListOf<Long>()

        for (user in userList) { // N * K * M
            if (userId == user.userID) {
                for (tweet in user.userTweets) { // second loop finds the userTweets and adds them to our empty list
                    newsFeed.add(tweet.tweetID)
                }
                for (userFollowId in user.userFollows) {
                    val userFollow = getUserByID(userFollowId) ?: break
                    for (userFollowTweet in userFollow.userTweets) {
                        newsFeed.add(userFollowTweet.tweetID)
                    }
                }
            }
        }

        println(newsFeed.sortedDescending())
        return newsFeed.sortedDescending().take(10)

    }

    private fun getUserByID(userId: Long): UserN? {
        return userList.find { it.userID == userId }
    }
}