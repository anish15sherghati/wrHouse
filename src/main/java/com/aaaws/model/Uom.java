package com.aaaws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uomotab")
public class Uom {
	@Id
	@GeneratedValue
	@Column(name="umid")
	private Integer uomId;
	@Column(name="umtype")
	private String uomType;
	@Column(name="ummodel")
	private String uomModel;
	@Column(name="umdesc")
	private String uomDesc;

	public Uom() {
		super();
	}

	/*
	 * public Uom(Integer uomId, String uomType, String uomModel, String uomDesc) {
	 * super(); this.uomId = uomId; this.uomType = uomType; this.uomModel =
	 * uomModel; UomDesc = uomDesc; }
	 */
	
	
	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public String getUomModel() {
		return uomModel;
	}

	public void setUomModel(String uomModel) {
		this.uomModel = uomModel;
	}

	public String getUomDesc() {
		return uomDesc;
	}

	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}

	public String toString() {
		return "Uom [uomId=" + uomId + ", uomType=" + uomType + ", uomModel=" + uomModel + ", UomDesc=" + uomDesc + "]";
	}


}
