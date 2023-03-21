package com.mysite.spingtest03;

import java.util.ArrayList;
import java.util.HashMap;

public interface SungjukService {
	ArrayList<SungjukVO> getSungjuk();
	public ArrayList<HashMap<String, String>> getSungjuk2();
	int insertSungjuk(SungjukVO member);
	public SungjukVO selectSungjuk(String hakbun);
	public HashMap<String, String> selectSungjukData1(String hakbun);
	public int updateSungjuk(SungjukVO sungjuk);
	public int deleteSungjuk(String hakbun);
	public int countSungjuk();
}
