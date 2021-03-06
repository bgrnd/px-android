package com.mercadopago.android.px.tracking.internal.views

import com.mercadopago.android.px.tracking.internal.TrackFactory
import com.mercadopago.android.px.tracking.internal.TrackWrapper

class GuessingRootViewTracker : TrackWrapper() {

    override fun getTrack() = TrackFactory.withView(PATH).build()

    companion object {
        private const val PATH = BASE_PATH + ADD_PAYMENT_METHOD_PATH
    }
}