package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_table")
public class Item {

	@Id
	@GeneratedValue
	private Integer id;

	private String itemCode;
	private Double itemWidth;
	private Double itemLength;
	private Double itemHeight;
	private Double itemCost;
	private String baseCurrency;

	@ManyToOne
	@JoinColumn(name = "UomItemFK")
	private Umo umoOb;

	@ManyToOne
	@JoinColumn(name = "OrderItemFK")
	private Order orderOb;

	public Item() {
		super();
	}

	public Item(Integer id) {
		super();
		this.id = id;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Double getItemWidth() {
		return itemWidth;
	}

	public void setItemWidth(Double itemWidth) {
		this.itemWidth = itemWidth;
	}

	public Double getItemLength() {
		return itemLength;
	}

	public void setItemLength(Double itemLength) {
		this.itemLength = itemLength;
	}

	public Double getItemHeight() {
		return itemHeight;
	}

	public void setItemHeight(Double itemHeight) {
		this.itemHeight = itemHeight;
	}

	public Double getItemCost() {
		return itemCost;
	}

	public void setItemCost(Double itemCost) {
		this.itemCost = itemCost;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public Umo getUmoOb() {
		return umoOb;
	}

	public void setUmoOb(Umo umoOb) {
		this.umoOb = umoOb;
	}

	
	public Order getOrderOb() {
		return orderOb;
	}

	public void setOrderOb(Order orderOb) {
		this.orderOb = orderOb;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemCode=" + itemCode + ", itemWidth=" + itemWidth + ", itemLength=" + itemLength
				+ ", itemHeight=" + itemHeight + ", itemCost=" + itemCost + ", baseCurrency=" + baseCurrency
				+ ", umoOb=" + umoOb + ", orderOb=" + orderOb + "]";
	}

}
