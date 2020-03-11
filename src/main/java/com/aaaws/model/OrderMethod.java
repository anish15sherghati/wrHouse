package com.aaaws.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "omtab")
public class OrderMethod {
	@Id
	@GeneratedValue
	@Column(name = "omid")
	private Integer ordId;
	@Column(name = "ommode")
	private String ordMode;
	@Column(name = "omcode")
	private String ordCode;
	@Column(name = "ordmethod")
	private String ordMethod;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> ordAccept;
	@Column(name = "omdesc")
	private String ordDesc;

	public OrderMethod() {
		super();
	}
	
	public OrderMethod(Integer ordId) {
		super();
		this.ordId = ordId;
	}

	public Integer getOrdId() {
		return ordId;
	}

	public void setOrdId(Integer ordId) {
		this.ordId = ordId;
	}

	public String getOrdMode() {
		return ordMode;
	}

	public void setOrdMode(String ordMode) {
		this.ordMode = ordMode;
	}

	public String getOrdCode() {
		return ordCode;
	}

	public void setOrdCode(String ordCode) {
		this.ordCode = ordCode;
	}

	public String getOrdMethod() {
		return ordMethod;
	}

	public void setOrdMethod(String ordMethod) {
		this.ordMethod = ordMethod;
	}

	public List<String> getOrdAccept() {
		return ordAccept;
	}

	public void setOrdAccept(List<String> ordAccept) {
		this.ordAccept = ordAccept;
	}

	public String getOrdDesc() {
		return ordDesc;
	}

	public void setOrdDesc(String ordDesc) {
		this.ordDesc = ordDesc;
	}

	@Override
	public String toString() {
		return "OrderMethod [ordId=" + ordId + ", ordMode=" + ordMode + ", ordCode=" + ordCode + ", ordMethod="
				+ ordMethod + ", ordAccept=" + ordAccept + ", ordDesc=" + ordDesc + "]";
	}

}
