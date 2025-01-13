package org.netcracker.repository;

import org.netcracker.model.TukNcOrderList;
import org.netcracker.model.TukNcOrderListPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TukNcOrderListRepository extends JpaRepository<TukNcOrderList, TukNcOrderListPK> {
  List<TukNcOrderList> findAllByTukNcOrderListPK_OrderNumber(String orderNumber);
}
