package com.ecomm.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SupplierDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int SupplierId;
	
	private  String SupplierName;
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	public String getSupplierName() {
		return SupplierName;
	}
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	public String getSupplierDescription() {
		return SupplierDescription;
	}
	public void setSupplierDescription(String supplierDescription) {
		SupplierDescription = supplierDescription;
	}
	
	private String  SupplierDescription;

}
