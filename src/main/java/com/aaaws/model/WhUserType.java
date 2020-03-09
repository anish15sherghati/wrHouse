package com.aaaws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "whusertab")
public class WhUserType {
	@Id
	@GeneratedValue
	private Integer whuserId;
	private String whuserType;
	private Integer whuserCode;
	private String whuserFor;
	private String whuserEmail;
	private Long whuserCont;
	private String whuserIdType;
	private String whuserIfOther;
	private Integer whuserIdNum;

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

	public Integer getWhuserCode() {
		return whuserCode;
	}

	public void setWhuserCode(Integer whuserCode) {
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

	public Integer getWhuserIdNum() {
		return whuserIdNum;
	}

	public void setWhuserIdNum(Integer whuserIdNum) {
		this.whuserIdNum = whuserIdNum;
	}

	@Override
	public String toString() {
		return "WHUserType [whuserId=" + whuserId + ", whuserType=" + whuserType + ", whuserCode=" + whuserCode
				+ ", whuserFor=" + whuserFor + ", whuserEmail=" + whuserEmail + ", whuserCont=" + whuserCont
				+ ", whuserIdType=" + whuserIdType + ", whuserIfOther=" + whuserIfOther + ", whuserIdNum=" + whuserIdNum
				+ "]";
	}

}
