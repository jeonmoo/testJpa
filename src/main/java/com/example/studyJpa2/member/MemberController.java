package com.example.studyJpa2.member;

import com.example.studyJpa2.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/login")
    public Optional<Member> searchMember(@RequestBody Member member) {
        Optional<Member> result = memberService.login(member);
        return result;
    }

}
