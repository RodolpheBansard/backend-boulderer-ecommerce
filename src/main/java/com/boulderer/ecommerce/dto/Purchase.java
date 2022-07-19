package com.boulderer.ecommerce.dto;

import com.boulderer.ecommerce.entity.Address;
import com.boulderer.ecommerce.entity.Customer;
import com.boulderer.ecommerce.entity.Order;
import com.boulderer.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
