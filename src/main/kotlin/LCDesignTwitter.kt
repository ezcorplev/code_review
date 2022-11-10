

// class post
// tweetID Systemtomill
// tweetTitle
// tweetUser

// class user
// listOf (posts)
// userID
// follows -> listOf (userID)
// followers -> listOf (userID)

data class Tweet(
    val tweetID: Long,
    val tweetUserID: Long
)

data class User(
    val userID: Long,
    val userTweets: MutableList<Tweet>,
    val userFollows: MutableList<Long>, // a list of users this user follows
    val userFollowers: MutableList<Long> // a list of users that follow this user
)

class Twitter {

    private val userList = mutableListOf<User>()

    fun postTweet(userId: Long, tweetId: Long) {

        var doesUserExistAlready = false // flag, rn user does not exist

        for (user in userList) {

            if (user.userID == userId) { // ?does this loop the entire list if user does not exist?
                doesUserExistAlready = true // user does exist in the list, flag changes to true
                break
            }
        }



        if (doesUserExistAlready) { // flag is true user exists
            for (user in userList) {
                if (user.userID == userId) {
                    val tweet = Tweet(tweetId,userId)

                    user.userTweets.add(tweet)
                    break // we know user exists in userList, add tweet to user.userTweets
                }
            }
        } else {
            val tweet = Tweet(tweetId,userId)
            val user = User(userId, mutableListOf(tweet), mutableListOf(), mutableListOf()) // ?how would u call this val?

            userList.add(user) // this creates
            // a new user in the userList + adds the tweet to said user.userTweets BOOM
        }


    }

    fun getNewsFeed(userId: Long): List<Long> { // this fun returns a sorted list of tweets by users the user follows or by the user itself
        // ex user 1 follows user 2 and 3
        // user 3 posts tweetId 45
        // user 2 posts tweetId 46
        // user 3 posts another tweetId 47
        // user 1 posts tweetId 48
        // user 1 getsNewsFeed(1) will receive: 48, 47, 46, 45
        // we need to take the userId, look at their userFollows list, then take from that list the users they follow
        // and get all their tweetIds from their tweets, plus the user's tweets themselves. add everything to one big list
        // and return that list

        val newsFeed = mutableListOf<Long>()
        val userFollows = mutableListOf<Long>()

        for (user in userList) { // first loop loops the userList to find the user
            if (userId == user.userID) {
                for (tweet in user.userTweets) { // second loop finds the userTweets and adds them to our empty list
                    newsFeed.add(tweet.tweetID)
                }
            }
            break
        } // now our list contains all tweets by the user (ex (20,22))

        for (user in userList) {
            if (userId == user.userID) {
                for (follow in user.userFollows) { // second loop finds the userFollows and adds them to a temp list
                    userFollows.add(follow) // now we will have a list of users the user follows (ex follows user 2 and 3)
                }
            }
            break
        }

        for (user in userList) {
            for (tweet in user.userTweets) {
                for (follow in userFollows) {
                    if (tweet.tweetUserID == follow) {
                        newsFeed.add(tweet.tweetID) // no way this works
                    }
                }
            }
        }

        println(newsFeed.sorted())
        return newsFeed.sorted()

    }

    fun follow(followerId: Long, followeeId: Long) { // this fun does two things:
        // user1 (followerId) follows user2 (followeeId), so now followerId gets a followeeId in their user.userFollows mutableList
        // the same for user2 (followeeId), who now gets a followerId in their user.userFollowers mutableList

        if (followerId == followeeId) {
            println("A user cannot follow itself")
            return
        }

        for (user in userList) { // we will loop over the userList

            if (followerId == user.userID) { // when we find the follower (ex user 1) in the user list we will
                user.userFollows.add(followeeId) // add the followee (ex user 2) to user 1 list of who they follow
                break // once we find a match, no need to continue looping
            }

        }

        for (user in userList) { // we will loop over the userList

            if (followeeId == user.userID) {
                user.userFollowers.add(followerId)
                break
            }
        }




    }

    fun unfollow(followerId: Long, followeeId: Long) { // this will again perform two actions:
        // ex user 1 unfollows user 2 -> first we remove user 2 from user 1's list of userFollows
        // then we remove user 1 from user 2's list of userFollowers

        if (followerId == followeeId) {
            println("A user cannot unfollow itself")
            return
        }

        for (user in userList) {
            if (followerId == user.userID) {
                user.userFollows.remove(followeeId)
                break
            }
        }

        for (user in userList) {
            if (followeeId == user.userID) {
                user.userFollowers.remove(followerId)
                break
            }
        }

    }

}

fun main() {
    val twitter = Twitter()
    twitter.postTweet(1, 20)
    twitter.postTweet(2, 21)
    twitter.postTweet(1, 22)
    twitter.postTweet(3, 23)
    twitter.postTweet(4, 24)
    twitter.postTweet(3, 25)
    twitter.postTweet(2, 26)
    twitter.follow(1, 2) // user 1 follows user 2
    twitter.follow(1, 3) // user 1 follows user 3
    twitter.follow(3, 1) // user 3 follows user 1
    twitter.getNewsFeed(1) // should get (20, 21, 22, 23, 25, 26)
    twitter.unfollow(1,2) // user 1 unfollows user 2
    twitter.postTweet(3, 27)
    twitter.getNewsFeed(1) // should get (20, 22, 23, 25, 27)

}



//Design a simplified version of Twitter where users can post tweets, follow/unfollow another user, and is able to see the 10 most recent tweets in the user's news feed.
//
//Implement the Twitter class:
//
//Twitter() Initializes your twitter object.
//void postTweet(int userId, int tweetId) Composes a new tweet with ID tweetId by the user userId. Each call to this function will be made with a unique tweetId.
//List<Integer> getNewsFeed(int userId) Retrieves the 10 most recent tweet IDs in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user themself. Tweets must be ordered from most recent to least recent.
//void follow(int followerId, int followeeId) The user with ID followerId started following the user with ID followeeId.
//void unfollow(int followerId, int followeeId) The user with ID followerId started unfollowing the user with ID followeeId.
//
//
//Example 1:
//
//Input
//["Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow", "getNewsFeed"]
//[[], [1, 5], [1], [1, 2], [2, 6], [1], [1, 2], [1]]
//Output
//[null, null, [5], null, null, [6, 5], null, [5]]
//
//Explanation
//Twitter twitter = new Twitter();
//twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
//twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
//twitter.follow(1, 2);    // User 1 follows user 2.
//twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
//twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
//twitter.unfollow(1, 2);  // User 1 unfollows user 2.
//twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
//
//
//Constraints:
//
//1 <= userId, followerId, followeeId <= 500
//0 <= tweetId <= 104
//All the tweets have unique IDs.
//At most 3 * 104 calls will be made to postTweet, getNewsFeed, follow, and unfollow.