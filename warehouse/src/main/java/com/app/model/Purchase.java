package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="purchase_tab")
public class Purchase {
	
	@Id
	@GeneratedValue
	@Column(name="pid")
	private Integer purchaseId;
	private String purCode;
	private String refNum;
	private String quality;
	private String status;
	private String note;
	
	@ManyToOne
	@JoinColumn(name="PurShipFK")
	private ShipmentType shtOb;
	
	@ManyToOne 
	@JoinColumn(name="PurWhuFK")
	private WhUserType whuOb;
	
	public Purchase() {
		super();
	}
	
	public Purchase(Integer purchaseId) {
		super();
		this.purchaseId = purchaseId;
	}
	
	public Integer getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getRefNum() {
		return refNum;
	}
	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getPurCode() {
		return purCode;
	}
	public void setPurCode(String purCode) {
		this.purCode = purCode;
	}
	
	
	public ShipmentType getShtOb() {
		return shtOb;
	}

	public void setShtOb(ShipmentType shtOb) {
		this.shtOb = shtOb;
	}

	public WhUserType getWhuOb() {
		return whuOb;
	}

	public void setWhuOb(WhUserType whuOb) {
		this.whuOb = whuOb;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", purCode=" + purCode + ", refNum=" + refNum + ", quality="
				+ quality + ", status=" + status + ", note=" + note + ", shtOb=" + shtOb + ", whuOb=" + whuOb + "]";
	}
	
	
	
	

}
