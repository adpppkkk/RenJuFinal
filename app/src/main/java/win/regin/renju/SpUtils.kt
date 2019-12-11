package win.regin.renju

import android.content.Context
import androidx.core.content.edit


class SpUtils {
    init {
        throw UnsupportedOperationException("cannot be instantiated")
    }

    companion object {

        /**
         * Save name into phone
         */
        private const val FILE_NAME = "renju"

        /**
         *
         * @param key       key
         * @param content    object
         * @param fileName fileName
         */
        fun put(key: String, content: Any, fileName: String) {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(fileName, Context.MODE_PRIVATE)
            when (content) {
                is String -> sharedPreferences.edit { putString(key, content) }
                is Int -> sharedPreferences.edit { putInt(key, content) }
                is Boolean -> sharedPreferences.edit { putBoolean(key, content) }
                is Float -> sharedPreferences.edit { putFloat(key, content) }
                is Long -> sharedPreferences.edit { putLong(key, content) }
                else -> sharedPreferences.edit { putString(key, content.toString()) }
            }
        }

        /**
         *
         * @param key       key
         * @param content    object
         */
        fun put(key: String, content: Any?) {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
            when (content) {
                is String -> sharedPreferences.edit { putString(key, content) }
                is Int -> sharedPreferences.edit { putInt(key, content) }
                is Boolean -> sharedPreferences.edit { putBoolean(key, content) }
                is Float -> sharedPreferences.edit { putFloat(key, content) }
                is Long -> sharedPreferences.edit { putLong(key, content) }
                else -> sharedPreferences.edit { putString(key, content.toString()) }
            }
        }


        /**
         *
         * @param key           key
         * @param defaultObject defaultObject
         * @param fileName     fileName
         */
        operator fun get(
            key: String,
            defaultObject: Any,
            fileName: String
        ): Any? {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(fileName, Context.MODE_PRIVATE)
            return when (defaultObject) {
                is String -> sharedPreferences.getString(key, defaultObject)
                is Int -> sharedPreferences.getInt(key, defaultObject)
                is Boolean -> sharedPreferences.getBoolean(key, defaultObject)
                is Float -> sharedPreferences.getFloat(key, defaultObject)
                is Long -> sharedPreferences.getLong(key, defaultObject)
                else -> null
            }
        }

        /**
         *
         * @param key           key
         * @param defaultObject defaultObject
         */
        operator fun get(key: String, defaultObject: Any): Any? {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)

            return when (defaultObject) {
                is String -> sharedPreferences.getString(key, defaultObject)
                is Int -> sharedPreferences.getInt(key, defaultObject)
                is Boolean -> sharedPreferences.getBoolean(key, defaultObject)
                is Float -> sharedPreferences.getFloat(key, defaultObject)
                is Long -> sharedPreferences.getLong(key, defaultObject)
                else -> null
            }
        }

        /**
         *
         * @param key       key
         * @param fileName fileName
         */
        fun remove(key: String, fileName: String) {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(fileName, Context.MODE_PRIVATE)
            sharedPreferences.edit { remove(key) }
        }

        /**
         *
         * @param key       key
         */
        fun remove(key: String) {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
            sharedPreferences.edit { remove(key) }
        }

        /**
         *
         * @param fileName fileName
         */
        fun clear(fileName: String) {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(fileName, Context.MODE_PRIVATE)
            sharedPreferences.edit { clear() }
        }

        /**
         *
         */
        fun clear() {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
            sharedPreferences.edit { clear() }
        }


        /**
         *
         * @param key       key
         * @param fileName fileName
         */
        fun contains(key: String, fileName: String): Boolean {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(fileName, Context.MODE_PRIVATE)
            return sharedPreferences.contains(key)
        }

        /**
         *
         * @param key       key
         */
        fun contains(key: String): Boolean {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.contains(key)
        }


        /**
         *
         * @param fileName fileName
         * @return map
         */
        fun getAll(fileName: String): Map<String, *> {
            val sharedPreferences =
                AppRenju.instance.getSharedPreferences(fileName, Context.MODE_PRIVATE)
            return sharedPreferences.all
        }

        /**
         *
         * @return map
         */
        fun getAll(): Map<String, *> {
            val sharedPreferences =
                    AppRenju.instance.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
            return sharedPreferences.all
        }

    }
}