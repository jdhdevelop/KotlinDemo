package com.joe.kotlin.utils

import android.content.Context
import android.widget.Toast

class CommonUtils {

    public fun Context.toast(message:String, length:Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this,message,length).show();
    }
}