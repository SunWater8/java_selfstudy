package com.bitcamp.firstSpring.member.domain;

public class OrderItem {

	private String itemId;
	private int itemNumber;
	private String warning;
	
	
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemIdx) {
		this.itemNumber = itemIdx;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}
	@Override
	public String toString() {
		return "OrerItem [itemId=" + itemId + ", itemNumber=" + itemNumber + ", warning=" + warning + "]";
	}
	
	
}
