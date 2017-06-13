package com.example.android.listenny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Find the View that shows the home image category
        ImageView menu = (ImageView) findViewById(R.id.menu_icon);

        // Set a click listener on that View
        menu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent menuIntent = new Intent(Play.this, MainActivity.class);
                startActivity(menuIntent);
            }
        });
    }
}
