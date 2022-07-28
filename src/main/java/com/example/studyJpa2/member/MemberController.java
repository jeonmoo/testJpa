package com.example.studyJpa2.member;

import com.example.studyJpa2.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/getMember")
    public Map<String, Object> getMember(@RequestParam Long id) {
        Map<String, Object> mp = new HashMap<>();
        mp.put("code", "1");

        List<Member> members = memberService.getMembers();
        mp.put("allMembers", members);

        Optional<Member> mem1 = memberService.getMemberById(id);
        mp.put("member1", mem1);

        Member mem2 = memberService.getMemberById2(id);
        mp.put("member2", mem2);

        return mp;
    }



}
