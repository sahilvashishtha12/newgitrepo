package com.apitest.pojo;

public class Payload {

	String sex;
	int age;
	Components comp;
	userifo uinfo;
	
	
	public Payload(String sex, int age, Components comp, userifo uinfo) {
		super();
		this.sex = sex;
		this.age = age;
		this.comp = comp;
		this.uinfo = uinfo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Components getComp() {
		return comp;
	}
	public void setComp(Components comp) {
		this.comp = comp;
	}
	public userifo getUinfo() {
		return uinfo;
	}
	public void setUinfo(userifo uinfo) {
		this.uinfo = uinfo;
	}
	
	
}
