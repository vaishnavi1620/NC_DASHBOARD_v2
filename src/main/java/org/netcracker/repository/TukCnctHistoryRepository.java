package org.netcracker.repository;


import org.netcracker.model.TukCnctHistory;
import org.netcracker.model.TukCnctHistoryPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TukCnctHistoryRepository extends JpaRepository<TukCnctHistory, TukCnctHistoryPK> {

  public List<TukCnctHistory> findAllByTukCnctHistoryPK_CnctReference(String cnctReference);

}
