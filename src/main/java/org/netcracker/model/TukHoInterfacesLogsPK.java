package org.netcracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class TukHoInterfacesLogsPK implements Serializable {

    @Column(name = "organization_id")
    private Integer orgId;

    @Column(name = "rtl_loc_Id")
    private Integer rtlLocId;

    @Column(name = "wkstn_id")
    private Integer wkstnId;

    @Column(name = "log_seq")
    private Integer logSeq;

    @Column(name = "create_date")
    private LocalDate createDate;

    public TukHoInterfacesLogsPK(){

    }

    public TukHoInterfacesLogsPK(Integer orgId, Integer rtlLocId, Integer wkstnId, Integer logSeq, LocalDate createDate) {
        this.orgId = orgId;
        this.rtlLocId = rtlLocId;
        this.wkstnId = wkstnId;
        this.logSeq = logSeq;
        this.createDate = createDate;
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

    public Integer getWkstnId() {
        return wkstnId;
    }

    public void setWkstnId(Integer wkstnId) {
        this.wkstnId = wkstnId;
    }

    public Integer getLogSeq() {
        return logSeq;
    }

    public void setLogSeq(Integer logSeq) {
        this.logSeq = logSeq;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TukHoInterfacesLogsPK that = (TukHoInterfacesLogsPK) o;
        return orgId.equals(that.orgId) && rtlLocId.equals(that.rtlLocId) &&
                wkstnId.equals(that.wkstnId) && logSeq.equals(that.logSeq) &&
                createDate.equals(that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId,rtlLocId,wkstnId,logSeq,createDate);
    }
}
