package com.wilb3r.common.result

import android.util.Log
import com.wilb3r.common.BuildConfig

fun Any.tag(): String = ">>> ${this::class.java.simpleName}"

fun Any.logInfo(message: String?) {
    if (BuildConfig.DEBUG) {
        Log.i(tag(), buildLogMsg(message))
    }
}

fun buildLogMsg(message: String?): String {
    val ste = Thread.currentThread().stackTrace[4]
    val sb = StringBuilder()
    sb.append("[")
    sb.append(ste.className.replaceBeforeLast('.', ""))
    sb.append(".")
    sb.append(ste.methodName)
    sb.append("]")
    sb.append(message)
    return sb.toString()
}