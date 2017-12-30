package com.example.myfavouritethings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
    public static final String THE_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(THE_MESSAGE);

        TextView textView = (TextView)findViewById(R.id.displayMessage);
        textView.setText(message);
    }
}
