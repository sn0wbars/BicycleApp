package com.servebeer.platypuses.bicycle;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (checkSelfPermission(Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED ||
                checkSelfPermission(Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED)
        {
            Log.e(TAG, "No permission");
            this.requestPermissions(new String[]{Manifest.permission.INTERNET,
                    Manifest.permission.ACCESS_NETWORK_STATE}, 0);
        }
        Intent decideIntent;
        Object token = null;
        if (token != null)
            startActivity(new Intent(this, MessangerActivity.class));
        else
            startActivity(new Intent(this, LoginActivity.class));

        finish();
    }
}
