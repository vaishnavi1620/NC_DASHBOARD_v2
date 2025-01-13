package org.netcracker.repository;

import org.netcracker.model.TukCnctOrder;
import org.netcracker.model.TukCnctOrderPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TukCnctOrderRepository extends JpaRepository<TukCnctOrder, TukCnctOrderPK> {

  List<TukCnctOrder> findAllByTukCnctOrderPK_OrderNumber(String orderNumber);
}
