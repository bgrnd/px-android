package com.mercadopago.android.px.internal.features.express.slider;

import androidx.annotation.NonNull;
import com.mercadopago.android.px.internal.view.TitlePager;
import com.mercadopago.android.px.internal.viewmodel.GoingToModel;

public class TitlePagerAdapterV2 extends TitlePagerAdapter {

    public TitlePagerAdapterV2(@NonNull final TitlePager titlePager,
        @NonNull final InstallmentChanged installmentChanged) {
        super(titlePager, installmentChanged);
    }

    @Override
    public void updatePosition(final float positionOffset, final int position) {
        // do nothing
    }
}