package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="grn_tab")
public class Grn {
	@Id
	@GeneratedValue
	private Integer grnId;
	private String grnCode;
	private String grnType;
	private String note;
	
	@ManyToOne
	@JoinColumn(name="GrnOrderFK")
	private Order ordObj;
	
	public Grn() {
		super();
	}
	
	public Grn(Integer grnId) {
		super();
		this.grnId = grnId;
	}
	public Integer getGrnId() {
		return grnId;
	}
	public void setGrnId(Integer grnId) {
		this.grnId = grnId;
	}
	public String getGrnCode() {
		return grnCode;
	}
	public void setGrnCode(String grnCode) {
		this.grnCode = grnCode;
	}
	public String getGrnType() {
		return grnType;
	}
	public void setGrnType(String grnType) {
		this.grnType = grnType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Order getOrdObj() {
		return ordObj;
	}

	public void setOrdObj(Order ordObj) {
		this.ordObj = ordObj;
	}

	@Override
	public String toString() {
		return "Grn [grnId=" + grnId + ", grnCode=" + grnCode + ", grnType=" + grnType + ", note=" + note + ", ordObj="
				+ ordObj + "]";
	}
	
	
	
	

}
