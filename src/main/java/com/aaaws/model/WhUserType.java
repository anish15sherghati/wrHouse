package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whusertab")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name = "whid")
	private Integer whuserId;
	private String whuserType;
	private String whuserCode;
	private String whuserFor;
	private String whuserEmail;
	private Long whuserCont;
	private String whuserIdType;
	private String whuserIfOther;
	private String whuserIdNum;
	private String note;

	public WhUserType() {
		super();
	}

	public WhUserType(Integer whuserId) {
		super();
		this.whuserId = whuserId;
	}

	public Integer getWhuserId() {
		return whuserId;
	}

	public void setWhuserId(Integer whuserId) {
		this.whuserId = whuserId;
	}

	public String getWhuserType() {
		return whuserType;
	}

	public void setWhuserType(String whuserType) {
		this.whuserType = whuserType;
	}

	public String getWhuserCode() {
		return whuserCode;
	}

	public void setWhuserCode(String whuserCode) {
		this.whuserCode = whuserCode;
	}

	public String getWhuserFor() {
		return whuserFor;
	}

	public void setWhuserFor(String whuserFor) {
		this.whuserFor = whuserFor;
	}

	public String getWhuserEmail() {
		return whuserEmail;
	}

	public void setWhuserEmail(String whuserEmail) {
		this.whuserEmail = whuserEmail;
	}

	public Long getWhuserCont() {
		return whuserCont;
	}

	public void setWhuserCont(Long whuserCont) {
		this.whuserCont = whuserCont;
	}

	public String getWhuserIdType() {
		return whuserIdType;
	}

	public void setWhuserIdType(String whuserIdType) {
		this.whuserIdType = whuserIdType;
	}

	public String getWhuserIfOther() {
		return whuserIfOther;
	}

	public void setWhuserIfOther(String whuserIfOther) {
		this.whuserIfOther = whuserIfOther;
	}

	public String getWhuserIdNum() {
		return whuserIdNum;
	}

	public void setWhuserIdNum(String whuserIdNum) {
		this.whuserIdNum = whuserIdNum;
	}

	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "WhUserType [whuserId=" + whuserId + ", whuserType=" + whuserType + ", whuserCode=" + whuserCode
				+ ", whuserFor=" + whuserFor + ", whuserEmail=" + whuserEmail + ", whuserCont=" + whuserCont
				+ ", whuserIdType=" + whuserIdType + ", whuserIfOther=" + whuserIfOther + ", whuserIdNum=" + whuserIdNum
				+ ", note=" + note + "]";
	}

}
