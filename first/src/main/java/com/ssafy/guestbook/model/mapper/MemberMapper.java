package com.ssafy.guestbook.model.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.guestbook.model.MemberDto;

@Mapper
public interface MemberMapper {
	
	MemberDto login(Map<String, String> map) throws Exception;
	void register(MemberDto memberDto) throws Exception;
	void updateMember(MemberDto memberDto) throws Exception;
	void deleteMember(String userId) throws Exception;
	MemberDto profile(String userId) throws Exception;
}
