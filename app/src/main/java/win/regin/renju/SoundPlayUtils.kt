package win.regin.renju

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool


class SoundPlayUtils {
    companion object {
        private var sSoundPlayer: SoundPool? = null
        private var soundPlayUtils: SoundPlayUtils? = null

        /**
         * initialize
         *
         * @param context context
         */
        fun init(context: Context): SoundPlayUtils {
            if (soundPlayUtils == null) {
                soundPlayUtils = SoundPlayUtils()
            }
            val audioAttributes = AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).build()
            val builder = SoundPool.Builder()
            builder.setAudioAttributes(audioAttributes).setMaxStreams(10)
            sSoundPlayer = builder.build()
            sSoundPlayer?.load(context, R.raw.game_start, 1)
            sSoundPlayer?.load(context, R.raw.game_over, 1)
            sSoundPlayer?.load(context, R.raw.move, 1)
            return soundPlayUtils as SoundPlayUtils
        }

        /**
         * play
         *
         * @param soundID soundID
         */
        fun play(@HintConstant.HintType soundID: Int) {
            sSoundPlayer?.play(soundID, 1f, 1f, 0, 0, 1f)
        }
    }
}
