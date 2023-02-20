package com.zltech.customprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zltech.customprogressbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var mViewBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(mViewBinding!!.root)


//        pb_update_progress
    }
}