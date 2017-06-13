package com.example.android.listenny;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        //Method when email one is clicked, mail app will open with mail subject and text
        ImageView email = (ImageView) findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener
                () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto: example@yourdomain.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Song from your friend");
                intent.putExtra(Intent.EXTRA_TEXT, "Dear Listenny User, Your friend sent you this song:");
                if (intent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(intent);
                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Unable to open email :(", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Find the View that shows the home image category
        ImageView menu = (ImageView) findViewById(R.id.menu_icon);

        // Set a click listener on that View
        menu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent menuIntent = new Intent(Share.this, MainActivity.class);
                startActivity(menuIntent);
            }
        });

        // Find the View that shows the currently playing category
        ImageView playFloat = (ImageView) findViewById(R.id.play_float);

        // Set a click listener on that View
        playFloat.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recent View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Play}
                Intent playFloatIntent = new Intent(Share.this, Play.class);

                // Start the new activity
                startActivity(playFloatIntent);
            }
        });


    }
}
