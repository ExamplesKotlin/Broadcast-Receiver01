package com.example.broadcastreceiver01

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var receiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val listenerObject = Listener()
//        val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
//        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//        registerReceiver(listenerObject, filter)

        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        receiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Toast.makeText(p0, intent?.action, Toast.LENGTH_SHORT).show()
            }
        }
        registerReceiver(receiver, filter)


        button.setOnClickListener {

        }

    }

    override fun onDestroy() {
        unregisterReceiver(receiver)
        super.onDestroy()
    }
}
