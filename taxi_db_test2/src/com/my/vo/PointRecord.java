package com.my.vo;

import java.util.Date;

public class PointRecord {

	private String info_id;
	private int point;
	private Date date;
	private int type;
	private int method;
	
	public PointRecord(String info_id, int point, Date date, int type, int method) {
		super();
		this.info_id = info_id;
		this.point = point;
		this.date = date;
		this.type = type;
		this.method = method;
	}
	
	@Override
	public String toString() {
		return "PointRecord [info_id=" + info_id + ", point=" + point + ", date=" + date + ", type=" + type
				+ ", method=" + method + "]";
	}
	
	public String getInfo_id() {
		return info_id;
	}

	public void setInfo_id(String info_id) {
		this.info_id = info_id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMethod() {
		return method;
	}

	public void setMethod(int method) {
		this.method = method;
	}

	
	
}
