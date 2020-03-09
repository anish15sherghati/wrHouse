package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shptab")
public class ShipmentType {

	@Id
	@GeneratedValue
	@Column(name = "sid")
	private Integer shipId;
	@Column(name = "smode", length = 10)
	private String shipMode;
	@Column(name = "scode", length = 10)
	private String shipCode;
	@Column(name = "eship", length = 10)
	private String enabShip;
	@Column(name = "sgrade", length = 10)
	private String shipGrade;
	@Column(name = "sdesc", length = 40)
	private String shipDesc;

	public ShipmentType() {
		super();
	}

	public ShipmentType(Integer shipId) {
		super();
		this.shipId = shipId;
	}

	public Integer getShipId() {
		return shipId;
	}

	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}

	public String getShipMode() {
		return shipMode;
	}

	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}
	public String getEnabShip() {
		return enabShip;
	}
	public void setEnabShip(String enabShip) {
		this.enabShip = enabShip;
	}

	public String getShipGrade() {
		return shipGrade;
	}

	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}

	public String getShipDesc() {
		return shipDesc;
	}

	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}

	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipMode=" + shipMode + ", shipCode=" + shipCode + ", enabShip="
				+ enabShip + ", shipGrade=" + shipGrade + ", shipDesc=" + shipDesc + "]";
	}

}
