package com.ssafy.guestbook.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MemberDto {
	
	private String userName;
	private String userId;
	private String userPwd;
	private String email;
	private String joinDate;
	
	
	
}
