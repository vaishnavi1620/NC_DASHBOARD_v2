package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TukCnctOrderPK implements Serializable {

  @Column(name = "organization_id")
  private Integer orgId;

  @Column(name = "cnct_reference")
  private String cnctReference;

  @Column(name = "order_number")
  private String orderNumber;

  @Column(name = "ecomm_orderid")
  private String ecommOrderid;

 public TukCnctOrderPK() {}

  public TukCnctOrderPK(Integer orgId, String cnctReference, String orderNumber, String ecommOrderid) {
    this.orgId = orgId;
    this.cnctReference = cnctReference;
    this.orderNumber = orderNumber;
    this.ecommOrderid = ecommOrderid;
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

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getEcommOrderid() {
    return ecommOrderid;
  }

  public void setEcommOrderid(String ecommOrderid) {
    this.ecommOrderid = ecommOrderid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCnctOrderPK that = (TukCnctOrderPK) o;
    return Objects.equals(orgId, that.orgId) && Objects.equals(cnctReference, that.cnctReference) && Objects.equals(orderNumber, that.orderNumber) && Objects.equals(ecommOrderid, that.ecommOrderid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, cnctReference, orderNumber, ecommOrderid);
  }
}
