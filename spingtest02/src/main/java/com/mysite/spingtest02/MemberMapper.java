package com.mysite.spingtest02;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper	// interface를 Mapper로 등록하기 위해 사용(sql문을 호출하기 위해 사용)
public interface MemberMapper {	// 메소드와 sql 구문을 매핑 시켜주는 역할.
	
	@Select("select * from member order by id")
	ArrayList<MemberVO> getMembers();	// getMembers()를 호출하게 되면 매핑된 sql문을 실행
	
	@Insert("insert into member values(#{id}, #{pw}, #{email})")
	int insertMember(MemberVO member);
}
