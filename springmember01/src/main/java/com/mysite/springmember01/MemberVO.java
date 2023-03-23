package com.mysite.springmember01;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private int age;
	private String gender;
	private String email;
}
