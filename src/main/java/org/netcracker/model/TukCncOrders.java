package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tuk_cnc_orders")
public class TukCncOrders {

  @EmbeddedId
  private TukCncOrdersPK tukCncOrdersPK;

  @Column(name = "date_time")
  private LocalDateTime dateTime;

  @Column(name = "order_timestamp")
  private LocalDateTime orderTimestamp;

  @Column(name = "parcel_number")
  private String parcelNumber;

  @Column(name = "product_description")
  private String productDescription;

  @Column(name = "dispatch_date")
  private LocalDateTime dispatchDate;

  @Column(name = "delivery_date")
  private LocalDateTime deliveryDate;

  @Column(name="order_method")
  private String orderMethod;

  @Column(name = "release_to_customer_date")
  private LocalDateTime releaseToCustomerDate;

  @Column(name ="partner")
  private String partner;

  @Column(name = "owning_business_division")
  private String owningBusinessDivision;

  @Column(name = "sourceOfSale")
  private String sourceOfSale;

  @Column(name = "manually_added_flag")
  private Integer manuallyAddedFlag;

  @Column(name = "current_status")
  private String currentStatus;

  @Column(name = "extended_flag")
  private Integer extendedFlag;

  @Column(name = "extend_until_date")
  private LocalDateTime extendUntilDate;

  @Column(name = "manual_return_allowed_flag")
  private Integer manualReturnAllowedFlag;

  @Column(name = "store_id")
  private Integer storeId;

  @Column(name = "manually_added_user")
  private String manuallyAddedUser;

  @Column(name = "uncollected1_sent_flag")
  private Integer uncollected1SentFlag;

  @Column(name = "uncollected2_sent_flag")
  private Integer uncollected2SentFlag;

  @Column(name = "delivery_failed_sent_flag")
  private Integer deliveryFailedSentFlag;

  @Column(name = "manual_return_justification")
  private String manualReturnJustification;

  @Column(name = "rbo_tradein_make")
  private String rboTradeinMake;

  @Column(name = "rbo_tradein_model")
  private String rboTradeinModel;

  @Column(name = "rbo_tradein_imei")
  private String rboTradeinImei;

  @Column(name = "rbo_tradein_req_flag")
  private Integer rboTradeinReqFlag;

  @Column(name = "rbo_tradein_confirmed_flag")
  private Integer rboTradeinConfirmedFlag;

  @Column(name = "source_file_name")
  private String sourceFileName;

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

  @Column(name = "bookin_date_time")
  private LocalDateTime bookinDateTime;

  @Column(name = "collection_date_time")
  private  LocalDateTime collectionDateTime;

  @Column(name = "return_date_time")
  private LocalDateTime returnDateTime;

  @Column(name = "override_manager_branch")
  private String overrideManagerBranch;

  @Column(name = "override_manager_code")
  private String overrideManagerCode;

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

  @Column(name = "order_type")
  private String orderType;

  @Column(name = "pre_order")
  private String preOrder;

  @Column(name = "collection_confirm")
  private String collectionConfirm;

  @Column(name = "fulfilment_number")
  private String fulfilmentNumber;

  @Column(name = "expiration_date")
  private LocalDateTime expirationDate;

  @Column(name = "order_book_in_failed_flag")
  private String orderBookInFailedFlag;

  @Column(name = "delayed_book_in_confirm_date")
  private LocalDateTime delayedBookInConfirmDate;

  public TukCncOrders() {}

