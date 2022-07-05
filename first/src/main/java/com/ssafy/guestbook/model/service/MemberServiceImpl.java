package com.ssafy.guestbook.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.guestbook.model.MemberDto;
import com.ssafy.guestbook.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberDto login(Map<String, String> map) throws Exception {
		return memberMapper.login(map);
	}
	
	@Override
	public MemberDto profile(String userId) throws Exception {
		return memberMapper.profile(userId);
	}
	
	@Override
	public void register(MemberDto memberdto) throws Exception {
		memberMapper.register(memberdto);
	}
	
	@Override
	public void updateMember(MemberDto memberDto) throws Exception {
		memberMapper.updateMember(memberDto);
	}
	
	@Override
	public void deleteMember(String userId) throws Exception{
		memberMapper.deleteMember(userId);
	}
}
