package com.study.newproject.repository;

import com.study.newproject.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// 회원 레포지토리 인터페이스

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);
    Optional<Member> findByName(String namd);
    List<Member> findAll();
}
