package com.mysite.spingtest02;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data	// get,set 메서드, default 생성자, 모든 agument 생성자 등을 자동으로 생성함.
@Getter	//get
@Setter //set
@NoArgsConstructor	// 파라미터가 없는 기본 생성자 생성
@AllArgsConstructor	// 모든 필드 값을 파라미터로 받는 생성자를 생성.
//@RequiredArgsConstructor // final필드, @NonNull 인 필드 값만 파라미터를 받는 생성자 구현
@ToString	// ToString 생성
@EqualsAndHashCode	// equals와 hashcode 메소드 생성
@Builder
public class MemberVO {
	private String id;
	private String pw;
	private String email;
}
