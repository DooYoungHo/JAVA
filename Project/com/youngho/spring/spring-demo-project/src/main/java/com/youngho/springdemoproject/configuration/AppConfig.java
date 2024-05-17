package com.youngho.springdemoproject.configuration;


import com.youngho.springdemoproject.repository.MemberRepository;
import com.youngho.springdemoproject.repository.MemoryMemberRepository;
import com.youngho.springdemoproject.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
