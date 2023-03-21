package com.mysite.spingtest03;

import lombok.Data;

@Data
public class SungjukVO {
	private String hakbun;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;

	public void processSungjuk() {
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3;

		switch ((int) this.avg / 10) {
		case 10:
		case 9:
			this.grade = "수";
			break;
		case 8:
			this.grade = "우";
			break;
		case 7:
			this.grade = "미";
			break;
		case 6:
			this.grade = "양";
			break;
		default:
			this.grade = "가";
			break;
		}
	}
}
