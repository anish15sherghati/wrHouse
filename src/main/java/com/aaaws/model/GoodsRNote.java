package com.aaaws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="grntab")
public class GoodsRNote {
	
	@Id
	@GeneratedValue
	private Integer grnId;
	private String grnCode;
	private String grnType;
	@ManyToOne
	@JoinColumn(name="pidFk")
	private PurchaseOrder PurOrderCode;
	
	private String grnDesc;
	
	public GoodsRNote(Integer grnId) {
		super();
		this.grnId = grnId;
	}
	public GoodsRNote() {
		super();
	}
	public Integer getGrnId() {
		return grnId;
	}
	public void setGrnId(Integer grnId) {
		this.grnId = grnId;
	}
	public String getGrnCode() {
		return grnCode;
	}
	public void setGrnCode(String grnCode) {
		this.grnCode = grnCode;
	}
	public String getGrnType() {
		return grnType;
	}
	public void setGrnType(String grnType) {
		this.grnType = grnType;
	}
	public PurchaseOrder getPurOrderCode() {
		return PurOrderCode;
	}
	public void setPurOrderCode(PurchaseOrder purOrderCode) {
		PurOrderCode = purOrderCode;
	}
	public String getGrnDesc() {
		return grnDesc;
	}
	public void setGrnDesc(String grnDesc) {
		this.grnDesc = grnDesc;
	}
	@Override
	public String toString() {
		return "GoodsRNote [grnId=" + grnId + ", grnCode=" + grnCode + ", grnType=" + grnType + ", PurOrderCode="
				+ PurOrderCode + ", grnDesc=" + grnDesc + "]";
	}
	

}
