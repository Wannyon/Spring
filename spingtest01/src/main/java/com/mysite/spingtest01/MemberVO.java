package com.mysite.spingtest01;

import lombok.Data;

@Data	// get/set 메서드, toString(), hashCode(), equals()를 자동으로 생성함
public class MemberVO {
	private int num;
	private String irum;
	private int age;
	
// @Data를 쓰면 get/set 메소드 생략
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
//	public String getIrum() {
//		return irum;
//	}
//	public void setIrum(String irum) {
//		this.irum = irum;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	@Override
//	public String toString() {
//		return "MemberVO [num=" + num + ", irum=" + irum + ", age=" + age + "]";
//	}
}
