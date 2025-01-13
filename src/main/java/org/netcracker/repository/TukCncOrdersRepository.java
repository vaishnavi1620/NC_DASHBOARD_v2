package org.netcracker.repository;

import org.netcracker.model.TukCncOrders;
import org.netcracker.model.TukCncOrdersPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TukCncOrdersRepository extends JpaRepository<TukCncOrders, TukCncOrdersPK> {

  List<TukCncOrders> findAllByAndTukCncOrdersPK_OrderNumber(String orderNumber);
}
