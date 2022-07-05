package com.ssafy.guestbook.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.guestbook.model.MemberDto;
import com.ssafy.guestbook.model.service.MemberService;

@RestController
@RequestMapping("/user")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> map) throws Exception {
		int auth;
		MemberDto memberDto = memberService.login(map);
		if (memberDto != null) {
			auth = 1;
			return new ResponseEntity<Integer>(auth, HttpStatus.OK) ;
		} else {
			auth = 0;
			return new ResponseEntity<Integer>(auth, HttpStatus.UNAUTHORIZED);
		}
		
	}
	
	
	@GetMapping("/profile")
	public ResponseEntity<?> profile(@RequestBody String userId) throws Exception {
		MemberDto memberDto = memberService.profile(userId);
		return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
		
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody MemberDto memberDto) throws Exception{
		memberService.register(memberDto);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PutMapping("/register")
	public ResponseEntity<?> updateMember(@RequestBody MemberDto memberDto) throws Exception{
		memberService.updateMember(memberDto);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@DeleteMapping("/register")
	public ResponseEntity<?> deleteMember(@RequestBody String userId) throws Exception{
		memberService.deleteMember(userId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
