package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.SupplierDTO;

public interface SupplierDAO {
	public boolean add(SupplierDTO supplier);

	public boolean delete(SupplierDTO supplier);

	public boolean update(SupplierDTO supplier);

	public List<SupplierDTO> listSupplier();

	public SupplierDTO getSupplier(int supplierId);

}
