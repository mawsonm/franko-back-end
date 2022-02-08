package com.franko.diamond.service;

import com.franko.diamond.dto.Purchase;
import com.franko.diamond.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
