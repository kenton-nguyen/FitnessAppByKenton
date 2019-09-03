package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        // display chest workouts
        final TextView chestText = (TextView) findViewById(R.id.chestWorkout);
        final String[] chestWorkouts = { "                -------- WORKOUT 1 --------\n- Barbell bench press\n- Incline dumbbell press " +
                "superset with incline dumbbell flies" +
                "\n- Decline chest press (hammer strength)\n- Machine dips\n- Cable fly (mid chest)",

                "                -------- WORKOUT 2 --------\n - Incline barbell press\n- Flat dumbbell press superset " +
                "with chest press with a weight plate\n" +
                "- Bodyweight dips\n- Machine chest fly\n- Cable fly (low to high)",

                "                -------- WORKOUT 3 --------\n- Decline barbell press\n- Incline chest press (hammer strength)\n" +
                        "- Cable fly (low to high)\n" +
                        "- Chest push downs on assisted pull-up/dip machine\n" +
                "- Chest press machine (mid chest)\n" + "- Cable fly (high to low)\n",

                "                -------- WORKOUT 4 ---------\n- Dumbbell flat press superset with plate press\n" +
                        "- Incline press (hammer strength)\n" +
                        "- Bench dips\n" + "- Dumbbell pullover\n" + "- Cable fly (mid chest)",

                                                                                };


        // have button interact with text
        Button chestButton = (Button) findViewById(R.id.button2);
        chestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // generate random workouts
                final int randomChest = (int) (Math.random() * 4); // ending number is how many items in the array
                chestText.setText(chestWorkouts[randomChest]);
            }
        });

        // add a connection to a separate page that shows how to do each exercise listed
        // first chest workout
        final TextView txtView = this.findViewById(R.id.chestDemo);
        txtView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ChestActivity.this.startActivity(new Intent(ChestActivity.this, chestDemo.class));
            }
        });

        // second chest workout
        final TextView txtView2 = this.findViewById(R.id.chestDemo2);
        txtView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ChestActivity.this.startActivity(new Intent(ChestActivity.this, chestDemo2.class));
            }
        });

        // third chest workout
        final TextView txtView3 = this.findViewById(R.id.chestDemo3);
        txtView3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ChestActivity.this.startActivity(new Intent(ChestActivity.this, chestDemo3.class));
            }
        });

        // fourth chest workout
        final TextView txtView4 = this.findViewById(R.id.chestDemo4);
        txtView4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ChestActivity.this.startActivity(new Intent(ChestActivity.this, chestDemo4.class));
            }
        });
    }
}
