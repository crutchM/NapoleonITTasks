package com.example.napoleonittask

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class  Product(val index: Int, val name:String, val type: String, val count: Int, val url: String) : Parcelable {
}