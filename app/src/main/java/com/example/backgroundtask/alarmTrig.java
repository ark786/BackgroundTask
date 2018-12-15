package com.example.backgroundtask;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class alarmTrig extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("recieved", "Bitches!");
    }
}
