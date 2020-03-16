package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parttaba")
public class Parts {
	@Id
	@GeneratedValue
	@Column(name = "prtid")
	private Integer partId;
	private String partCode;

	private Double partWidth;
	private Double partLength;
	private Double partHeight;
	
	@ManyToOne
	@JoinColumn(name="umidFk")
	private Uom uomObj;
	
	@ManyToOne
	@JoinColumn(name="omidsaleFk")
	private OrderMethod ordSaleOb;
	
	@ManyToOne
	@JoinColumn(name="omidPurcFk")
	private OrderMethod ordPurOb;
	
	private String partBcost;
	private String partDesc;

	public Parts() {
		super();
	}

	public Parts(Integer partId) {
		super();
		this.partId = partId;
	}

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public String getPartCode() {
		return partCode;
	}

	public OrderMethod getOrdSaleOb() {
		return ordSaleOb;
	}

	public void setOrdSaleOb(OrderMethod ordSaleOb) {
		this.ordSaleOb = ordSaleOb;
	}

	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}

	public Double getPartWidth() {
		return partWidth;
	}

	public void setPartWidth(Double partWidth) {
		this.partWidth = partWidth;
	}

	public Double getPartLength() {
		return partLength;
	}

	public void setPartLength(Double partLength) {
		this.partLength = partLength;
	}

	public Double getPartHeight() {
		return partHeight;
	}

	public void setPartHeight(Double partHeight) {
		this.partHeight = partHeight;
	}

	public OrderMethod getOrdPurOb() {
		return ordPurOb;
	}

	public void setOrdPurOb(OrderMethod ordPurOb) {
		this.ordPurOb = ordPurOb;
	}

	public Uom getUomObj() {
		return uomObj;
	}

	public void setUomObj(Uom uomObj) {
		this.uomObj = uomObj;
	}

	public String getPartBcost() {
		return partBcost;
	}

	public void setPartBcost(String partBcost) {
		this.partBcost = partBcost;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	@Override
	public String toString() {
		return "Parts [partId=" + partId + ", partCode=" + partCode + ", partWidth=" + partWidth + ", partLength="
				+ partLength + ", partHeight=" + partHeight + ", uomObj=" + uomObj + ", ordSaleOb=" + ordSaleOb
				+ ", ordPurOb=" + ordPurOb + ", partBcost=" + partBcost + ", partDesc=" + partDesc + "]";
	}
	
}
