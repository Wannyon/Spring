package com.mysite.springmember01;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberMapper {
	
	@Insert("insert into smember values (#{id},#{password},#{name},#{age},#{gender},#{email})")
	public int insertMember(MemberVO memberVO);
	
	@Select("select count(*) from smember where id=#{id} and password=#{password}")
	public int userCheck(@Param("id") String id, @Param("password") String password);
	
	@Select("select * from smember order by id")
	public ArrayList<MemberVO> getMemberlist();
	
	@Select("select * from smember where id =#{id}")
	public MemberVO selectMember(MemberVO memberVO);
	
	@Delete("delete from smember where id =#{id}")
	public int deleteMember(MemberVO memberVO);
	
	@Update("update smember set password=#{password}, name=#{name}, age=#{age}, "
			+ "gender=#{gender}, email=#{email} where id=#{id}")
	public int updateMember(MemberVO memberVO);
	
	
}
