package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrderDTO;

import java.util.List;

public interface PurchaseOrderService {
    void purchaseOrder(OrderDTO dto);
    void deleteOrder(String oid);
    void updateOrder(OrderDTO dto);
    OrderDTO searchOrder(String oid);
    List<OrderDTO> getAllOrders();
}
