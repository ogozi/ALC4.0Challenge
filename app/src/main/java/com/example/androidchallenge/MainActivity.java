package com.example.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button AboutAlc;
    private Button MyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AboutAlc = (Button)findViewById(R.id.AboutAlc);
        MyProfile = (Button) findViewById(R.id.MyProfile);

        MyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

    }

    public void openProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void AboutAlc (View view) {
        Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/"));
        startActivity(browserIntent);
    }
}