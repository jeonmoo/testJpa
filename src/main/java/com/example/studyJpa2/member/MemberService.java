package com.example.studyJpa2.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getMember() {
        return memberRepository.findAll();
    }

    public Optional<Member> getMemberById(Long id) {
        return memberRepository.findById(id);
    }

    public Member getMemberById2(Long id) {
        return memberRepository.findById2(id);
    }


    public List<Member> getMembers() {
        return memberRepository.findAll();
    }



}
