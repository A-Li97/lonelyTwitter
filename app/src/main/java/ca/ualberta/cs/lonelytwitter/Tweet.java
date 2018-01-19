package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ali5 on 1/18/18.
 */

public abstract class Tweet implements Tweetable{ //abstract means a method isn't implemented, so subclass must implement it
    //implements means that the class must have the methods from the interface implemented

    private String message;
    private Date date;
    private List<Mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<Mood>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140)
            throw new TweetTooLongException();
        else
            this.message = message;
    }

    public void addMood(Mood mood) {
        this.moodList.add(mood);
    }

    public abstract Boolean IsImportant();

}
