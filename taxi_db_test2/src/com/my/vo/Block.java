package com.my.vo;

public class Block {
	
	private String info_id;
	private String block_to_id;
	
	public Block(String info_id, String block_to_id) {
		super();
		this.info_id = info_id;
		this.block_to_id = block_to_id;
	}
	
	public String getInfo_id() {
		return info_id;
	}
	public void setInfo_id(String info_id) {
		this.info_id = info_id;
	}
	public String getBlock_to_id() {
		return block_to_id;
	}
	public void setBlock_to_id(String block_to_id) {
		this.block_to_id = block_to_id;
	}
	
}
