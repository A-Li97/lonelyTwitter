package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

/**
 * @author Andy Li
 * @version 1
 */

public class Happy extends Mood {

    /**
     * Constructor method that inherits mood constructor with no parameters.
     */

    public Happy() {
        super();
    }

    /**
     * This constructor method inherits mood constructor with date parameter
     *
     * @param date date user tweeted with the mood happy
     */

    public Happy(Date date) {
        super(date);
    }

    /**
     * Returns String Happy
     * When this method is called it returns the mood happy.
     *
     * @return Happy
     */

    @Override
    public String getMood() {
        return "Happy";
    }
}
