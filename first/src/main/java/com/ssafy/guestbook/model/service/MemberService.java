package com.ssafy.guestbook.model.service;

import java.util.Map;

import com.ssafy.guestbook.model.MemberDto;

public interface MemberService {
	
	MemberDto login(Map<String, String> map) throws Exception;
	void register(MemberDto memberdto) throws Exception;
	void updateMember(MemberDto memberDto) throws Exception;
	void deleteMember(String userId) throws Exception;
	MemberDto profile(String userId) throws Exception;
}
