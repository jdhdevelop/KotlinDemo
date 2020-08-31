package com.joe.kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joe.kotlin.R
import com.joe.kotlin.model.Customer

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        var customer:Customer = Customer("Joe")
    }
}