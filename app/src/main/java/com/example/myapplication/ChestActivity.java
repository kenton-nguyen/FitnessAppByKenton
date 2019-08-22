package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
        final String[] chestWorkouts = {"Barbell bench press\nIncline dumbbell press " +
                "superset with incline dumbbell flies" +
                "\nDecline chest press (hammer strength)\nMachine dips\nCable fly (mid chest)",

                "Incline barbell press\nFlat dumbbell press superset " +
                "with chest press with a weight plate\n" +
                "Bodyweight dips\nMachine chest fly\nCable fly (low to high)",

                "Decline barbell press\nIncline chest press (hammer strength)\n" +
                        "Standing dumbbell fly (low to high)\n" +
                        "Chest push downs on assisted pull-up/dip machine\n" +
                "Chest press machine (mid chest)\n" + "Cable fly (high to low)\n",

                "Dumbbell flat press superset with plate press\n" +
                        "Incline press (hammer strength)\n" +
                        "Bench dips\n" + "Dumbbell pullover\n" + "Cable fly (mid chest)",

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
    }
}
