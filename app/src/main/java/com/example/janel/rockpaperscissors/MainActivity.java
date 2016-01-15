package com.example.janel.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int lightpoints = 0;
    int darkpoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int darkHand() {
        Random rand = new Random();
        int hand = rand.nextInt(2);
        TextView counter = (TextView) findViewById(R.id.counter);
        if (hand == 0) {
            counter.setText("Kylo counters with " + "ROCK");
        } else if (hand == 1) {
            counter.setText("Kylo counters with " + "PAPER");
        } else if (hand == 2) {
            counter.setText("Kylo counters with " + "SCISSORS");
        }
        return hand; // 0, 1, 2 are possible outcomes
    }

    public void rockBattle(View view) {
        int darkNum = darkHand();
        if (darkNum == 0) {
           Toast.makeText(this, "Your powers are equivalent!", Toast.LENGTH_SHORT).show();
        } else if (darkNum == 1) {
           Toast.makeText(this, "The Dark Side grows stronger...", Toast.LENGTH_SHORT).show();
           darkpoints++;
        } else if (darkNum == 2) {
           Toast.makeText(this, "The force flows within you!", Toast.LENGTH_SHORT).show();
           lightpoints++;
        }
        TextView darkView = (TextView) findViewById(R.id.darkpoint);
        darkView.setText("Score: " + String.valueOf(darkpoints));
        TextView lightView = (TextView) findViewById(R.id.lightpoint);
        lightView.setText("Score: " + String.valueOf(lightpoints));
    }

    public void paperBattle(View view) {
        int darkNum = darkHand();
        if (darkNum == 0) {
            Toast.makeText(this, "The force is on your side!", Toast.LENGTH_SHORT).show();
            lightpoints++;
        } else if (darkNum == 1) {
            Toast.makeText(this, "Your powers are equivalent!", Toast.LENGTH_SHORT).show();
        } else if (darkNum == 2) {
            Toast.makeText(this, "The First Order rejoices...", Toast.LENGTH_SHORT).show();
            darkpoints++;
        }
        TextView darkView = (TextView) findViewById(R.id.darkpoint);
        darkView.setText("Score: " + String.valueOf(darkpoints));
        TextView lightView = (TextView) findViewById(R.id.lightpoint);
        lightView.setText("Score: " + String.valueOf(lightpoints));
    }

    public void scissorBattle(View view) {
        int darkNum = darkHand();
        if (darkNum == 0) {
            Toast.makeText(this, "Their power is too much for you!", Toast.LENGTH_SHORT).show();
            darkpoints++;
        } else if (darkNum == 1) {
            Toast.makeText(this, "Your powers are equivalent!", Toast.LENGTH_SHORT).show();
        } else if (darkNum == 2) {
            Toast.makeText(this, "The Light Side has made you strong.", Toast.LENGTH_SHORT).show();
            lightpoints++;
        }
        TextView darkView = (TextView) findViewById(R.id.darkpoint);
        darkView.setText("Score: " + String.valueOf(darkpoints));
        TextView lightView = (TextView) findViewById(R.id.lightpoint);
        lightView.setText("Score: " + String.valueOf(lightpoints));
    }

}
