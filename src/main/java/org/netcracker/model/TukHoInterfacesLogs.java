package org.netcracker.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tuk_ho_interfaces_logs")
public class TukHoInterfacesLogs {

    @EmbeddedId
    private TukHoInterfacesLogsPK tukHoInterfacesLogsPK;

    @Column(name = "interface_name")
    private String interfaceName;

    @Column(name = "status")
    private String status;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "transaction_ref")
    private String transactionRef;

    @Column(name = "request_type")
    private String requestType;

    @Column(name = "http_response_status_code")
    private String HttpRespStatusCode;

    @Column(name = "reservation_number")
    private String reservationNumber;

    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "soa_transaction_id")
    private String soaTransId;

    @Column(name = "create_user_id")
    private String createUserId;

    @Column(name = "update_date")
    private LocalDate updateDate;

    @Column(name = "update_user_id")
    private String updateUserId;

    @Column(name = "request_data", columnDefinition="CLOB NOT NULL")
    @Lob
    private String requestData;

    @Column(name = "response_data", columnDefinition="CLOB NOT NULL")
    @Lob
    private String responseData;

    @Column(name = "soa_fault_code", columnDefinition="CLOB NOT NULL")
    @Lob
    private String soaFaultCode;

    @Column(name = "cnc_message")
    private String cncMessage;

    @Column(name= "cnc_additional_message")
    private String cncAddMessage;

    @Column(name = "create_timestamp")
    private LocalDateTime createTimeStamp;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "purge_date")
    private LocalDate purgeDate;

    @Column(name = "rec_seq")
    private Integer recSeq;


  public TukHoInterfacesLogs(){}

  public TukHoInterfacesLogs(TukHoInterfacesLogsPK tukHoInterfacesLogsPK, String interfaceName, String status, String itemId, String transactionRef, String requestType, String httpRespStatusCode, String reservationNumber, String orderNumber, String soaTransId, String createUserId, LocalDate updateDate, String updateUserId, String requestData, String responseData, String soaFaultCode, String cncMessage, String cncAddMessage, LocalDateTime createTimeStamp, String orderId, LocalDate purgeDate, Integer recSeq) {
    this.tukHoInterfacesLogsPK = tukHoInterfacesLogsPK;
    this.interfaceName = interfaceName;
    this.status = status;
    this.itemId = itemId;
    this.transactionRef = transactionRef;
    this.requestType = requestType;
    HttpRespStatusCode = httpRespStatusCode;
    this.reservationNumber = reservationNumber;
    this.orderNumber = orderNumber;
    this.soaTransId = soaTransId;
    this.createUserId = createUserId;
    this.updateDate = updateDate;
    this.updateUserId = updateUserId;
    this.requestData = requestData;
    this.responseData = responseData;
    this.soaFaultCode = soaFaultCode;
    this.cncMessage = cncMessage;
    this.cncAddMessage = cncAddMessage;
    this.createTimeStamp = createTimeStamp;
    this.orderId = orderId;
    this.purgeDate = purgeDate;
    this.recSeq = recSeq;
  }

  public TukHoInterfacesLogsPK getTukHoInterfacesLogsPK() {
        return tukHoInterfacesLogsPK;
    }

    public void setTukHoInterfacesLogsPK(TukHoInterfacesLogsPK tukHoInterfacesLogsPK) {
        this.tukHoInterfacesLogsPK = tukHoInterfacesLogsPK;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public String getHttpRespStatusCode() {
        return HttpRespStatusCode;
    }

    public void setHttpRespStatusCode(String httpRespStatusCode) {
        HttpRespStatusCode = httpRespStatusCode;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
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

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public String getSoaFaultCode() {
        return soaFaultCode;
    }

    public void setSoaFaultCode(String soaFaultCode) {
        this.soaFaultCode = soaFaultCode;
    }

    public String getCncMessage() {
        return cncMessage;
    }

    public void setCncMessage(String cncMessage) {
        this.cncMessage = cncMessage;
    }

    public String getCncAddMessage() {
        return cncAddMessage;
    }

    public void setCncAddMessage(String cncAddMessage) {
        this.cncAddMessage = cncAddMessage;
    }

    public LocalDateTime getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(LocalDateTime createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getPurgeDate() {
        return purgeDate;
    }

    public void setPurgeDate(LocalDate purgeDate) {
        this.purgeDate = purgeDate;
    }

    public Integer getRecSeq() {
        return recSeq;
    }

    public void setRecSeq(Integer recSeq) {
        this.recSeq = recSeq;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getSoaTransId() {
        return soaTransId;
    }

    public void setSoaTransId(String soaTransId) {
        this.soaTransId = soaTransId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TukHoInterfacesLogs that = (TukHoInterfacesLogs) o;
        return tukHoInterfacesLogsPK.equals(that.tukHoInterfacesLogsPK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tukHoInterfacesLogsPK);
    }
}
