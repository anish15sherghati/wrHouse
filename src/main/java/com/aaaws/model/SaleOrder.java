package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salordtab")
public class SaleOrder {

	@Id
	@GeneratedValue
	@Column(name = "sid")
	private Integer salId;
	private String salCode;
	
	@ManyToOne
	private ShipmentType shipObj;
	private Integer salRefNo;
	
	private String stockMode;
	private String stockSource;
	private String salStatus;
	private String salDesc;
	
	public ShipmentType getShipObj() {
		return shipObj;
	}

	public void setShipObj(ShipmentType shipObj) {
		this.shipObj = shipObj;
	}

	public String getStockMode() {
		return stockMode;
	}

	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}

	public String getStockSource() {
		return stockSource;
	}

	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}

	public SaleOrder() {
		super();
	}

	public SaleOrder(Integer salId) {
		super();
		this.salId = salId;
	}

	public Integer getSalId() {
		return salId;
	}

	public void setSalId(Integer salId) {
		this.salId = salId;
	}

	public String getSalCode() {
		return salCode;
	}

	public void setSalCode(String salCode) {
		this.salCode = salCode;
	}

	public Integer getSalRefNo() {
		return salRefNo;
	}

	public void setSalRefNo(Integer salRefNo) {
		this.salRefNo = salRefNo;
	}

	public String getSalStatus() {
		return salStatus;
	}

	public void setSalStatus(String salStatus) {
		this.salStatus = salStatus;
	}

	public String getSalDesc() {
		return salDesc;
	}

	public void setSalDesc(String salDesc) {
		this.salDesc = salDesc;
	}

	@Override
	public String toString() {
		return "SaleOrder [salId=" + salId + ", salCode=" + salCode + ", shipObj=" + shipObj + ", salRefNo=" + salRefNo
				+ ", stockMode=" + stockMode + ", stockSource=" + stockSource + ", salStatus=" + salStatus
				+ ", salDesc=" + salDesc + "]";
	}

}
