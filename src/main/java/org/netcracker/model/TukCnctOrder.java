package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tuk_cnct_order")
public class TukCnctOrder {

  @EmbeddedId
  private TukCnctOrderPK tukCnctOrderPK;

  @Column(name = "date_time")
  private LocalDateTime dateTime;

  @Column(name = "current_status")
  private String currentStatus;

  @Column(name = "locksold_datetime")
  private LocalDateTime locksoldDatetime;

  @Column(name = "ibm_order_datetime")
  private LocalDateTime ibmOrderDatetime;

  @Column(name = "pick_notify_datetime")
  private LocalDateTime pickNotifyDatetime;

  @Column(name = "order_picked_datetime")
  private LocalDateTime orderPickedDatetime;

  @Column(name = "order_retrieved_datetime")
  private LocalDateTime orderRetrievedDatetime;

  @Column(name = "unpick_notify_datetime")
  private LocalDateTime unpickNotifyDatetime;

  @Column(name = "order_unpicked_datetime")
  private LocalDateTime orderUnpickedDatetime;

  @Column(name = "pick_user")
  private String pickUser;

  @Column(name = "collect_by_date")
  private LocalDateTime collectByDate;

  @Column(name = "unpick_user")
  private String unpickUser;

  @Column(name = "collection_datetime")
  private LocalDateTime collectionDatetime;

  @Column(name = "cancel_justification")
  private String cancelJustification;

  @Column(name = "cvos_order_cancel_datetime")
  private LocalDateTime cvosOrderCancelDatetime;

  @Column(name = "ibm_order_cancel_datetime")
  private LocalDateTime ibmOrderCancelDatetime;

  @Column(name = "conntype")
  private String conntype;

  @Column(name = "order_date")
  private LocalDateTime orderDate;

  @Column(name ="order_status")
  private String orderStatus;

  @Column(name ="sales_person")
  private String salesPerson;

  @Column(name ="extended_flag")
  private Integer extendedFlag;

  @Column(name ="uncollect1_flag")
  private Integer Uncollect1Flag;

  @Column(name ="uncollect2_flag")
  private Integer Uncollect2Flag;

  @Column(name ="rbo_tradein_make")
  private String rboTradeinMake;

  @Column(name ="rbo_tradein_model")
  private String rboTradeinModel;

  @Column(name ="rbo_tradein_imei")
  private String rboTradeinImei;

  @Column(name ="rbo_tradein_req_flag")
  private Integer rboTradeinReqFlag;

  @Column(name ="rbo_tradein_confirmed_flag")
  private Integer rboTradeinConfirmedFlag;

  @Column(name = "collection_verification_level")
  private String collectionVerificationLevel;

  @Column(name = "collection_id_type")
  private String collectionIdType;

  @Column(name = "collection_id_value")
  private String collectionIdValue;

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

  @Column(name = "is_expired")
  private Integer isExpired;

  @Column(name = "till_id")
  private Integer tillId;

  @Column(name = "rtl_loc_id")
  private Integer rtlLocId;

  @Column(name = "order_source")
  private String orderSource;

  @Column(name = "order_id")
  private String orderId;

  @Column(name = "context_id")
  private String contextId;

  @Column(name = "collected_user_id")
  private String collectedUserId;

  @Column(name = "collected_user_name")
  private String collectedUserName;

  @Column(name = "collection_timeout")
  private Integer collectionTimeout;

  @Column(name = "collection_confirmed")
  private String collectionConfirmed;

  @Column(name = "order_type")
  private String orderType;

  @Column(name = "expiration_date")
  private LocalDateTime expirationDate;

  @Column(name = "order_picking_failed_flag")
  private String orderPickingFailedFlag;

  @Column(name = "delayed_pick_confirmation_date")
  private LocalDateTime delayedPickConfirmationDate;

  public TukCnctOrder() {}

