package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tuk_cnct_history")
public class TukCnctHistory {

  @EmbeddedId
  private TukCnctHistoryPK tukCnctHistoryPK;

  @Column(name = "till_no")
  private Integer tillNo;

  @Column(name = "origin_branch")
  private Integer originBranch;

  @Column(name = "action_date_time")
  private LocalDateTime actionDateTime;

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

  @Column(name = "op_code")
  private String opCode;

  public TukCnctHistory(){}

  public TukCnctHistory(TukCnctHistoryPK tukCnctHistoryPK, Integer tillNo, Integer originBranch, LocalDateTime actionDateTime, String createUserId, LocalDate createDate, LocalDate updateDate, String updateUserId, String recordState, String opCode) {
    this.tukCnctHistoryPK = tukCnctHistoryPK;
    this.tillNo = tillNo;
    this.originBranch = originBranch;
    this.actionDateTime = actionDateTime;
    this.createUserId = createUserId;
    this.createDate = createDate;
    this.updateDate = updateDate;
    this.updateUserId = updateUserId;
    this.recordState = recordState;
    this.opCode = opCode;
  }

  public TukCnctHistoryPK getTukCnctHistoryPK() {
    return tukCnctHistoryPK;
  }

  public void setTukCnctHistoryPK(TukCnctHistoryPK tukCnctHistoryPK) {
    this.tukCnctHistoryPK = tukCnctHistoryPK;
  }

  public Integer getTillNo() {
    return tillNo;
  }

  public void setTillNo(Integer tillNo) {
    this.tillNo = tillNo;
  }

  public Integer getOriginBranch() {
    return originBranch;
  }

  public void setOriginBranch(Integer originBranch) {
    this.originBranch = originBranch;
  }

  public LocalDateTime getActionDateTime() {
    return actionDateTime;
  }

  public void setActionDateTime(LocalDateTime actionDateTime) {
    this.actionDateTime = actionDateTime;
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

  public String getOpCode() {
    return opCode;
  }

  public void setOpCode(String opCode) {
    this.opCode = opCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TukCnctHistory that = (TukCnctHistory) o;
    return tukCnctHistoryPK.equals(that.tukCnctHistoryPK) && tillNo.equals(that.tillNo) && originBranch.equals(that.originBranch) && actionDateTime.equals(that.actionDateTime) && createUserId.equals(that.createUserId) && createDate.equals(that.createDate) && updateDate.equals(that.updateDate) && updateUserId.equals(that.updateUserId) && recordState.equals(that.recordState) && opCode.equals(that.opCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tukCnctHistoryPK, tillNo, originBranch, actionDateTime, createUserId, createDate, updateDate, updateUserId, recordState, opCode);
  }
}
