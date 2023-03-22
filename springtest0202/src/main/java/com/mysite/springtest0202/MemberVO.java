package com.mysite.springtest0202;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
create table member (
	id varchar(20) primary key,
    pw varchar(20) not null,
    email varchar(50) not null
);
 */

//@Data // get/set 메서드, default 생성자, 모든 아규먼트 생성자 등을 자동으로 생성함
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class MemberVO {
	private String id;
	private String pw;
	private String email;
}
