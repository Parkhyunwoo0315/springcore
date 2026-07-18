package com.hyunu.springcore.order;

import com.hyunu.springcore.AppConfig;
import com.hyunu.springcore.member.Grade;
import com.hyunu.springcore.member.Member;
import com.hyunu.springcore.member.MemberService;
import com.hyunu.springcore.member.MemberServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order" + order);
    }
}
