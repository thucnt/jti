package com.rajesh.json;

public class TargetDetailVO {
	private String id;
	private String quantity;
	
	public TargetDetailVO(){}
	public TargetDetailVO(String criteriaId, String quantity) {
		super();
		this.id = criteriaId;
		this.quantity = quantity;
	}
	public String geId() {
		return id;
	}
	public void setId(String criteriaId) {
		this.id = criteriaId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
}
