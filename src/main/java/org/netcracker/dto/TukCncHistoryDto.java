package org.netcracker.dto;

public class TukCncHistoryDto {

  private String status;

  private String actionDateTime;

  public TukCncHistoryDto() {}

  public TukCncHistoryDto(String status, String actionDateTime) {
    this.status = status;
    this.actionDateTime = actionDateTime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getActionDateTime() {
    return actionDateTime;
  }

  public void setActionDateTime(String actionDateTime) {
    this.actionDateTime = actionDateTime;
  }
}
