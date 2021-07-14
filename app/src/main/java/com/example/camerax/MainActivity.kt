package com.example.camerax

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.camera.core.impl.PreviewConfig
import androidx.core.app.ActivityCompat
import java.security.Permission

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
            == PackageManager.PERMISSION_GRANTED)
        {
            startCamera()
        }
        else{
            ActivityCompat.requestPermissions(this,arrayOf(android.Manifest.permission.CAMERA),1234)
        }
    }

    private fun startCamera() {
        val previewConfig = PreviewConfig.Builder()
    }
}