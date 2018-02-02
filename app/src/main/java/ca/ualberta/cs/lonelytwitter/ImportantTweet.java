package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructor method that inherits the message parameter of tweet.
     *
     * @param message message of important tweet
     */

    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructor method that inherits the message and date parameter of tweet
     *
     * @param message message of important tweet
     * @param date    date important message was tweeted
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Return true
     * This method sets the status of the tweet to be true, in other words, it is an important tweet
     *
     * @return true
     */

    @Override
    public Boolean IsImportant() {
        return Boolean.TRUE;
    }
}

