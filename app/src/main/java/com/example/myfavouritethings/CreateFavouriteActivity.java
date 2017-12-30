package com.example.myfavouritethings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateFavouriteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_favourite);
        //new comment
        //commet 3
    }

    public void onSendMessage(View view){
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        EditText editText = (EditText)findViewById(R.id.message);

        //intent.putExtra("message",editText.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());

        String chooseTitle = getString(R.string.chooserMsg);
        Intent choosenIntent = Intent.createChooser(intent,chooseTitle);
        //startActivity(intent);
        startActivity(choosenIntent);
    }
}