  public TukCnctOrder(TukCnctOrderPK tukCnctOrderPK, LocalDateTime dateTime, String currentStatus, LocalDateTime locksoldDatetime, LocalDateTime ibmOrderDatetime, LocalDateTime pickNotifyDatetime, LocalDateTime orderPickedDatetime, LocalDateTime orderRetrievedDatetime, LocalDateTime unpickNotifyDatetime, LocalDateTime orderUnpickedDatetime, String pickUser, LocalDateTime collectByDate, String unpickUser, LocalDateTime collectionDatetime, String cancelJustification, LocalDateTime cvosOrderCancelDatetime, LocalDateTime ibmOrderCancelDatetime, String conntype, LocalDateTime orderDate, String orderStatus, String salesPerson, Integer extendedFlag, Integer uncollect1Flag, Integer uncollect2Flag, String rboTradeinMake, String rboTradeinModel, String rboTradeinImei, Integer rboTradeinReqFlag, Integer rboTradeinConfirmedFlag, String collectionVerificationLevel, String collectionIdType, String collectionIdValue, String createUserId, LocalDate createDate, LocalDate updateDate, String updateUserId, String recordState, Integer isExpired, Integer tillId, Integer rtlLocId, String orderSource, String orderId, String contextId, String collectedUserId, String collectedUserName, Integer collectionTimeout, String collectionConfirmed, String orderType, LocalDateTime expirationDate, String orderPickingFailedFlag, LocalDateTime delayedPickConfirmationDate) {
    this.tukCnctOrderPK = tukCnctOrderPK;
    this.dateTime = dateTime;
    this.currentStatus = currentStatus;
    this.locksoldDatetime = locksoldDatetime;
    this.ibmOrderDatetime = ibmOrderDatetime;
    this.pickNotifyDatetime = pickNotifyDatetime;
    this.orderPickedDatetime = orderPickedDatetime;
    this.orderRetrievedDatetime = orderRetrievedDatetime;
    this.unpickNotifyDatetime = unpickNotifyDatetime;
    this.orderUnpickedDatetime = orderUnpickedDatetime;
    this.pickUser = pickUser;
    this.collectByDate = collectByDate;
    this.unpickUser = unpickUser;
    this.collectionDatetime = collectionDatetime;
    this.cancelJustification = cancelJustification;
    this.cvosOrderCancelDatetime = cvosOrderCancelDatetime;
    this.ibmOrderCancelDatetime = ibmOrderCancelDatetime;
    this.conntype = conntype;
    this.orderDate = orderDate;
    this.orderStatus = orderStatus;
    this.salesPerson = salesPerson;
    this.extendedFlag = extendedFlag;
    Uncollect1Flag = uncollect1Flag;
    Uncollect2Flag = uncollect2Flag;
    this.rboTradeinMake = rboTradeinMake;
    this.rboTradeinModel = rboTradeinModel;
    this.rboTradeinImei = rboTradeinImei;
    this.rboTradeinReqFlag = rboTradeinReqFlag;
    this.rboTradeinConfirmedFlag = rboTradeinConfirmedFlag;
    this.collectionVerificationLevel = collectionVerificationLevel;
    this.collectionIdType = collectionIdType;
    this.collectionIdValue = collectionIdValue;
    this.createUserId = createUserId;
    this.createDate = createDate;
    this.updateDate = updateDate;
    this.updateUserId = updateUserId;
    this.recordState = recordState;
    this.isExpired = isExpired;
    this.tillId = tillId;
    this.rtlLocId = rtlLocId;
    this.orderSource = orderSource;
    this.orderId = orderId;
    this.contextId = contextId;
    this.collectedUserId = collectedUserId;
    this.collectedUserName = collectedUserName;
    this.collectionTimeout = collectionTimeout;
    this.collectionConfirmed = collectionConfirmed;
    this.orderType = orderType;
    this.expirationDate = expirationDate;
    this.orderPickingFailedFlag = orderPickingFailedFlag;
    this.delayedPickConfirmationDate = delayedPickConfirmationDate;
  }

  public TukCnctOrderPK getTukCnctOrderPK() {
    return tukCnctOrderPK;
  }

  public void setTukCnctOrderPK(TukCnctOrderPK tukCnctOrderPK) {
    this.tukCnctOrderPK = tukCnctOrderPK;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public String getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
  }

