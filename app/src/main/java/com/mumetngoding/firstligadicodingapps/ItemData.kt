package com.mumetngoding.firstligadicodingapps

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemData(val image: Int?, val name: String?, val id: String?, val desc: String?): Parcelable