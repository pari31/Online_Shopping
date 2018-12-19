package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.OrderDetailDTO;

public interface OrderDetailDAO {
public List<OrderDetailDTO> list();
public boolean add(OrderDetailDTO orderDetailDTO);
public boolean delete(OrderDetailDTO orderDetailDTO);
public boolean update(OrderDetailDTO orderDetailDTO);
public OrderDetailDTO get(int orderDetailId);

}
