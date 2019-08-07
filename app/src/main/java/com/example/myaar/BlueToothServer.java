package com.example.myaar;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BlueToothServer {
    private static Context context;

    public static void setContext(Context context) {
        BlueToothServer.context = context;

        Toast.makeText(BlueToothServer.context, "setContext called", Toast.LENGTH_LONG).show();
    }

    public static void startServer() {
        if (BlueToothServer.context != null) {
            Intent intent = new Intent(BlueToothServer.context, MyService.class);
            BlueToothServer.context.startService(intent);
            Toast.makeText(BlueToothServer.context, "startServer called", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(BlueToothServer.context, "startServer called fail", Toast.LENGTH_LONG).show();
        }
    }

    public static void stopServer() {
        if (BlueToothServer.context != null) {
            Intent intent = new Intent(BlueToothServer.context, MyService.class);
            BlueToothServer.context.stopService(intent);
            Toast.makeText(BlueToothServer.context, "stopServer called", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(BlueToothServer.context, "stopServer called fail", Toast.LENGTH_LONG).show();
        }
    }
}
