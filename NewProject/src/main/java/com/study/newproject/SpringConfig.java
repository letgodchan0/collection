package com.study.newproject;

import com.study.newproject.repository.MemberRepository;
import com.study.newproject.repository.MemoryMemberRepository;
import com.study.newproject.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
