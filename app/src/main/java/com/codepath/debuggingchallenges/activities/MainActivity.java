package com.codepath.debuggingchallenges.activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codepath.debuggingchallenges.R;

public class MainActivity extends AppCompatActivity {

    Button btnDay;
    Button btnBackground;
    Button btnToolbar;
    Button btnMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btnDay = findViewById(R.id.btnDay);
        btnBackground = findViewById(R.id.btnBackground);
        btnToolbar = findViewById(R.id.btnToolbar);
        btnMovies = findViewById(R.id.btnMovies);

        btnDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchCurrentDayActivity(view);
            }
        });*/
    }



    private void launchActivity(Class klass) {
        Intent intent = new Intent(this, klass);
        startActivity(intent);
    }

    public void launchCurrentDayActivity(View view) {
        launchActivity(CurrentDayActivity.class);
    }

    public void launchMoviesActivity(View view) {
        launchActivity(MoviesActivity.class);
    }

    public void launchChangeBackgroundActivity(View view) {
        launchActivity(ChangeBackgroundActivity.class);
    }

    public void launchToolbarActivity(View view) {
        launchActivity(ToolbarActivity.class);
    }
}
