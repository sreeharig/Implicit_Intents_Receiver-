package com.example.implicitintentsreciver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri !=null){
            String uri_string = getString(R.string.uri)+uri.toString();
            TextView textView = findViewById(R.id.uri_text);
            textView.setText(uri_string);


        }
    }
}