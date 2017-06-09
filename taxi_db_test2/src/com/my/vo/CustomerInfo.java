package com.my.vo;

public class CustomerInfo{

	private String info_id;
	private String phone_no;
	private String info_name;
	private String nickname;
	private String info_gender;
	private int point;
	private int score;
	private int cnt;
	public CustomerInfo(){
		
	}
	public CustomerInfo(String info_id, String phone_no, String info_name, String nickname, String info_gender, int point,
			int score, int cnt) {
		super();
		this.info_id = info_id;
		this.phone_no = phone_no;
		this.info_name = info_name;
		this.nickname = nickname;
		this.info_gender = info_gender;
		this.point = point;
		this.score = score;
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "Customer [info_id=" + info_id + ", phone_no=" + phone_no + ", info_name=" + info_name + ", nickname="
				+ nickname + ", info_gender=" + info_gender + ", point=" + point + ", score=" + score + ", cnt=" + cnt
				+ "]";
	}
	
	
	public String getInfo_id() {
		return info_id;
	}
	public void setInfo_id(String info_id) {
		this.info_id = info_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getInfo_name() {
		return info_name;
	}
	public void setInfo_name(String info_name) {
		this.info_name = info_name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getInfo_gender() {
		return info_gender;
	}
	public void setInfo_gender(String info_gender) {
		this.info_gender = info_gender;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
