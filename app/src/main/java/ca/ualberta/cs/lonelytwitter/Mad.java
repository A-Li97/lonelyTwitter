package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public class Mad extends Mood {

    /**
     * Constructor method that inherits mood constructor with no parameters.
     */

    public Mad() {
        super();
    }

    /**
     * This constructor method inherits mood constructor with date parameter
     *
     * @param date date user tweeted with the mood mad
     */

    public Mad(Date date){
        super(date);
    }

    /**
     * Returns String Mad
     * When this method is called it returns the mood mad.
     *
     * @return Mad
     */

    @Override
    public String getMood() {
        return "Mad";
    }
}
