package org.netcracker.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tuk_nc_order_list")
public class TukNcOrderList {

  @EmbeddedId
  private TukNcOrderListPK tukNcOrderListPK;

  @Column(name = "wkstn_id")
  private Integer wkstnId;

  @Column(name = "business_date")
  private LocalDate businessDate;

  @Column(name = "status")
  private String status;

  @Column(name="sales_person_first_name")
  private String salesPersonFirstName;

  @Column(name="sales_person_last_name")
  private String salesPersonLastName;

  @Column(name="title")
  private String title;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;

  @Column(name="master_timestamp")
  private LocalDateTime masterTimeStamp;

  @Column(name = "create_user_id")
  private String createUserId;

  @Column(name = "create_date")
  private LocalDate createDate;

  @Column(name = "update_date")
  private LocalDate updateDate;

  @Column(name = "update_user_id")
  private String updateUserId;

  @Column(name = "record_state")
  private String recordState;

  public TukNcOrderList(){}

  public TukNcOrderList(TukNcOrderListPK tukNcOrderListPK, Integer wkstnId, LocalDate businessDate, String status, String salesPersonFirstName, String salesPersonLastName, String title, String firstName, String lastName, LocalDateTime masterTimeStamp, String createUserId, LocalDate createDate, LocalDate updateDate, String updateUserId, String recordState) {
    this.tukNcOrderListPK = tukNcOrderListPK;
    this.wkstnId = wkstnId;
    this.businessDate = businessDate;
    this.status = status;
    this.salesPersonFirstName = salesPersonFirstName;
    this.salesPersonLastName = salesPersonLastName;
    this.title = title;
    this.firstName = firstName;
    this.lastName = lastName;
    this.masterTimeStamp = masterTimeStamp;
    this.createUserId = createUserId;
    this.createDate = createDate;
    this.updateDate = updateDate;
    this.updateUserId = updateUserId;
    this.recordState = recordState;
  }

  public TukNcOrderListPK getTukNcOrderListPK() {
    return tukNcOrderListPK;
  }

  public void setTukNcOrderListPK(TukNcOrderListPK tukNcOrderListPK) {
    this.tukNcOrderListPK = tukNcOrderListPK;
  }

  public Integer getWkstnId() {
    return wkstnId;
  }

  public void setWkstnId(Integer wkstnId) {
    this.wkstnId = wkstnId;
  }

  public LocalDate getBusinessDate() {
    return businessDate;
  }

  public void setBusinessDate(LocalDate businessDate) {
    this.businessDate = businessDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSalesPersonFirstName() {
    return salesPersonFirstName;
  }

  public void setSalesPersonFirstName(String salesPersonFirstName) {
    this.salesPersonFirstName = salesPersonFirstName;
  }

  public String getSalesPersonLastName() {
    return salesPersonLastName;
  }

  public void setSalesPersonLastName(String salesPersonLastName) {
    this.salesPersonLastName = salesPersonLastName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDateTime getMasterTimeStamp() {
    return masterTimeStamp;
  }

  public void setMasterTimeStamp(LocalDateTime masterTimeStamp) {
    this.masterTimeStamp = masterTimeStamp;
  }

  public String getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public LocalDate getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDate createDate) {
    this.createDate = createDate;
  }

  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }

  public String getUpdateUserId() {
    return updateUserId;
  }

  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  public String getRecordState() {
    return recordState;
  }

  public void setRecordState(String recordState) {
    this.recordState = recordState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukNcOrderList that = (TukNcOrderList) o;
    return Objects.equals(tukNcOrderListPK, that.tukNcOrderListPK) && Objects.equals(wkstnId, that.wkstnId) && Objects.equals(businessDate, that.businessDate) && Objects.equals(status, that.status) && Objects.equals(salesPersonFirstName, that.salesPersonFirstName) && Objects.equals(salesPersonLastName, that.salesPersonLastName) && Objects.equals(title, that.title) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(masterTimeStamp, that.masterTimeStamp) && Objects.equals(createUserId, that.createUserId) && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(updateUserId, that.updateUserId) && Objects.equals(recordState, that.recordState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tukNcOrderListPK, wkstnId, businessDate, status, salesPersonFirstName, salesPersonLastName, title, firstName, lastName, masterTimeStamp, createUserId, createDate, updateDate, updateUserId, recordState);
  }
}
