package com.sass.ci_cd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(application, "d64be6cc-bcf8-4380-9a8d-e234be4bded9",
            Analytics::class.java, Crashes::class.java)
        Log.d("HELLO", "HELLO")
    }
}