  public LocalDateTime getLocksoldDatetime() {
    return locksoldDatetime;
  }

  public void setLocksoldDatetime(LocalDateTime locksoldDatetime) {
    this.locksoldDatetime = locksoldDatetime;
  }

  public LocalDateTime getIbmOrderDatetime() {
    return ibmOrderDatetime;
  }

  public void setIbmOrderDatetime(LocalDateTime ibmOrderDatetime) {
    this.ibmOrderDatetime = ibmOrderDatetime;
  }

  public LocalDateTime getPickNotifyDatetime() {
    return pickNotifyDatetime;
  }

  public void setPickNotifyDatetime(LocalDateTime pickNotifyDatetime) {
    this.pickNotifyDatetime = pickNotifyDatetime;
  }

  public LocalDateTime getOrderPickedDatetime() {
    return orderPickedDatetime;
  }

  public void setOrderPickedDatetime(LocalDateTime orderPickedDatetime) {
    this.orderPickedDatetime = orderPickedDatetime;
  }

  public LocalDateTime getOrderRetrievedDatetime() {
    return orderRetrievedDatetime;
  }

  public void setOrderRetrievedDatetime(LocalDateTime orderRetrievedDatetime) {
    this.orderRetrievedDatetime = orderRetrievedDatetime;
  }

  public LocalDateTime getUnpickNotifyDatetime() {
    return unpickNotifyDatetime;
  }

  public void setUnpickNotifyDatetime(LocalDateTime unpickNotifyDatetime) {
    this.unpickNotifyDatetime = unpickNotifyDatetime;
  }

  public LocalDateTime getOrderUnpickedDatetime() {
    return orderUnpickedDatetime;
  }

  public void setOrderUnpickedDatetime(LocalDateTime orderUnpickedDatetime) {
    this.orderUnpickedDatetime = orderUnpickedDatetime;
  }

  public String getPickUser() {
    return pickUser;
  }

  public void setPickUser(String pickUser) {
    this.pickUser = pickUser;
  }

  public LocalDateTime getCollectByDate() {
    return collectByDate;
  }

  public void setCollectByDate(LocalDateTime collectByDate) {
    this.collectByDate = collectByDate;
  }

  public String getUnpickUser() {
    return unpickUser;
  }

  public void setUnpickUser(String unpickUser) {
    this.unpickUser = unpickUser;
  }

  public LocalDateTime getCollectionDatetime() {
    return collectionDatetime;
  }

  public void setCollectionDatetime(LocalDateTime collectionDatetime) {
    this.collectionDatetime = collectionDatetime;
  }

  public String getCancelJustification() {
    return cancelJustification;
  }

  public void setCancelJustification(String cancelJustification) {
    this.cancelJustification = cancelJustification;
  }

  public LocalDateTime getCvosOrderCancelDatetime() {
    return cvosOrderCancelDatetime;
  }

  public void setCvosOrderCancelDatetime(LocalDateTime cvosOrderCancelDatetime) {
    this.cvosOrderCancelDatetime = cvosOrderCancelDatetime;
  }

  public LocalDateTime getIbmOrderCancelDatetime() {
    return ibmOrderCancelDatetime;
  }

  public void setIbmOrderCancelDatetime(LocalDateTime ibmOrderCancelDatetime) {
    this.ibmOrderCancelDatetime = ibmOrderCancelDatetime;
  }

  public String getConntype() {
    return conntype;
  }

