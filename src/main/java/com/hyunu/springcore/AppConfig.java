package com.hyunu.springcore;

import com.hyunu.springcore.discount.FixDiscountPolicy;
import com.hyunu.springcore.member.MemberService;
import com.hyunu.springcore.member.MemberServiceImpl;
import com.hyunu.springcore.member.MemoryMemberRepository;
import com.hyunu.springcore.order.OrderService;
import com.hyunu.springcore.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }


}
