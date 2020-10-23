package com.mercadopago.android.px.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
class AccountMoneyDisplayInfo(
    val sliderTitle: String,
    val type: Type,
    val message: String?,
    val color: String?,
    val gradientColors: List<String>?,
    val paymentMethodImageUrl: String?
) : Serializable, Parcelable {

    enum class Type {
        @SerializedName("default") DEFAULT,
        @SerializedName("hybrid") HYBRID
    }
}
