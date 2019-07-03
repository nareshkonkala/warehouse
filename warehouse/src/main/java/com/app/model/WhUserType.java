package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="whuser_tab")
public class WhUserType {

	@Id
	@GeneratedValue
	@Column(name="whId")
	private Integer id;
	private String whType;
	private String whCode;
	private String whFor;
	private String whEmail;
	private String whcontact;
	private String whIdType;
	private String whIdNum;
	
	public WhUserType() {
		super();
	}
	
	public WhUserType(Integer id) {
		super();
		this.id = id;
	}
	
	public WhUserType(Integer id, String whType, String whCode, String whFor, String whEmail, String whcontact,
			String whIdType, String whIdNum) {
		super();
		this.id = id;
		this.whType = whType;
		this.whCode = whCode;
		this.whFor = whFor;
		this.whEmail = whEmail;
		this.whcontact = whcontact;
		this.whIdType = whIdType;
		this.whIdNum = whIdNum;
	}

	public WhUserType(String whType, String whCode, String whFor, String whEmail, String whcontact, String whIdType,
			String whIdNum) {
		super();
		this.whType = whType;
		this.whCode = whCode;
		this.whFor = whFor;
		this.whEmail = whEmail;
		this.whcontact = whcontact;
		this.whIdType = whIdType;
		this.whIdNum = whIdNum;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getWhType() {
		return whType;
	}

	public void setWhType(String whType) {
		this.whType = whType;
	}
	public String getWhCode() {
		return whCode;
	}
	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}
	public String getWhFor() {
		return whFor;
	}
	public void setWhFor(String whFor) {
		this.whFor = whFor;
	}
	public String getWhEmail() {
		return whEmail;
	}
	public void setWhEmail(String whEmail) {
		this.whEmail = whEmail;
	}
	public String getWhcontact() {
		return whcontact;
	}
	public void setWhcontact(String whcontact) {
		this.whcontact = whcontact;
	}
	public String getWhIdType() {
		return whIdType;
	}
	public void setWhIdType(String whIdType) {
		this.whIdType = whIdType;
	}
	public String getWhIdNum() {
		return whIdNum;
	}
	public void setWhIdNum(String whIdNum) {
		this.whIdNum = whIdNum;
	}
	
	@Override
	public String toString() {
		return "WhUserType [id=" + id + ", whType=" + whType + ", whCode=" + whCode + ", whFor=" + whFor + ", whEmail="
				+ whEmail + ", whcontact=" + whcontact + ", whIdType=" + whIdType + ", whIdNum=" + whIdNum + "]";
	}
	
	
}
