package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public interface Tweetable {

    /**
     * Return String message
     * This method gets the message of the tweet
     *
     * @return tweet
     */

    public String getMessage();

    /**
     * Return Date date
     * This method returns the date of the tweet
     *
     * @return date
     */

    public Date getDate();

}
