package com.harasoft.relaunch;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Library extends Activity {
    final String                 TAG = "Library";
    ReLaunchApp                   app;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        app = ((ReLaunchApp)getApplicationContext());
        app.RestartIntent = PendingIntent.getActivity(this, 0, getIntent(), getIntent().getFlags() | Intent.FLAG_ACTIVITY_NEW_TASK);

        Intent intent = new Intent(Library.this, ReLaunch.class);
        intent.putExtra("home", false);
        intent.putExtra("home1", false);
        intent.putExtra("shop", false);
        intent.putExtra("library", true);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        finish();
    }
}
