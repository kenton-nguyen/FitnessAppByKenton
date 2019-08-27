package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class chestDemo extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener; // listen for after initializing player

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_demo);

        playButton = (Button) findViewById(R.id.playButton);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlayer);


        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadPlaylist("PLTjIA2WUypJdE-0p5DRyLyMB_gJ4Pqnar");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        // initialize our player
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYouTubePlayerView.initialize(YoutubeConfig.getApiKey(),mOnInitializedListener);
            }
        });
    }
}
