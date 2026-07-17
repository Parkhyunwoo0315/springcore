package com.hyunu.springcore.order;

import com.hyunu.springcore.discount.DiscountPolicy;
import com.hyunu.springcore.member.Member;
import com.hyunu.springcore.member.MemberRepository;
import com.hyunu.springcore.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findId(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
