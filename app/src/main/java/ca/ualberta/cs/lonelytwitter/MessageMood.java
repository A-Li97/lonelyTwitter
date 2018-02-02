package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public interface MessageMood {

    /**
     * Returns the date of the tweet.
     * This method gets the date of the tweet
     *
     * @return date
     */

    public Date getDate();

    /**
     * Returns the mood the user set on the tweet.
     * This method gets the mood of the tweet
     *
     * @return mood
     */

    public String getMood();
}
