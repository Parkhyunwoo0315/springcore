package com.hyunu.springcore.member;

public interface MemberRepository {

    void save(Member member);

    Member findId(Long memberId);
}