package com.example.touristapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class Akun : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        if (supportActionBar != null){
            (supportActionBar as ActionBar).title = "AKUN"
        }
    }
}