  public TukCncOrders(TukCncOrdersPK tukCncOrdersPK, LocalDateTime dateTime, LocalDateTime orderTimestamp, String parcelNumber, String productDescription, LocalDateTime dispatchDate, LocalDateTime deliveryDate, String orderMethod, LocalDateTime releaseToCustomerDate, String partner, String owningBusinessDivision, String sourceOfSale, Integer manuallyAddedFlag, String currentStatus, Integer extendedFlag, LocalDateTime extendUntilDate, Integer manualReturnAllowedFlag, Integer storeId, String manuallyAddedUser, Integer uncollected1SentFlag, Integer uncollected2SentFlag, Integer deliveryFailedSentFlag, String manualReturnJustification, String rboTradeinMake, String rboTradeinModel, String rboTradeinImei, Integer rboTradeinReqFlag, Integer rboTradeinConfirmedFlag, String sourceFileName, String collectionVerificationLevel, String collectionIdType, String collectionIdValue, String createUserId, LocalDate createDate, LocalDate updateDate, String updateUserId, String recordState, Integer isExpired, Integer tillId, LocalDateTime bookinDateTime, LocalDateTime collectionDateTime, LocalDateTime returnDateTime, String overrideManagerBranch, String overrideManagerCode, String orderSource, String orderId, String contextId, String collectedUserId, String collectedUserName, Integer collectionTimeout, String orderType, String preOrder, String collectionConfirm, String fulfilmentNumber, LocalDateTime expirationDate, String orderBookInFailedFlag, LocalDateTime delayedBookInConfirmDate) {
    this.tukCncOrdersPK = tukCncOrdersPK;
    this.dateTime = dateTime;
    this.orderTimestamp = orderTimestamp;
    this.parcelNumber = parcelNumber;
    this.productDescription = productDescription;
    this.dispatchDate = dispatchDate;
    this.deliveryDate = deliveryDate;
    this.orderMethod = orderMethod;
    this.releaseToCustomerDate = releaseToCustomerDate;
    this.partner = partner;
    this.owningBusinessDivision = owningBusinessDivision;
    this.sourceOfSale = sourceOfSale;
    this.manuallyAddedFlag = manuallyAddedFlag;
    this.currentStatus = currentStatus;
    this.extendedFlag = extendedFlag;
    this.extendUntilDate = extendUntilDate;
    this.manualReturnAllowedFlag = manualReturnAllowedFlag;
    this.storeId = storeId;
    this.manuallyAddedUser = manuallyAddedUser;
    this.uncollected1SentFlag = uncollected1SentFlag;
    this.uncollected2SentFlag = uncollected2SentFlag;
    this.deliveryFailedSentFlag = deliveryFailedSentFlag;
    this.manualReturnJustification = manualReturnJustification;
    this.rboTradeinMake = rboTradeinMake;
    this.rboTradeinModel = rboTradeinModel;
    this.rboTradeinImei = rboTradeinImei;
    this.rboTradeinReqFlag = rboTradeinReqFlag;
    this.rboTradeinConfirmedFlag = rboTradeinConfirmedFlag;
    this.sourceFileName = sourceFileName;
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
    this.bookinDateTime = bookinDateTime;
    this.collectionDateTime = collectionDateTime;
    this.returnDateTime = returnDateTime;
    this.overrideManagerBranch = overrideManagerBranch;
    this.overrideManagerCode = overrideManagerCode;
    this.orderSource = orderSource;
    this.orderId = orderId;
    this.contextId = contextId;
    this.collectedUserId = collectedUserId;
    this.collectedUserName = collectedUserName;
    this.collectionTimeout = collectionTimeout;
    this.orderType = orderType;
    this.preOrder = preOrder;
    this.collectionConfirm = collectionConfirm;
    this.fulfilmentNumber = fulfilmentNumber;
    this.expirationDate = expirationDate;
    this.orderBookInFailedFlag = orderBookInFailedFlag;
    this.delayedBookInConfirmDate = delayedBookInConfirmDate;
  }

  public TukCncOrdersPK getTukCncOrdersPK() {
    return tukCncOrdersPK;
  }

