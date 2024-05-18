package com.youngho.springdemoproject.controller;

import com.youngho.springdemoproject.domain.Member;
import com.youngho.springdemoproject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new")
    public String createForm() {
        return "users/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String create(MemberForm memberForm) {
        Member member = new Member();
        member.setName(memberForm.getName());

        memberService.join(member);

        return "redirect:/";        // 홈 화면으로 되돌아가기
    }

    @GetMapping(value = "/members")
    public String memberList(Model model) {
        List<Member> memberList = memberService.findMembers();
        model.addAttribute("members", memberList);
        return "users/memberList";
    }

}
