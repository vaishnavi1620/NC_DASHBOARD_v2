package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TukCnctHistoryPK implements Serializable {

  @Column(name = "organization_id")
  private Integer orgId;

  @Column(name = "cnct_reference")
  private String cnctReference;

  @Column(name = "status")
  private String status;

  @Column(name = "movement_id")
  private Integer movementId;

  @Column(name = "trans_seq")
  private Integer transSeq;

  public TukCnctHistoryPK() {}

  public TukCnctHistoryPK(Integer orgId, String cnctReference, String status, Integer movementId, Integer transSeq) {
    this.orgId = orgId;
    this.cnctReference = cnctReference;
    this.status = status;
    this.movementId = movementId;
    this.transSeq = transSeq;
  }

  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public String getCnctReference() {
    return cnctReference;
  }

  public void setCnctReference(String cnctReference) {
    this.cnctReference = cnctReference;
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

  public Integer getTransSeq() {
    return transSeq;
  }

  public void setTransSeq(Integer transSeq) {
    this.transSeq = transSeq;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCnctHistoryPK that = (TukCnctHistoryPK) o;
    return orgId.equals(that.orgId) && cnctReference.equals(that.cnctReference) && status.equals(that.status) && movementId.equals(that.movementId) && transSeq.equals(that.transSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, cnctReference, status, movementId, transSeq);
  }
}
