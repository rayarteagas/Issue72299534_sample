package com.muko.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(checkIfSessionIsValid())
        {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        //else set content view with login layout (as this is an example it's not created)
    }

    private boolean checkIfSessionIsValid(){
        return true;//As this is an example, the user is always logged in
    }
}