  public void setConntype(String conntype) {
    this.conntype = conntype;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public String getSalesPerson() {
    return salesPerson;
  }

  public void setSalesPerson(String salesPerson) {
    this.salesPerson = salesPerson;
  }

  public Integer getExtendedFlag() {
    return extendedFlag;
  }

  public void setExtendedFlag(Integer extendedFlag) {
    this.extendedFlag = extendedFlag;
  }

  public Integer getUncollect1Flag() {
    return Uncollect1Flag;
  }

  public void setUncollect1Flag(Integer uncollect1Flag) {
    Uncollect1Flag = uncollect1Flag;
  }

  public Integer getUncollect2Flag() {
    return Uncollect2Flag;
  }

  public void setUncollect2Flag(Integer uncollect2Flag) {
    Uncollect2Flag = uncollect2Flag;
  }

  public String getRboTradeinMake() {
    return rboTradeinMake;
  }

  public void setRboTradeinMake(String rboTradeinMake) {
    this.rboTradeinMake = rboTradeinMake;
  }

  public String getRboTradeinModel() {
    return rboTradeinModel;
  }

  public void setRboTradeinModel(String rboTradeinModel) {
    this.rboTradeinModel = rboTradeinModel;
  }

  public String getRboTradeinImei() {
    return rboTradeinImei;
  }

  public void setRboTradeinImei(String rboTradeinImei) {
    this.rboTradeinImei = rboTradeinImei;
  }

  public Integer getRboTradeinReqFlag() {
    return rboTradeinReqFlag;
  }

  public void setRboTradeinReqFlag(Integer rboTradeinReqFlag) {
    this.rboTradeinReqFlag = rboTradeinReqFlag;
  }

  public Integer getRboTradeinConfirmedFlag() {
    return rboTradeinConfirmedFlag;
  }

  public void setRboTradeinConfirmedFlag(Integer rboTradeinConfirmedFlag) {
    this.rboTradeinConfirmedFlag = rboTradeinConfirmedFlag;
  }

  public String getCollectionVerificationLevel() {
    return collectionVerificationLevel;
  }

  public void setCollectionVerificationLevel(String collectionVerificationLevel) {
    this.collectionVerificationLevel = collectionVerificationLevel;
  }

  public String getCollectionIdType() {
    return collectionIdType;
  }

  public void setCollectionIdType(String collectionIdType) {
    this.collectionIdType = collectionIdType;
  }

  public String getCollectionIdValue() {
    return collectionIdValue;
  }

  public void setCollectionIdValue(String collectionIdValue) {
    this.collectionIdValue = collectionIdValue;
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

  public Integer getIsExpired() {
    return isExpired;
  }

  public void setIsExpired(Integer isExpired) {
    this.isExpired = isExpired;
  }

  public Integer getTillId() {
    return tillId;
  }

  public void setTillId(Integer tillId) {
    this.tillId = tillId;
  }

  public Integer getRtlLocId() {
    return rtlLocId;
  }

  public void setRtlLocId(Integer rtlLocId) {
    this.rtlLocId = rtlLocId;
  }

  public String getOrderSource() {
    return orderSource;
  }

  public void setOrderSource(String orderSource) {
    this.orderSource = orderSource;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public String getCollectedUserId() {
    return collectedUserId;
  }

  public void setCollectedUserId(String collectedUserId) {
    this.collectedUserId = collectedUserId;
  }

  public String getCollectedUserName() {
    return collectedUserName;
  }

  public void setCollectedUserName(String collectedUserName) {
    this.collectedUserName = collectedUserName;
  }

  public Integer getCollectionTimeout() {
    return collectionTimeout;
  }

  public void setCollectionTimeout(Integer collectionTimeout) {
    this.collectionTimeout = collectionTimeout;
  }

  public String getCollectionConfirmed() {
    return collectionConfirmed;
  }

  public void setCollectionConfirmed(String collectionConfirmed) {
    this.collectionConfirmed = collectionConfirmed;
  }

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public LocalDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getOrderPickingFailedFlag() {
    return orderPickingFailedFlag;
  }

  public void setOrderPickingFailedFlag(String orderPickingFailedFlag) {
    this.orderPickingFailedFlag = orderPickingFailedFlag;
  }

  public LocalDateTime getDelayedPickConfirmationDate() {
    return delayedPickConfirmationDate;
  }

  public void setDelayedPickConfirmationDate(LocalDateTime delayedPickConfirmationDate) {
    this.delayedPickConfirmationDate = delayedPickConfirmationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCnctOrder that = (TukCnctOrder) o;
    return Objects.equals(tukCnctOrderPK, that.tukCnctOrderPK) && Objects.equals(dateTime, that.dateTime) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(locksoldDatetime, that.locksoldDatetime) && Objects.equals(ibmOrderDatetime, that.ibmOrderDatetime) && Objects.equals(pickNotifyDatetime, that.pickNotifyDatetime) && Objects.equals(orderPickedDatetime, that.orderPickedDatetime) && Objects.equals(orderRetrievedDatetime, that.orderRetrievedDatetime) && Objects.equals(unpickNotifyDatetime, that.unpickNotifyDatetime) && Objects.equals(orderUnpickedDatetime, that.orderUnpickedDatetime) && Objects.equals(pickUser, that.pickUser) && Objects.equals(collectByDate, that.collectByDate) && Objects.equals(unpickUser, that.unpickUser) && Objects.equals(collectionDatetime, that.collectionDatetime) && Objects.equals(cancelJustification, that.cancelJustification) && Objects.equals(cvosOrderCancelDatetime, that.cvosOrderCancelDatetime) && Objects.equals(ibmOrderCancelDatetime, that.ibmOrderCancelDatetime) && Objects.equals(conntype, that.conntype) && Objects.equals(orderDate, that.orderDate) && Objects.equals(orderStatus, that.orderStatus) && Objects.equals(salesPerson, that.salesPerson) && Objects.equals(extendedFlag, that.extendedFlag) && Objects.equals(Uncollect1Flag, that.Uncollect1Flag) && Objects.equals(Uncollect2Flag, that.Uncollect2Flag) && Objects.equals(rboTradeinMake, that.rboTradeinMake) && Objects.equals(rboTradeinModel, that.rboTradeinModel) && Objects.equals(rboTradeinImei, that.rboTradeinImei) && Objects.equals(rboTradeinReqFlag, that.rboTradeinReqFlag) && Objects.equals(rboTradeinConfirmedFlag, that.rboTradeinConfirmedFlag) && Objects.equals(collectionVerificationLevel, that.collectionVerificationLevel) && Objects.equals(collectionIdType, that.collectionIdType) && Objects.equals(collectionIdValue, that.collectionIdValue) && Objects.equals(createUserId, that.createUserId) && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(updateUserId, that.updateUserId) && Objects.equals(recordState, that.recordState) && Objects.equals(isExpired, that.isExpired) && Objects.equals(tillId, that.tillId) && Objects.equals(rtlLocId, that.rtlLocId) && Objects.equals(orderSource, that.orderSource) && Objects.equals(orderId, that.orderId) && Objects.equals(contextId, that.contextId) && Objects.equals(collectedUserId, that.collectedUserId) && Objects.equals(collectedUserName, that.collectedUserName) && Objects.equals(collectionTimeout, that.collectionTimeout) && Objects.equals(collectionConfirmed, that.collectionConfirmed) && Objects.equals(orderType, that.orderType) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(orderPickingFailedFlag, that.orderPickingFailedFlag) && Objects.equals(delayedPickConfirmationDate, that.delayedPickConfirmationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tukCnctOrderPK, dateTime, currentStatus, locksoldDatetime, ibmOrderDatetime, pickNotifyDatetime, orderPickedDatetime, orderRetrievedDatetime, unpickNotifyDatetime, orderUnpickedDatetime, pickUser, collectByDate, unpickUser, collectionDatetime, cancelJustification, cvosOrderCancelDatetime, ibmOrderCancelDatetime, conntype, orderDate, orderStatus, salesPerson, extendedFlag, Uncollect1Flag, Uncollect2Flag, rboTradeinMake, rboTradeinModel, rboTradeinImei, rboTradeinReqFlag, rboTradeinConfirmedFlag, collectionVerificationLevel, collectionIdType, collectionIdValue, createUserId, createDate, updateDate, updateUserId, recordState, isExpired, tillId, rtlLocId, orderSource, orderId, contextId, collectedUserId, collectedUserName, collectionTimeout, collectionConfirmed, orderType, expirationDate, orderPickingFailedFlag, delayedPickConfirmationDate);
  }
}
