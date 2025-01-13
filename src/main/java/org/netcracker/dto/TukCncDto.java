package org.netcracker.dto;

import java.util.List;

public class TukCncDto {

  private String orderNumber;

  private Integer storeId;

  private String currentStatus;

  private List<TukCncHistoryDto> tukCncHistoryDtoList;

  public TukCncDto() {}

  public TukCncDto(String orderNumber, Integer storeId, String currentStatus, List<TukCncHistoryDto> tukCncHistoryDtoList) {
    this.orderNumber = orderNumber;
    this.storeId = storeId;
    this.currentStatus = currentStatus;
    this.tukCncHistoryDtoList = tukCncHistoryDtoList;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public String getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
  }

  public List<TukCncHistoryDto> getTukCncHistoryDtoList() {
    return tukCncHistoryDtoList;
  }

  public void setTukCncHistoryDtoList(List<TukCncHistoryDto> tukCncHistoryDtoList) {
    this.tukCncHistoryDtoList = tukCncHistoryDtoList;
  }
}
