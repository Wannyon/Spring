package com.mysite.spingtest03;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class SungjukServiceImpl implements SungjukService {

	SungjukMapper mapper;
	
	public SungjukServiceImpl (SungjukMapper mapper) {	// 생성자 형식(권장)
		this.mapper = mapper;
	}
	
	@Override
	public ArrayList<SungjukVO> getSungjuk() {
		ArrayList<SungjukVO> sungjuklist = mapper.getSungjuk();
		return sungjuklist;
	}
	
	@Override
	public ArrayList<HashMap<String, String>> getSungjuk2() {
		ArrayList<HashMap<String, String>> sungjuklist = mapper.getSungjuk2();
		return sungjuklist;
	}
	
	@Override
	public int insertSungjuk(SungjukVO member) {
		member.processSungjuk();
		int res = mapper.insertSungjuk(member);
		return res;
	}

	@Override
	public SungjukVO selectSungjuk(String hakbun) {
		SungjukVO vo = mapper.selectSungjuk(hakbun);
		return vo;
	}
	
	@Override
	public HashMap<String, String> selectSungjukData1(String hakbun) {
		HashMap<String, String> vo = mapper.selectSungjukData1(hakbun);
		return vo;
	}
	
	@Override
	public int updateSungjuk(SungjukVO sungjuk) {
		sungjuk.processSungjuk();
		int res = mapper.updateSungjuk(sungjuk);
		return res;
	}
	
	@Override
	public int deleteSungjuk(String hakbun) {
		int res = mapper.deleteSungjuk(hakbun);
		return res;
	}
	
	@Override
	public int countSungjuk() {
		int res = mapper.countSungjuk();
		return res;
	}
}
