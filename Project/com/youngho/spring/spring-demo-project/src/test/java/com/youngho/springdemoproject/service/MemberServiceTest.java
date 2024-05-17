package com.youngho.springdemoproject.service;

import com.youngho.springdemoproject.domain.Member;
import com.youngho.springdemoproject.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class MemberServiceTest {

    MemoryMemberRepository memberRepository;
    MemberService memberService;

    // 각 메서드 테스트 전 실행하는 메서드
    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    // 각 메서드 테스트 후 실행하는 메서드
    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    // 회원가입 테스트 메서드
    @Test
    void join() throws Exception {
        // given
        Member member = new Member();
        member.setName("영호");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberRepository.findById(saveId).get();
        assertEquals(member.getName(), findMember.getName());
    }

    // 이름 중복검사 테스트 메서드
    @Test
    void validateDuplicateMember() throws Exception {
        // given
        Member member1 = new Member();
        member1.setName("두호");

        Member member2 = new Member();
        member2.setName("두호");

        // when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> memberService.join(member2));

        // then
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }

    @Test
    void findMembers() throws Exception {
        // given
        Member member1 = new Member();
        member1.setName("두영호");
        memberService.join(member1);

        Member member2 = new Member();
        member2.setName("두세준");
        memberService.join(member2);

        // when
        List<Member> memberList = memberService.findMembers();

        // then
        assertThat(memberList.size()).isEqualTo(2);
    }

    @Test
    void findOne() {
    }
}