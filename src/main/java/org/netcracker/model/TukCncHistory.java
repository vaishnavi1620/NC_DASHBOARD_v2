package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tuk_cnc_history")
public class TukCncHistory {

  @EmbeddedId
  private TukCncHistoryPK tukCncHistoryPK;

  @Column(name = "action_date_time")
  private LocalDateTime actionDateTime;

  @Column(name = "till_no")
  private Integer tillNo;

  @Column(name = "trans_seq")
  private Integer transSeq;

  @Column(name = "origin_branch")
  private Integer originBranch;

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

  public TukCncHistory() {}

  public TukCncHistory(TukCncHistoryPK tukCncHistoryPK, LocalDateTime actionDateTime, Integer tillNo, Integer transSeq, Integer originBranch, String createUserId, LocalDate createDate, LocalDate updateDate, String updateUserId, String recordState, String opCode) {
    this.tukCncHistoryPK = tukCncHistoryPK;
    this.actionDateTime = actionDateTime;
    this.tillNo = tillNo;
    this.transSeq = transSeq;
    this.originBranch = originBranch;
    this.createUserId = createUserId;
    this.createDate = createDate;
    this.updateDate = updateDate;
    this.updateUserId = updateUserId;
    this.recordState = recordState;
    this.opCode = opCode;
  }

  public TukCncHistoryPK getTukCncHistoryPK() {
    return tukCncHistoryPK;
  }

  public void setTukCncHistoryPK(TukCncHistoryPK tukCncHistoryPK) {
    this.tukCncHistoryPK = tukCncHistoryPK;
  }

  public LocalDateTime getActionDateTime() {
    return actionDateTime;
  }

  public void setActionDateTime(LocalDateTime actionDateTime) {
    this.actionDateTime = actionDateTime;
  }

  public Integer getTillNo() {
    return tillNo;
  }

  public void setTillNo(Integer tillNo) {
    this.tillNo = tillNo;
  }

  public Integer getTransSeq() {
    return transSeq;
  }

  public void setTransSeq(Integer transSeq) {
    this.transSeq = transSeq;
  }

  public Integer getOriginBranch() {
    return originBranch;
  }

  public void setOriginBranch(Integer originBranch) {
    this.originBranch = originBranch;
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
    TukCncHistory that = (TukCncHistory) o;
    return Objects.equals(tukCncHistoryPK, that.tukCncHistoryPK) && Objects.equals(actionDateTime, that.actionDateTime) && Objects.equals(tillNo, that.tillNo) && Objects.equals(transSeq, that.transSeq) && Objects.equals(originBranch, that.originBranch) && Objects.equals(createUserId, that.createUserId) && Objects.equals(createDate, that.createDate) && Objects.equals(updateDate, that.updateDate) && Objects.equals(updateUserId, that.updateUserId) && Objects.equals(recordState, that.recordState) && Objects.equals(opCode, that.opCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tukCncHistoryPK, actionDateTime, tillNo, transSeq, originBranch, createUserId, createDate, updateDate, updateUserId, recordState, opCode);
  }
}
