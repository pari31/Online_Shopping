package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.OrderItemDTO;

public interface OrderItemDAO {
public List<OrderItemDTO> list();
public boolean add(OrderItemDTO orderItemDTO);
public boolean delete(OrderItemDTO orderItemDTO);
public boolean update(OrderItemDTO orderItemDTO);
public OrderItemDTO get(int orderItemId);
}
