package com.mercadopago.android.px.testcheckout.pages;

import com.mercadopago.android.px.R;
import com.mercadopago.android.px.testcheckout.assertions.CheckoutValidator;
import com.mercadopago.android.testlib.pages.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * @deprecated this page does not exists anymore.
 */
@Deprecated
public class OneTapPage extends PageObject<CheckoutValidator> {

    public OneTapPage() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }

    public OneTapPage(final CheckoutValidator validator) {
        super(validator);
    }

    public DiscountDetailPage pressOnDiscountDetail() {
        return new DiscountDetailPage(validator);
    }

    public SecurityCodeToResultsPage pressConfirmButton() {
        onView(withId(R.id.px_button_primary)).perform(click());
        return new SecurityCodeToResultsPage(validator);
    }

    public CongratsPage pressConfirmButtonToCongratsPage() {
        onView(withId(R.id.px_button_primary)).perform(click());
        return new CongratsPage(validator);
    }

    public RejectedPage pressConfirmButtonToRejectedPage() {
        onView(withId(R.id.px_button_primary)).perform(click());
        return new RejectedPage(validator);
    }

    @Override
    public OneTapPage validate(final CheckoutValidator validator) {
        validator.validate(this);
        return this;
    }
}
