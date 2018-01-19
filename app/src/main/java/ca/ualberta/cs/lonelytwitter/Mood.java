package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali5 on 1/18/18.
 */

public abstract class Mood implements MessageMood {
    private Date date;

    public Mood(){
        this.date = new Date();
    }
    public Mood(Date date){
        this.date = date;
    }

    public void SetDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public abstract String getMood();
}
