package win.regin.renju

import android.support.v7.app.AppCompatActivity



fun AppCompatActivity.getWidth(): Int {
    val dm = resources.displayMetrics
    return dm.widthPixels
}

fun AppCompatActivity.getHeight(): Int {
    val dm = resources.displayMetrics
    return dm.heightPixels
}

