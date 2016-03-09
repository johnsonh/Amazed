package com.example.amazed;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.widget.Toast;
import android.util.Log;

public class BatteryChangeReceiver extends BroadcastReceiver {
    private static final String TAG = "Johnson Battery Change";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "got system broadcast that battery was unplugged. This game is " +
                "'very battery intensive', so it only works if your phone is charging.");
        // No check here if the intent actually matches
//        if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())) {
        Toast.makeText(context, "Unplugged battery! Closing..", Toast.LENGTH_LONG).show();
        Intent intent1 = new Intent(Intent.ACTION_MAIN);
        intent1.addCategory(Intent.CATEGORY_HOME);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
//        }
    }
}
