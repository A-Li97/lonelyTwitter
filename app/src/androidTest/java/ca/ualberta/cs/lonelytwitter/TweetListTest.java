package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;

/**
 * Created by ali5 on 2/15/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        assertTrue(tweets.add(tweet));
        assertTrue(tweets.hasTweet(tweet));

        tweets.add(tweet);                              // inserts same tweet, throws exception
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        ArrayList<Tweet> orderedTweets = new ArrayList<>();
        ArrayList<Tweet> returnedTweets = new ArrayList<>();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        Tweet tweet2 = new NormalTweet("Another tweet");

        Date date1 = new Date(2012);
        Date date2 = new Date();

        tweet.setDate(date2);
        tweet2.setDate(date1);

        tweets.add(tweet);                                  // unordered list
        tweets.add(tweet2);

        orderedTweets.add(tweet2);                          // ordered list
        orderedTweets.add(tweet);

        returnedTweets = tweets.getTweets();                // returned ordered list

        assertEquals(orderedTweets,returnedTweets);         // checks if returned list is ordered
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);

        int count = tweets.getCount();

        assertEquals(count, 1);
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);

        tweets.deleteTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

}
