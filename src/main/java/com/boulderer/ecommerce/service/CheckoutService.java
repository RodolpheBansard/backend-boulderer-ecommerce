package com.boulderer.ecommerce.service;

import com.boulderer.ecommerce.dto.Purchase;
import com.boulderer.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
