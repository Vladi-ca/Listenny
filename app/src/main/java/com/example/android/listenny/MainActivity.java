package com.example.android.listenny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
// import android.widget.MediaController.MediaPlayerControl;
// this MediaController widget has inside of it: play, pause, rewind, fast-forward, skip buttons and seekbar.
// SeekBar has its own configuration which may be controlled by implementing a class MusicController.
// android.widget.MediaController would be used as a superclass when creating MusicController class.:
// public class MusicController extends MediaController {
//public MusicController(Context c){
//        super(c);
//        }

//public void hide(){}

//        }


//public class MainActivity extends Activity implements MediaPlayerControl {
//next step is to add: private MusicController controller;

// For controlling playback in Service class add methods: public int getPosn(){
//  return player.getCurrentPosition();
//          }
//public int getDur(){
//        return player.getDuration();
//         }
// public boolean isPng(){
//         return player.isPlaying();
//         }
//public void pausePlayer(){
//        player.pause();
//        }
//public void seek(int posn){
//        player.seekTo(posn);
//        }
//public void go(){
//        player.start();
//        }

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the recently playing category
        ImageView play = (ImageView) findViewById(R.id.recent);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recent View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Play}
                Intent playIntent = new Intent(MainActivity.this, Play.class);

                // Start the new activity
                startActivity(playIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageView share = (ImageView) findViewById(R.id.expand_more);

        // Set a click listener on that View
        share.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the arrow down (expand_more) View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Share}
                Intent shareIntent = new Intent(MainActivity.this, Share.class);

                // Start the new activity
                startActivity(shareIntent);
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
                Intent playFloatIntent = new Intent(MainActivity.this, Play.class);

                // Start the new activity
                startActivity(playFloatIntent);
            }
        });


        // //Find the View that shows the explore image category
        //ImageView explore = (ImageView) findViewById(R.id.explore_icon);
        // Set a click listener on that View
        //explore.setOnClickListener(new View.OnClickListener() {
        //// The code in this method will be executed when the home ImageView is clicked on.
        //@Override
        //public void onClick(View view) {
        //Intent exploreIntent = new Intent(Share.this, ExploreActivity.class);
        //startActivity(exploreIntent);
        //}
        //});

        // //Find the View that shows the favorites image category
        //ImageView favorites = (ImageView) findViewById(R.id.favorites_icon);
        // Set a click listener on that View
        //favorites.setOnClickListener(new View.OnClickListener() {
        //// The code in this method will be executed when the home ImageView is clicked on.
        //@Override
        //public void onClick(View view) {
        //Intent favoritesIntent = new Intent(Share.this, FavoritesActivity.class);
        //startActivity(favoritesIntent);
        //}
        //});

        // //Find the View that shows the followed image category
        //ImageView followed = (ImageView) findViewById(R.id.followed_icon);
        // Set a click listener on that View
        //followed.setOnClickListener(new View.OnClickListener() {
        //// The code in this method will be executed when the home ImageView is clicked on.
        //@Override
        //public void onClick(View view) {
        //Intent followedIntent = new Intent(Share.this, FollowedActivity.class);
        //startActivity(followedIntent);
        //}
        //});

        // //Find the View that shows the account image category
        //ImageView account = (ImageView) findViewById(R.id.account_icon);
        // Set a click listener on that View
        //account.setOnClickListener(new View.OnClickListener() {
        //// The code in this method will be executed when the home ImageView is clicked on.
        //@Override
        //public void onClick(View view) {
        //Intent accountIntent = new Intent(Share.this, AccountActivity.class);
        //startActivity(accountIntent);
        //}
        //});

    }
}