  public void setTukCncOrdersPK(TukCncOrdersPK tukCncOrders) {
    this.tukCncOrdersPK = tukCncOrdersPK;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public LocalDateTime getOrderTimestamp() {
    return orderTimestamp;
  }

  public void setOrderTimestamp(LocalDateTime orderTimestamp) {
    this.orderTimestamp = orderTimestamp;
  }

  public String getParcelNumber() {
    return parcelNumber;
  }

  public void setParcelNumber(String parcelNumber) {
    this.parcelNumber = parcelNumber;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public LocalDateTime getDispatchDate() {
    return dispatchDate;
  }

  public void setDispatchDate(LocalDateTime dispatchDate) {
    this.dispatchDate = dispatchDate;
  }

  public LocalDateTime getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public String getOrderMethod() {
    return orderMethod;
  }

  public void setOrderMethod(String orderMethod) {
    this.orderMethod = orderMethod;
  }

  public LocalDateTime getReleaseToCustomerDate() {
    return releaseToCustomerDate;
  }

  public void setReleaseToCustomerDate(LocalDateTime releaseToCustomerDate) {
    this.releaseToCustomerDate = releaseToCustomerDate;
  }

  public String getPartner() {
    return partner;
  }

  public void setPartner(String partner) {
    this.partner = partner;
  }

  public String getOwningBusinessDivision() {
    return owningBusinessDivision;
  }

  public void setOwningBusinessDivision(String owningBusinessDivision) {
    this.owningBusinessDivision = owningBusinessDivision;
  }

  public String getSourceOfSale() {
    return sourceOfSale;
  }

  public void setSourceOfSale(String sourceOfSale) {
    this.sourceOfSale = sourceOfSale;
  }

  public Integer getManuallyAddedFlag() {
    return manuallyAddedFlag;
  }

  public void setManuallyAddedFlag(Integer manuallyAddedFlag) {
    this.manuallyAddedFlag = manuallyAddedFlag;
  }

  public String getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
  }

  public Integer getExtendedFlag() {
    return extendedFlag;
  }

  public void setExtendedFlag(Integer extendedFlag) {
    this.extendedFlag = extendedFlag;
  }

  public LocalDateTime getExtendUntilDate() {
    return extendUntilDate;
  }

  public void setExtendUntilDate(LocalDateTime extendUntilDate) {
    this.extendUntilDate = extendUntilDate;
  }

  public Integer getManualReturnAllowedFlag() {
    return manualReturnAllowedFlag;
  }

  public void setManualReturnAllowedFlag(Integer manualReturnAllowedFlag) {
    this.manualReturnAllowedFlag = manualReturnAllowedFlag;
  }

  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public String getManuallyAddedUser() {
    return manuallyAddedUser;
  }

  public void setManuallyAddedUser(String manuallyAddedUser) {
    this.manuallyAddedUser = manuallyAddedUser;
  }

  public Integer getUncollected1SentFlag() {
    return uncollected1SentFlag;
  }

  public void setUncollected1SentFlag(Integer uncollected1SentFlag) {
    this.uncollected1SentFlag = uncollected1SentFlag;
  }

  public Integer getUncollected2SentFlag() {
    return uncollected2SentFlag;
  }

  public void setUncollected2SentFlag(Integer uncollected2SentFlag) {
    this.uncollected2SentFlag = uncollected2SentFlag;
  }

  public Integer getDeliveryFailedSentFlag() {
    return deliveryFailedSentFlag;
  }

  public void setDeliveryFailedSentFlag(Integer deliveryFailedSentFlag) {
    this.deliveryFailedSentFlag = deliveryFailedSentFlag;
  }

  public String getManualReturnJustification() {
    return manualReturnJustification;
  }

  public void setManualReturnJustification(String manualReturnJustification) {
    this.manualReturnJustification = manualReturnJustification;
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

  public String getSourceFileName() {
    return sourceFileName;
  }

  public void setSourceFileName(String sourceFileName) {
    this.sourceFileName = sourceFileName;
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

  public LocalDateTime getBookinDateTime() {
    return bookinDateTime;
  }

  public void setBookinDateTime(LocalDateTime bookinDateTime) {
    this.bookinDateTime = bookinDateTime;
  }

  public LocalDateTime getCollectionDateTime() {
    return collectionDateTime;
  }

  public void setCollectionDateTime(LocalDateTime collectionDateTime) {
    this.collectionDateTime = collectionDateTime;
  }

  public LocalDateTime getReturnDateTime() {
    return returnDateTime;
  }

  public void setReturnDateTime(LocalDateTime returnDateTime) {
    this.returnDateTime = returnDateTime;
  }

  public String getOverrideManagerBranch() {
    return overrideManagerBranch;
  }

  public void setOverrideManagerBranch(String overrideManagerBranch) {
    this.overrideManagerBranch = overrideManagerBranch;
  }

  public String getOverrideManagerCode() {
    return overrideManagerCode;
  }

  public void setOverrideManagerCode(String overrideManagerCode) {
    this.overrideManagerCode = overrideManagerCode;
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

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public String getPreOrder() {
    return preOrder;
  }

  public void setPreOrder(String preOrder) {
    this.preOrder = preOrder;
  }

  public String getCollectionConfirm() {
    return collectionConfirm;
  }

  public void setCollectionConfirm(String collectionConfirm) {
    this.collectionConfirm = collectionConfirm;
  }

  public String getFulfilmentNumber() {
    return fulfilmentNumber;
  }

  public void setFulfilmentNumber(String fulfilmentNumber) {
    this.fulfilmentNumber = fulfilmentNumber;
  }

  public LocalDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public String getOrderBookInFailedFlag() {
    return orderBookInFailedFlag;
  }

  public void setOrderBookInFailedFlag(String orderBookInFailedFlag) {
    this.orderBookInFailedFlag = orderBookInFailedFlag;
  }

  public LocalDateTime getDelayedBookInConfirmDate() {
    return delayedBookInConfirmDate;
  }

  public void setDelayedBookInConfirmDate(LocalDateTime delayedBookInConfirmDate) {
    this.delayedBookInConfirmDate = delayedBookInConfirmDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCncOrders that = (TukCncOrders) o;
    return Objects.equals(tukCncOrdersPK, that.tukCncOrdersPK) && Objects.equals(dateTime, that.dateTime) && Objects.equals(orderTimestamp, that.orderTimestamp) && Objects.equals(parcelNumber, that.parcelNumber) && Objects.equals(productDescription, that.productDescription) && Objects.equals(dispatchDate, that.dispatchDate) && Objects.equals(deliveryDate, that.deliveryDate) && Objects.equals(orderMethod, that.orderMethod) && Objects.equals(releaseToCustomerDate, that.releaseToCustomerDate) && Objects.equals(partner, that.partner) && Objects.equals(owningBusinessDivision, that.owningBusinessDivision) && Objects.equals(sourceOfSale, that.sourceOfSale) && Objects.equals(manuallyAddedFlag, that.manuallyAddedFlag) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(extendedFlag, that.extendedFlag) && Objects.equals(extendUntilDate, that.extendUntilDate) && Objects.equals(manualReturnAllowedFlag, that.manualReturnAllowedFlag) && Objects.equals(storeId, that.storeId) && Objects.equals(manuallyAddedUser, that.manuallyAddedUser) && Objects.equals(uncollected1SentFlag, that.uncollected1SentFlag) && Objects.equals(uncollected2SentFlag, that.uncollected2SentFlag) && Objects.equals(deliveryFailedSentFlag, that.deliveryFailedSentFlag) && Objects.equals(manualReturnJustification, that.manualReturnJustification) && Objects.equals(rboTradeinMake, that.rboTradeinMake) && Objects.equals(rboTradeinModel, that.rboTradeinModel) && Objects.equals(rboTradeinImei, that.rboTradeinImei) && Objects.equals(rboTradeinReqFlag, that.rboTradeinReqFlag) && Objects.equals(rboTradeinConfirmedFlag, that.rboTradeinConfirmedFlag) && Objects.equals(sourceFileName, that.sourceFileName) && Objects.equals(collectionVerificationLevel, that.collectionVerificationLevel) && Objects.equals(collectionIdType, that.collectionIdType) && Objects.equals(collectionIdValue, that.collectionIdValue) && Objects.equals(createUserId, that.createUserId) && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(updateUserId, that.updateUserId) && Objects.equals(recordState, that.recordState) && Objects.equals(isExpired, that.isExpired) && Objects.equals(tillId, that.tillId) && Objects.equals(bookinDateTime, that.bookinDateTime) && Objects.equals(collectionDateTime, that.collectionDateTime) && Objects.equals(returnDateTime, that.returnDateTime) && Objects.equals(overrideManagerBranch, that.overrideManagerBranch) && Objects.equals(overrideManagerCode, that.overrideManagerCode) && Objects.equals(orderSource, that.orderSource) && Objects.equals(orderId, that.orderId) && Objects.equals(contextId, that.contextId) && Objects.equals(collectedUserId, that.collectedUserId) && Objects.equals(collectedUserName, that.collectedUserName) && Objects.equals(collectionTimeout, that.collectionTimeout) && Objects.equals(orderType, that.orderType) && Objects.equals(preOrder, that.preOrder) && Objects.equals(collectionConfirm, that.collectionConfirm) && Objects.equals(fulfilmentNumber, that.fulfilmentNumber) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(orderBookInFailedFlag, that.orderBookInFailedFlag) && Objects.equals(delayedBookInConfirmDate, that.delayedBookInConfirmDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tukCncOrdersPK, dateTime, orderTimestamp, parcelNumber, productDescription, dispatchDate, deliveryDate, orderMethod, releaseToCustomerDate, partner, owningBusinessDivision, sourceOfSale, manuallyAddedFlag, currentStatus, extendedFlag, extendUntilDate, manualReturnAllowedFlag, storeId, manuallyAddedUser, uncollected1SentFlag, uncollected2SentFlag, deliveryFailedSentFlag, manualReturnJustification, rboTradeinMake, rboTradeinModel, rboTradeinImei, rboTradeinReqFlag, rboTradeinConfirmedFlag, sourceFileName, collectionVerificationLevel, collectionIdType, collectionIdValue, createUserId, createDate, updateDate, updateUserId, recordState, isExpired, tillId, bookinDateTime, collectionDateTime, returnDateTime, overrideManagerBranch, overrideManagerCode, orderSource, orderId, contextId, collectedUserId, collectedUserName, collectionTimeout, orderType, preOrder, collectionConfirm, fulfilmentNumber, expirationDate, orderBookInFailedFlag, delayedBookInConfirmDate);
  }
}
