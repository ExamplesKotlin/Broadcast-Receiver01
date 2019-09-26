package com.example.broadcastreceiver01

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class Listener : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Toast.makeText(context, "Ingresamos al escuchador", Toast.LENGTH_SHORT).show()
    }
}
