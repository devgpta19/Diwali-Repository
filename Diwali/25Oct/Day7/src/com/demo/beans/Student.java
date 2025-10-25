package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
	private int roll;
	private String sname;
	private String course;
	private float attPerc;
	private int score;
	public Student() {
		super();
	}
	public Student(int roll, String sname, String course, float attPerc, int score) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.course = course;
		this.attPerc = attPerc;
		this.score = score;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getAttPerc() {
		return attPerc;
	}
	public void setAttPerc(float attPerc) {
		this.attPerc = attPerc;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", course=" + course + ", attPerc=" + attPerc + ", score="
				+ score + "]";
	}
	@Override
	public int compareTo(Student o) {
		if((int)(this.getAttPerc()-o.getAttPerc()) == 0) {
			return o.getRoll()-this.getRoll();
		}
		return (int) (o.getAttPerc()-this.getAttPerc());
	}
	
}
