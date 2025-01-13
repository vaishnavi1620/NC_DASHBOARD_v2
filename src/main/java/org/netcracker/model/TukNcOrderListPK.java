package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TukNcOrderListPK implements Serializable {

  @Column(name = "organization_id")
  private Integer orgId;

  @Column(name = "rtl_loc_Id")
  private Integer rtlLocId;

  @Column(name= "order_id")
  private String orderId;

  @Column(name = "order_number")
  private String orderNumber;

  public TukNcOrderListPK(){}

  public TukNcOrderListPK(Integer orgId, Integer rtlLocId, String orderId, String orderNumber) {
    this.orgId = orgId;
    this.rtlLocId = rtlLocId;
    this.orderId = orderId;
    this.orderNumber = orderNumber;
  }

  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public Integer getRtlLocId() {
    return rtlLocId;
  }

  public void setRtlLocId(Integer rtlLocId) {
    this.rtlLocId = rtlLocId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukNcOrderListPK that = (TukNcOrderListPK) o;
    return Objects.equals(orgId, that.orgId) && Objects.equals(rtlLocId, that.rtlLocId) && Objects.equals(orderId, that.orderId) && Objects.equals(orderNumber, that.orderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, rtlLocId, orderId, orderNumber);
  }
}
