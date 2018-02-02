package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public abstract class Mood implements MessageMood {
    private Date date;

    /**
     * This constructor takes no parameters
     */

    public Mood(){
        this.date = new Date();
    }

    /**
     * This constructor takes in date as a parameter.
     *
     * @param date The take the user selected a mood for the tweet
     */

    public Mood(Date date){
        this.date = date;
    }

    /**
     * No return.
     * This method lets the user changed the date
     *
     * @param date The date the user created the tweet
     *
     */

    public void SetDate(Date date){
        this.date = date;
    }

    /**
     * Returns the date the tweet was made.
     * This method gets the date.
     *
     * @return date of the tweet
     */

    public Date getDate(){
        return date;
    }

    /**
     * Returns String mood
     * This abstract method returns the mood of the corresponding subclass.
     *
     * @return mood
     */

    public abstract String getMood();
}
