package com.johncuffe.fortunecrunch.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class FortuneCrunch extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleFortune(View view) {
        TextView fortune = (TextView) findViewById(R.id.fortune_text);
        ImageView cookie = (ImageView) findViewById(R.id.fortune_view);
        // use the text visibility to determine mode
        String[] fortune_array = getResources().getStringArray(R.array.fortune_array);
        Random random_num = new Random();
        if (fortune.getVisibility() == View.GONE) {
            fortune.setVisibility(View.VISIBLE);
            cookie.setImageResource(R.drawable.fortune_cookie_cracked);

            int i1 = random_num.nextInt(fortune_array.length);
            fortune.setText(fortune_array[i1]);
        } else {
            fortune.setVisibility(View.GONE);
            cookie.setImageResource(R.drawable.fortune_cookie_uncracked);
        }
    }
}

