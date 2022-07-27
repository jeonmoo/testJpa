package com.example.studyJpa2.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    public MemberRepository memberRepository;

    public Optional<Member> login(Member member) {
        Optional<Member> user = Optional.ofNullable(memberRepository.findByMemberWhereUserIdAndUserPass(member));
        return user;
    }

}
