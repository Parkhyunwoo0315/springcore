package com.hyunu.springcore;

import com.hyunu.springcore.discount.DiscountPolicy;
import com.hyunu.springcore.discount.FixDiscountPolicy;
import com.hyunu.springcore.discount.RateDiscountPolicy;
import com.hyunu.springcore.member.MemberService;
import com.hyunu.springcore.member.MemberServiceImpl;
import com.hyunu.springcore.member.MemoryMemberRepository;
import com.hyunu.springcore.order.OrderService;
import com.hyunu.springcore.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
