package com.hyunu.springcore.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemNme, int itemPrice);

}
