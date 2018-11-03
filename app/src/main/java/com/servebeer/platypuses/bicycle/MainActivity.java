package com.servebeer.platypuses.bicycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent decideIntent;
        Object token = null;
        if (token != null)
            startActivity(new Intent(this, MessangerActivity.class));
        else
            startActivity(new Intent(this, LoginActivity.class));

        finish();
    }
}
