package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private String tweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        tweet = getIntent().getStringExtra("Tweet");

        TextView tweetDisplay = (TextView)findViewById(R.id.tweetView);

        tweetDisplay.setText(tweet);
    }
}
