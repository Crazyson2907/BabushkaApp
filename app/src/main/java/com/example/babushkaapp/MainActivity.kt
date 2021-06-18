package com.example.babushkaapp


import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openApp(view: View) {

        val launchIntent = Intent()
        launchIntent.component = ComponentName(
            "com.whatsapp",
            "com.whatsapp.voipcalling.VoipActivityV2"
        )
        //startActivity(intent)

    if(launchIntent != null){
        startActivity(launchIntent)
    } else {
        Toast.makeText(this, "No package", Toast.LENGTH_LONG).show()
    }
    }
}


