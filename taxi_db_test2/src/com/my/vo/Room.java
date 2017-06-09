package com.my.vo;

import java.util.Date;

public class Room {
	private String admin_id;
	private String max_cnt;
	private String payment;
	private String room_gender;
	private String alcohol;
	private String start_spot;
	private String end_spot;
	private String start_x;
	private String start_y;
	private String end_x;
	private String end_y;
	private Date start_time;
	private String room_state;
	
	public Room(String admin_id, String max_cnt, String payment, String room_gender, String alcohol, String start_spot,
			String end_spot, String start_x, String start_y, String end_x, String end_y, Date start_time,
			String room_state) {
		super();
		this.admin_id = admin_id;
		this.max_cnt = max_cnt;
		this.payment = payment;
		this.room_gender = room_gender;
		this.alcohol = alcohol;
		this.start_spot = start_spot;
		this.end_spot = end_spot;
		this.start_x = start_x;
		this.start_y = start_y;
		this.end_x = end_x;
		this.end_y = end_y;
		this.start_time = start_time;
		this.room_state = room_state;
	}
	
	@Override
	public String toString() {
		return "Room [admin_id=" + admin_id + ", max_cnt=" + max_cnt + ", payment=" + payment + ", room_gender="
				+ room_gender + ", alcohol=" + alcohol + ", start_spot=" + start_spot + ", end_spot=" + end_spot
				+ ", start_x=" + start_x + ", start_y=" + start_y + ", end_x=" + end_x + ", end_y=" + end_y
				+ ", start_time=" + start_time + ", room_state=" + room_state + "]";
	}
	
	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getMax_cnt() {
		return max_cnt;
	}

	public void setMax_cnt(String max_cnt) {
		this.max_cnt = max_cnt;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getRoom_gender() {
		return room_gender;
	}

	public void setRoom_gender(String room_gender) {
		this.room_gender = room_gender;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getStart_spot() {
		return start_spot;
	}

	public void setStart_spot(String start_spot) {
		this.start_spot = start_spot;
	}

	public String getEnd_spot() {
		return end_spot;
	}

	public void setEnd_spot(String end_spot) {
		this.end_spot = end_spot;
	}

	public String getStart_x() {
		return start_x;
	}

	public void setStart_x(String start_x) {
		this.start_x = start_x;
	}

	public String getStart_y() {
		return start_y;
	}

	public void setStart_y(String start_y) {
		this.start_y = start_y;
	}

	public String getEnd_x() {
		return end_x;
	}

	public void setEnd_x(String end_x) {
		this.end_x = end_x;
	}

	public String getEnd_y() {
		return end_y;
	}

	public void setEnd_y(String end_y) {
		this.end_y = end_y;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public String getRoom_state() {
		return room_state;
	}

	public void setRoom_state(String room_state) {
		this.room_state = room_state;
	}


	
}
