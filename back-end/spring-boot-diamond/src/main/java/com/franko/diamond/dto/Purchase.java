package com.franko.diamond.dto;

import com.franko.diamond.entity.Address;
import com.franko.diamond.entity.Customer;
import com.franko.diamond.entity.Order;
import com.franko.diamond.entity.OrderItem;
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
