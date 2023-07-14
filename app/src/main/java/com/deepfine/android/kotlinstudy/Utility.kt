package com.deepfine.android.kotlinstudy

import android.app.Activity
import android.net.ConnectivityManager
import androidx.core.content.ContextCompat.getSystemService

class Utility {

    //네트워크 체크하는 함수
    infix fun isNetworkConnected(activity: Activity): Boolean { //인터넷 X -> null 반환
        val connectivityManager = activity.getSystemService(ConnectivityManager::class.java)
        return connectivityManager.activeNetwork == null // null이면 true 반환(인터넷 X) 아니면 false 반환(인터넷 O)
    }

}