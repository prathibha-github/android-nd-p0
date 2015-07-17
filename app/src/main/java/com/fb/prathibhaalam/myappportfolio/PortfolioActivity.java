package com.fb.prathibhaalam.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        final Button spotifyStreamerAppButton = (Button) findViewById(R.id.spotify_streamer_app_button);
        spotifyStreamerAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PortfolioActivity.this, "This button will launch my Spotify Streamer app", Toast.LENGTH_SHORT).show();
            }
        });

        final Button footballScoreAppButton = (Button) findViewById(R.id.football_scores_app_button);
        footballScoreAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PortfolioActivity.this, "This button will launch my Football Scores app", Toast.LENGTH_SHORT).show();
            }
        });

        final Button libraryAppButton = (Button) findViewById(R.id.library_app_button);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PortfolioActivity.this, "This button will launch my Library app", Toast.LENGTH_SHORT).show();
            }
        });

        final Button buildItBiggerAppButton = (Button) findViewById(R.id.build_it_bigger_app_button);
        buildItBiggerAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PortfolioActivity.this, "This button will launch my Build it bigger app", Toast.LENGTH_SHORT).show();
            }
        });

        final Button xyzReaderAppButton = (Button) findViewById(R.id.xyz_reader_app_button);
        xyzReaderAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PortfolioActivity.this, "This button will launch my Xyz Reader app", Toast.LENGTH_SHORT).show();
            }
        });

        final Button capstoneAppButton = (Button) findViewById(R.id.capstone_app_button);
        capstoneAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PortfolioActivity.this, "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
