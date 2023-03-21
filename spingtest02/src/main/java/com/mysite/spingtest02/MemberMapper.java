package com.mysite.spingtest02;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper	// interface를 Mapper로 등록하기 위해 사용(sql문을 호출하기 위해 사용)
public interface MemberMapper {	// 메소드와 sql 구문을 매핑 시켜주는 역할.
	
	@Select("select * from member order by id")
	ArrayList<MemberVO> getMembers();	// getMembers()를 호출하게 되면 매핑된 sql문을 실행
	
	
//	@Insert("insert into member values(#{id}, #{pw}, #{email})")
//	int insertMember(MemberVO member);	
	@Insert("insert into member values(#{member.id}, #{member.pw}, #{member.email})")
	int insertMember(@Param("member") MemberVO member);
	
	
	@Select("select * from member where id=#{id}")
	public MemberVO selectMember(@Param("id") String id);	// 파라미터가 1개인 경우 @Param 생략 가능	
//	@Select("select * from member where id=#{id} and pw=#{pw}")
//	public MemberVO selectMember(@Param("id") String id, @Param("pw") String pw);
	
	
//	@Update("update member set pw=#{pw}, email=#{email} where id=#{id}")
//	public int updateMember(@Param("id") String id, @Param("pw") String pw, @Param("email") String email);
	@Update("update member set pw=#{pw}, email=#{email} where id=#{id}")
	public int updateMember(MemberVO member);
	
	
	@Delete("delete from member where id=#{id}")
	public int deleteMember(@Param("id") String id); // @Param("id") : 파라미터가 하나일때는 생략 가능
	
	
	@Select("select count(*) from member")
	public int countMember();
}
