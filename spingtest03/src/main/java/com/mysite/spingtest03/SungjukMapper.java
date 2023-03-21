package com.mysite.spingtest03;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper	// interface를 Mapper로 등록하기 위해 사용(sql문을 호출하기 위해 사용)
public interface SungjukMapper {

	@Select("select * from sungjuk order by hakbun")
	public ArrayList<SungjukVO> getSungjuk();	// getMembers()를 호출하게 되면 매핑된 sql문을 실행
	
	@Select("select hakbun, name, grade from sungjuk order by hakbun")
	public ArrayList<HashMap<String, String>> getSungjuk2();
	
	
	@Insert("insert into sungjuk values("
			+ "#{members.hakbun}, #{members.name}, #{members.kor}, #{members.eng}, "
			+ "#{members.math}, #{members.total}, #{members.avg}, #{members.grade})")
	public int insertSungjuk(@Param("members") SungjukVO member);
	
	
	@Select("select * from sungjuk where hakbun=#{hakbun}")
	public SungjukVO selectSungjuk(@Param("hakbun") String hakbun);	// 파라미터가 1개인 경우 @Param 생략 가능
	
	@Select("select hakbun, name, grade from sungjuk where hakbun=#{hakbun}")
	public HashMap<String, String> selectSungjukData1(@Param("hakbun") String hakbun);


	@Update("update sungjuk set name=#{name}, kor=#{kor}, eng=#{eng}, math=#{math}, "
			+ "total=#{total}, avg=#{avg}, grade=#{grade} where hakbun=#{hakbun}")
	public int updateSungjuk(SungjukVO sungjuk);
	
	
	@Delete("delete from sungjuk where hakbun=#{hakbun}")
	public int deleteSungjuk(@Param("hakbun") String hakbun);
	
	@Select("select count(*) from sungjuk")
	public int countSungjuk();
}
