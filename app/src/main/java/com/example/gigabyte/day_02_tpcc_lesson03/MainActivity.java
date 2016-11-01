package com.example.gigabyte.day_02_tpcc_lesson03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView feature;
    private LinearLayout funbgcolor;
    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funbgcolor = (LinearLayout) findViewById(R.id.activity_main);
        logo = (ImageView) findViewById(R.id.marshmellow);
        feature = (TextView) findViewById(R.id.feature);
        button = (ImageButton) findViewById(R.id.fingerbtm);
        final int[] droidId = {R.drawable.marshmallow,
                            R.drawable.fingerprint,
                             R.drawable.jellybean,
                               R.drawable.ics};
        final int[] bgColorId = {Color.MAGENTA, Color.GREEN, Color.RED,
                Color.CYAN, Color.BLUE, Color.YELLOW};

        funbgcolor.setBackgroundColor(0xFFFFFF);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(4);
                Toast.makeText(MainActivity.this, "random number: " + randomNumber, Toast.LENGTH_SHORT).show();
                funbgcolor.setBackgroundColor(bgColorId[randomNumber]);
                logo.setImageResource(droidId[randomNumber]);
                //Snackbar.make(Fundroid.this, "random number: " + randomNumber

                //logo.setImageResource(R.drawable.marshmallow);
                feature.setText("I wanna be dj marshmallow!");
            }
        });
    }
}