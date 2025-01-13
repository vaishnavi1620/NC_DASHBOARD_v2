package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TukCncHistoryPK implements Serializable {

  @Column(name = "organization_id")
  private Integer orgId;

  @Column(name = "cnc_reference")
  private String cncReference;

  @Column(name = "status")
  private String status;

  @Column(name = "movement_id")
  private Integer movementId;

  public TukCncHistoryPK() {}

  public TukCncHistoryPK(Integer orgId, String cncReference, String status, Integer movementId) {
    this.orgId = orgId;
    this.cncReference = cncReference;
    this.status = status;
    this.movementId = movementId;
  }

  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public String getCncReference() {
    return cncReference;
  }

  public void setCncReference(String cncReference) {
    this.cncReference = cncReference;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getMovementId() {
    return movementId;
  }

  public void setMovementId(Integer movementId) {
    this.movementId = movementId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCncHistoryPK that = (TukCncHistoryPK) o;
    return Objects.equals(orgId, that.orgId) && Objects.equals(cncReference, that.cncReference) && Objects.equals(status, that.status) && Objects.equals(movementId, that.movementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, cncReference, status, movementId);
  }
}
