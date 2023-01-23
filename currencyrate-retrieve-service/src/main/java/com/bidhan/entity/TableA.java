package com.bidhan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TableA")
public class TableA {
    @Id
    private String no;
    private String effectiveDate;
    private String currency;
    private String code;
    private Double mid;

    public TableA() {
    }

    public TableA(String no, String effectiveDate, String currency, String code, Double mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }
}
