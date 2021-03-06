package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "purtaba")
public class PurchaseOrder {
	@Id
	@Column(name="puid")
	@GeneratedValue(generator="pidgen")
	@GenericGenerator(name="pidgen",strategy = "increment")
	private Integer purId;
	private String purCode;

	@ManyToOne
	@JoinColumn(name = "sidFk")
	private ShipmentType shpObjCode;
	
	@ManyToOne
	@JoinColumn(name = "whidFk")
	private WhUserType whUserObjV;

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

	public ShipmentType getShpObjCode() {
		return shpObjCode;
	}

	public void setShpObjCode(ShipmentType shpObjCode) {
		this.shpObjCode = shpObjCode;
	}

	public WhUserType getWhUserObjV() {
		return whUserObjV;
	}

	public void setWhUserObjV(WhUserType whUserObjV) {
		this.whUserObjV = whUserObjV;
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
		return "PurchaseOrder [purId=" + purId + ", purCode=" + purCode + ", shpObjCode=" + shpObjCode + ", whUserObjV="
				+ whUserObjV + ", purRefNo=" + purRefNo + ", purQua=" + purQua + ", purSts=" + purSts + ", purDesc="
				+ purDesc + "]";
	}

}
