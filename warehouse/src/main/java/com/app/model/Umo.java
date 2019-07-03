package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="umo_tab")
public class Umo {
	@Id
	@GeneratedValue
	private Integer umoId;
	private String umoType;
	private String umoModel;
	private String note;
	
	public Umo() {
		super();
	}

	public Umo(String umoType, String umoModel, String note) {
		super();
		this.umoType = umoType;
		this.umoModel = umoModel;
		this.note = note;
	}

	public Umo(Integer umoId, String umoType, String umoModel, String note) {
		super();
		this.umoId = umoId;
		this.umoType = umoType;
		this.umoModel = umoModel;
		this.note = note;
	}

	public Integer getUmoId() {
		return umoId;
	}

	public void setUmoId(Integer umoId) {
		this.umoId = umoId;
	}

	public String getUmoType() {
		return umoType;
	}

	public void setUmoType(String umoType) {
		this.umoType = umoType;
	}

	public String getUmoModel() {
		return umoModel;
	}

	public void setUmoModel(String umoModel) {
		this.umoModel = umoModel;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Umo [umoId=" + umoId + ", umoType=" + umoType + ", umoModel=" + umoModel + ", note=" + note + "]";
	}
	
	
}
