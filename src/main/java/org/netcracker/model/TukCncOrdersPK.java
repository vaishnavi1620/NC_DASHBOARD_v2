package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TukCncOrdersPK implements Serializable {

  @Column(name = "organization_id")
  private Integer orgId;

  @Column(name = "cnc_reference")
  private String cncReference;

  @Column(name = "order_number")
  private String orderNumber;

  @Column(name = "despatch_reference")
  private String dispatchReference;

  public TukCncOrdersPK(){}

  public TukCncOrdersPK(Integer orgId, String cncReference, String orderNumber, String dispatchReference) {
    this.orgId = orgId;
    this.cncReference = cncReference;
    this.orderNumber = orderNumber;
    this.dispatchReference = dispatchReference;
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

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getDispatchReference() {
    return dispatchReference;
  }

  public void setDispatchReference(String dispatchReference) {
    this.dispatchReference = dispatchReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCncOrdersPK that = (TukCncOrdersPK) o;
    return Objects.equals(orgId, that.orgId) && Objects.equals(cncReference, that.cncReference) && Objects.equals(orderNumber, that.orderNumber) && Objects.equals(dispatchReference, that.dispatchReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, cncReference, orderNumber, dispatchReference);
  }
}
