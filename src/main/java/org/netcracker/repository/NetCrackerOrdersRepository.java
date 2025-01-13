package org.netcracker.repository;

import org.netcracker.model.TukHoInterfacesLogs;
import org.netcracker.model.TukHoInterfacesLogsPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NetCrackerOrdersRepository extends JpaRepository<TukHoInterfacesLogs, TukHoInterfacesLogsPK> {
 // List<TukHoInterfacesLogs> findAllByOrderNumberOrRequestDataContaining(String orderNumber);

  //List<TukHoInterfacesLogs> findByRequestDataContaining(String orderNumber);

  @Query("SELECT i from TukHoInterfacesLogs i where (i.requestData like CONCAT('%',:orderNumber,'%') or i.orderNumber =:orderNumber) and i.tukHoInterfacesLogsPK.rtlLocId =:storeNumber")
  List<TukHoInterfacesLogs> findAllByOrderNumberAndStoreNumber(@Param("orderNumber") String orderNumber, @Param("storeNumber") Integer storeNumber);
}
