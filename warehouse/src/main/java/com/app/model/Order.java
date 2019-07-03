package com.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_table")
public class Order {
	
	@Id
	@GeneratedValue
	private Integer orderId;
	@Column(name="oMode")
	private String orderMode;
	@Column(name="oCode")
	private String orderCode;
	@Column(name="oType")
	private String orderType;
	@ElementCollection(fetch = FetchType.EAGER)
	//@CollectionTable(name="order_accepet_table")
	//@Column(name="oAccept")
	private List<String> orderAccept;
	private String note;
	
	public Order() {
		super();
	}
	
		public Order(Integer orderId) {
		super();
		this.orderId = orderId;
	}

		public Order(Integer orderId, String orderMode, String orderCode, String orderType, List<String> orderAccept,
			String note) {
		super();
		this.orderId = orderId;
		this.orderMode = orderMode;
		this.orderCode = orderCode;
		this.orderType = orderType;
		this.orderAccept = orderAccept;
		this.note = note;
	}
		public Order(String orderMode, String orderCode, String orderType, List<String> orderAccept, String note) {
		super();
		this.orderMode = orderMode;
		this.orderCode = orderCode;
		this.orderType = orderType;
		this.orderAccept = orderAccept;
		this.note = note;
	}
		public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderMode() {
		return orderMode;
	}
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public List<String> getOrderAccept() {
		return orderAccept;
	}
	public void setOrderAccept(List<String> orderAccept) {
		this.orderAccept = orderAccept;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderMode=" + orderMode + ", orderCode=" + orderCode + ", orderType="
				+ orderType + ", orderAccept=" + orderAccept + ", note=" + note + "]";
	}
	
	
	

}
