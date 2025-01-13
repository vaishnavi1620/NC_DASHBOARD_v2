package org.netcracker.repository;

import org.netcracker.model.TukCncHistory;
import org.netcracker.model.TukCncHistoryPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TukCncHistoryRepository extends JpaRepository<TukCncHistory, TukCncHistoryPK> {

  public List<TukCncHistory> findAllByTukCncHistoryPK_CncReference(String cncReference);
}
