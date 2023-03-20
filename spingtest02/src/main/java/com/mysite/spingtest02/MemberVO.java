package com.mysite.spingtest02;

import lombok.Data;

@Data	// get,set 메서드, default 생성자, 모든 agument 생성자 등을 자동으로 생성함.
public class MemberVO {
	private String id;
	private String pw;
	private String email;
}
