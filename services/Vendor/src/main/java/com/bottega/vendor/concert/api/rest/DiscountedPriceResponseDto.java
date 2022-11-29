package com.bottega.vendor.concert.api.rest;

import com.bottega.vendor.concert.Price;

public record DiscountedPriceResponseDto(
        int price) {

    public static DiscountedPriceResponseDto fromPrice(Price price) {
        return new DiscountedPriceResponseDto(price.getPrice().toInt());
    }
}
