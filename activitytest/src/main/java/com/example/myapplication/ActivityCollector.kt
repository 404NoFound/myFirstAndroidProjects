package com.example.myapplication

import android.app.Activity
import java.util.*

object ActivityCollector {
    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun RemoveActivity(activity: Activity) {
        activities.remove(activity)
    }
    fun finishAll() {
        activities.filter { !it.isFinishing }.forEach { it.finish() }

    }
}
