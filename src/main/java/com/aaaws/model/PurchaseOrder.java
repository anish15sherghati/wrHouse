package com.aaaws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="purtab")
public class PurchaseOrder {
	@Id
	@GeneratedValue
	private Integer purId;
	private String purCode;
	
	@ManyToOne
	private ShipmentType shpObjCode;
	
	private Integer purRefNo;
	private String purQua;
	private String purSts;
	private String purDesc;

	public PurchaseOrder(Integer purId) {
		super();
		this.purId = purId;
	}

	public PurchaseOrder() {
		super();
	}
	public ShipmentType getShpObjCode() {
		return shpObjCode;
	}

	public void setShpObjCode(ShipmentType shpObjCode) {
		this.shpObjCode = shpObjCode;
	}


	public Integer getPurId() {
		return purId;
	}

	public void setPurId(Integer purId) {
		this.purId = purId;
	}

	public String getPurCode() {
		return purCode;
	}

	public void setPurCode(String purCode) {
		this.purCode = purCode;
	}

	public Integer getPurRefNo() {
		return purRefNo;
	}

	public void setPurRefNo(Integer purRefNo) {
		this.purRefNo = purRefNo;
	}

	public String getPurQua() {
		return purQua;
	}

	public void setPurQua(String purQua) {
		this.purQua = purQua;
	}

	public String getPurSts() {
		return purSts;
	}

	public void setPurSts(String purSts) {
		this.purSts = purSts;
	}

	public String getPurDesc() {
		return purDesc;
	}

	public void setPurDesc(String purDesc) {
		this.purDesc = purDesc;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [purId=" + purId + ", purCode=" + purCode + ", shpObjCode=" + shpObjCode + ", purRefNo="
				+ purRefNo + ", purQua=" + purQua + ", purSts=" + purSts + ", purDesc=" + purDesc + "]";
	}
	

}
