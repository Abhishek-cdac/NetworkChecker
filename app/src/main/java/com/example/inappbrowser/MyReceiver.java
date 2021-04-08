package com.example.inappbrowser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        final String action = intent.getAction();

        if (action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)) {
            NetworkInfo info = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
            boolean connected = info.isConnected();

            if (connected) {
                Toast.makeText(context, "WIFI connected.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "WIFI disconnected.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}