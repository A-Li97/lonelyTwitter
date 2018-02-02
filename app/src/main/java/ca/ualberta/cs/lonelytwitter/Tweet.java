package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public abstract class Tweet implements Tweetable{ //abstract means a method isn't implemented, so subclass must implement it
    //implements means that the class must have the methods from the interface implemented

    private String message;
    private Date date;
    private List<Mood> moodList;

    /**
     * Constructor method that takes in a string parameter
     *
     * @param message Tweet message
     */

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood>();
    }

    /**
     * Constructor method that takes in both a string paramter and a date parameter
     *
     * @param message Tweet message
     * @param date    Tweet date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    /**
     * Returns date
     * This method gets the date of the tweet
     *
     * @return date
     */

    public Date getDate() {
        return date;
    }

    /**
     * No return
     * This method takes in a date parameter than sets it for the current tweet object
     *
     * @param date date of tweet
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Return the tweet message
     * This method gets the message of the tweet then returns it.
     *
     * @return tweet
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * No return
     * This method sets the message of the tweet object
     *
     * @param message                   message user tweeted
     * @throws TweetTooLongException    If tweet is longer than 140 characters, throws erro
     */

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140)
            throw new TweetTooLongException();
        else
            this.message = message;
    }

    /**
     * No return
     * This method adds a mood to the tweet
     *
     * @param mood The mood the user chosen
     */

    public void addMood(Mood mood) {
        this.moodList.add(mood);
    }

    /**
     * Returns true if user determines tweet is important, otherwise false
     * This method determines if the user thinks the tweet is important
     *
     * @return true or false
     */

    public abstract Boolean IsImportant();

}
