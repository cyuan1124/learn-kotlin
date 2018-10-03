package com.chefmic.kotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MessageInfo(val content: String, val sendTime: String): Parcelable {}
