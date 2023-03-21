package com.mysite.spingtest03;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SungjukController {
	
	SungjukServiceImpl sungjukServiceImpl;
	
	public SungjukController (SungjukServiceImpl sungjukServiceImpl) {
		this.sungjukServiceImpl = sungjukServiceImpl;
	}
	
	@GetMapping("/getMembers")
//	@RequestMapping(value="/getMembers", method=RequestMethod.GET)
	public ArrayList<SungjukVO> getSungjuk() {
		ArrayList<SungjukVO> sungjuklist = sungjukServiceImpl.getSungjuk();
		return sungjuklist;
	}
	
	@GetMapping("/getMembers2")
	public ArrayList<HashMap<String, String>> getSungjuk2() {
		ArrayList<HashMap<String, String>> sungjuklist = sungjukServiceImpl.getSungjuk2();
		return sungjuklist;
	}
	
	@PostMapping("/insertMember")
	public int insertMember(SungjukVO member) {
		int res = sungjukServiceImpl.insertSungjuk(member);
		
		return res;
	}
	
	@GetMapping("/selectMember")
	public SungjukVO selectSungjuk(@RequestParam String hakbun) {
		SungjukVO vo = sungjukServiceImpl.selectSungjuk(hakbun);
		return vo;
	}
	
	@GetMapping("/selectData1")
	public HashMap<String, String> selectSungjukData1(String hakbun) {
		HashMap<String, String> vo = sungjukServiceImpl.selectSungjukData1(hakbun);
		return vo;
	}
	
	@PostMapping("/updateMember")
	public int updateSungjuk(SungjukVO sungjuk) {
		int res = sungjukServiceImpl.updateSungjuk(sungjuk);
		return res;
	}
	
	@PostMapping("/deleteMember")
	public int deleteMember(String hakbun) {
		int res = sungjukServiceImpl.deleteSungjuk(hakbun);
		return res;
	}
	
	@GetMapping("/countMember")
	public int countMember() {
		int res = sungjukServiceImpl.countSungjuk();
		return res;
	}
}
