package com.mozhimen.audiok_ffmpeg

/**
 * @ClassName ExtsKVerifyFormat
 * @Description TODO
 * @Author mozhimen / Kolin Zhao
 * @Date 2022/11/10 23:59
 * @Version 1.0
 */
fun String.isSpeexValid(): Boolean =
    UtilKVerifyFormat.isSpeexValid(this)

fun String.isMp3Valid(): Boolean =
    UtilKVerifyFormat.isMp3Valid(this)

fun String.isWavValid(): Boolean =
    UtilKVerifyFormat.isWavValid(this)