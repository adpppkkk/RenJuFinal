package win.regin.renju

import android.app.Application


class AppRenju : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        SoundPlayUtils.init(this)
    }

    companion object {
        lateinit var instance: AppRenju
            private set
    }
}
