package org.netcracker.dto;

import java.util.List;

public class TukCnctDto {

  private String orderNumber;

  private Integer storeId;

  private String currentStatus;

  private List<TukCnctHistoryDto> tukCnctHistoryDtoList;

  public TukCnctDto() {}

  public TukCnctDto(String orderNumber, Integer storeId, String currentStatus, List<TukCnctHistoryDto> tukCnctHistoryDtoList) {
    this.orderNumber = orderNumber;
    this.storeId = storeId;
    this.currentStatus = currentStatus;
    this.tukCnctHistoryDtoList = tukCnctHistoryDtoList;
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

  public List<TukCnctHistoryDto> getTukCnctHistoryDtoList() {
    return tukCnctHistoryDtoList;
  }

  public void setTukCnctHistoryDtoList(List<TukCnctHistoryDto> tukCnctHistoryDtoList) {
    this.tukCnctHistoryDtoList = tukCnctHistoryDtoList;
  }
}
