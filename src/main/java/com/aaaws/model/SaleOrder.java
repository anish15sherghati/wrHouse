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
	@ManyToOne
	private WhUserType whTypeCust;
	
	private Integer salRefNo;
	private String stockMode;
	private String stockSource;
	private String salStatus;
	private String salDesc;
	public SaleOrder() {
		super();
	}
	public SaleOrder(Integer salId) {
		super();
		this.salId = salId;
	}
	/**
	 * @return the salId
	 */
	public Integer getSalId() {
		return salId;
	}
	/**
	 * @param salId the salId to set
	 */
	public void setSalId(Integer salId) {
		this.salId = salId;
	}
	/**
	 * @return the salCode
	 */
	public String getSalCode() {
		return salCode;
	}
	/**
	 * @param salCode the salCode to set
	 */
	public void setSalCode(String salCode) {
		this.salCode = salCode;
	}
	/**
	 * @return the shipObj
	 */
	public ShipmentType getShipObj() {
		return shipObj;
	}
	/**
	 * @param shipObj the shipObj to set
	 */
	public void setShipObj(ShipmentType shipObj) {
		this.shipObj = shipObj;
	}
	/**
	 * @return the ordModeCust
	 */
	
	/**
	 * @return the salRefNo
	 */
	public Integer getSalRefNo() {
		return salRefNo;
	}
	/**
	 * @return the whTypeCust
	 */
	public WhUserType getWhTypeCust() {
		return whTypeCust;
	}
	/**
	 * @param whTypeCust the whTypeCust to set
	 */
	public void setWhTypeCust(WhUserType whTypeCust) {
		this.whTypeCust = whTypeCust;
	}
	/**
	 * @param salRefNo the salRefNo to set
	 */
	public void setSalRefNo(Integer salRefNo) {
		this.salRefNo = salRefNo;
	}
	/**
	 * @return the stockMode
	 */
	public String getStockMode() {
		return stockMode;
	}
	/**
	 * @param stockMode the stockMode to set
	 */
	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}
	/**
	 * @return the stockSource
	 */
	public String getStockSource() {
		return stockSource;
	}
	/**
	 * @param stockSource the stockSource to set
	 */
	public void setStockSource(String stockSource) {
		this.stockSource = stockSource;
	}
	/**
	 * @return the salStatus
	 */
	public String getSalStatus() {
		return salStatus;
	}
	/**
	 * @param salStatus the salStatus to set
	 */
	public void setSalStatus(String salStatus) {
		this.salStatus = salStatus;
	}
	/**
	 * @return the salDesc
	 */
	public String getSalDesc() {
		return salDesc;
	}
	/**
	 * @param salDesc the salDesc to set
	 */
	public void setSalDesc(String salDesc) {
		this.salDesc = salDesc;
	}
	@Override
	public String toString() {
		return "SaleOrder [salId=" + salId + ", salCode=" + salCode + ", shipObj=" + shipObj + ", whTypeCust="
				+ whTypeCust + ", salRefNo=" + salRefNo + ", stockMode=" + stockMode + ", stockSource=" + stockSource
				+ ", salStatus=" + salStatus + ", salDesc=" + salDesc + "]";
	}
	
}
