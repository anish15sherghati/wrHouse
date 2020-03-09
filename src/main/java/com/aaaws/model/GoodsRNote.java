package com.aaaws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grntab")
public class GoodsRNote {
	
	@Id
	@GeneratedValue
	private Integer grnId;
	private String grnCode;
	private String grnType;
	private String grnOrderCode;
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
	public String getGrnOrderCode() {
		return grnOrderCode;
	}
	public void setGrnOrderCode(String grnOrderCode) {
		this.grnOrderCode = grnOrderCode;
	}
	public String getGrnDesc() {
		return grnDesc;
	}
	public void setGrnDesc(String grnDesc) {
		this.grnDesc = grnDesc;
	}
	@Override
	public String toString() {
		return "GoodsRNote [grnId=" + grnId + ", grnCode=" + grnCode + ", grnType=" + grnType + ", grnOrderCode="
				+ grnOrderCode + ", grnDesc=" + grnDesc + "]";
	}
	

}
