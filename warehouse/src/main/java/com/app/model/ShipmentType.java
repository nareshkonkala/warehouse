package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipment_type_tab")
public class ShipmentType {
	
	@Id
	@GeneratedValue
	private Integer stId;
	private String stMode;
	private String stCode;
	private String enableShipment;
	private String stGrade;
	private String stNote;
	
	public ShipmentType() {
		super();
	}
	public ShipmentType(String stMode, String stCode, String enableShipment, String stGrade, String stNote) {
		super();
		this.stMode = stMode;
		this.stCode = stCode;
		this.enableShipment = enableShipment;
		this.stGrade = stGrade;
		this.stNote = stNote;
	}
	public ShipmentType(Integer stId, String stMode, String stCode, String enableShipment, String stGrade,
			String stNote) {
		super();
		this.stId = stId;
		this.stMode = stMode;
		this.stCode = stCode;
		this.enableShipment = enableShipment;
		this.stGrade = stGrade;
		this.stNote = stNote;
	}
	
	public Integer getStId() {
		return stId;
	}
	public void setStId(Integer stId) {
		this.stId = stId;
	}
	public String getStMode() {
		return stMode;
	}
	public void setStMode(String stMode) {
		this.stMode = stMode;
	}
	public String getStCode() {
		return stCode;
	}
	public void setStCode(String stCode) {
		this.stCode = stCode;
	}
	public String getEnableShipment() {
		return enableShipment;
	}
	public void setEnableShipment(String enableShipment) {
		this.enableShipment = enableShipment;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	public String getStNote() {
		return stNote;
	}
	public void setStNote(String stNote) {
		this.stNote = stNote;
	}
	
	@Override
	public String toString() {
		return "ShipmentType [stId=" + stId + ", stMode=" + stMode + ", stCode=" + stCode + ", enableShipment="
				+ enableShipment + ", stGrade=" + stGrade + ", stNote=" + stNote + "]";
	}
	
	

}
