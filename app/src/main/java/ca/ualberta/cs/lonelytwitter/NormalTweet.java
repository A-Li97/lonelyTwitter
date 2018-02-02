package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public class NormalTweet extends Tweet {

    /**
     * Contructor method that inherits the message parameter of tweet
     *
     * @param message message of normal tweet
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Contructor method that inherits the message and date parameter of tweet
     *
     * @param message message of normal tweet
     * @param date    date normal tweet was tweeted
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Return false
     * This method sets the status of the tweet to be false, in other words, it is a normal tweet
     *
     * @return false
     */

    @Override
    public Boolean IsImportant() {
        return Boolean.FALSE;
    }
}
