package com.example.taskplanner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class LaunchActivity extends AppCompatActivity {
    public static final String TOKEN_KEY = "TOKEN_KEY";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sharedPref =
                getSharedPreferences( getString( R.string.preference_file_key ), Context.MODE_PRIVATE );


        if(sharedPref.contains(TOKEN_KEY)){
            //TODO go to MainActivity
            Intent i =new Intent(this,MainActivity.class);
            startActivity(i);

        }else{
            //TODO go to LoginActivity
            Intent i =new Intent(this,LoginActivity.class);
            startActivity(i);

        }
    }
}
