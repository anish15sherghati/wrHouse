package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipggtab")
public class Shipping {

	@Id
	@GeneratedValue
	@Column(name="shipId")
	private Integer shipId;
	private String shipCode;
	private String shipRefNum;
	private String courRefNum;
	private Integer contDetails;
	private String salOrder;
	private String shipDesc;
	private String billAddr;
	private String shipAddr;

	public Shipping() {
		super();
	}

	public Shipping(Integer shipId) {
		super();
		this.shipId = shipId;
	}

	public Integer getShipId() {
		return shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public String getShipRefNum() {
		return shipRefNum;
	}

	public void setShipRefNum(String shipRefNum) {
		this.shipRefNum = shipRefNum;
	}

	public String getCourRefNum() {
		return courRefNum;
	}

	public void setCourRefNum(String courRefNum) {
		this.courRefNum = courRefNum;
	}

	public Integer getContDetails() {
		return contDetails;
	}

	public void setContDetails(Integer contDetails) {
		this.contDetails = contDetails;
	}

	public String getSalOrder() {
		return salOrder;
	}

	public void setSalOrder(String salOrder) {
		this.salOrder = salOrder;
	}

	public String getShipDesc() {
		return shipDesc;
	}

	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}

	public String getBillAddr() {
		return billAddr;
	}

	public void setBillAddr(String billAddr) {
		this.billAddr = billAddr;
	}

	public String getShipAddr() {
		return shipAddr;
	}

	public void setShipAddr(String shipAddr) {
		this.shipAddr = shipAddr;
	}

	@Override
	public String toString() {
		return "Shipping [shipId=" + shipId + ", shipCode=" + shipCode + ", shipRefNum=" + shipRefNum + ", courRefNum="
				+ courRefNum + ", contDetails=" + contDetails + ", salOrder=" + salOrder + ", shipDesc=" + shipDesc
				+ ", billAddr=" + billAddr + ", shipAddr=" + shipAddr + "]";
	}

}
