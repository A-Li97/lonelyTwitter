package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

public class Mad extends Mood {

    public Mad(Date date){
        super(date);
    }

    @Override
    public String getMood() {
        return "Mad";
    }
}
