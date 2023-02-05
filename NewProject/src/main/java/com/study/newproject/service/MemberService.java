package com.study.newproject.service;

import com.study.newproject.domain.Member;
import com.study.newproject.repository.MemberRepository;
import com.study.newproject.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public Long join(Member member){
        // 같은 이름의 중복 회원 X
        Optional<Member> result = memberRepository.findByName(member.getName());
        // ifPresent는 result가 null이 아니라 어떤 값이 있으면 밑에 로직이 동작하는 것, optional 이었기 때문에 가능
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
        memberRepository.save(member);
        return member.getId();
    }

//        memberRepository.findByName(member.getName())
//	            .ifPresent(m -> {
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });



        /**
         * 전체 회원 조회
         */
        public List<Member> findMembers() {
            return memberRepository.findAll();
        }

        public Optional<Member> findOne(Long memberId) {
            return memberRepository.findById(memberId);
        }
}

