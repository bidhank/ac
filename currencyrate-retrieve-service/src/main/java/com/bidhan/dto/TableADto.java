package com.bidhan.dto;

import java.util.List;

public class TableADto {
    private String no;
    private String effectiveDate;
    private List<Rates> rates;

    public TableADto() {}

    public TableADto(String no, String effectiveDate, List<Rates> rates) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
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

    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }

    public static class Rates {
        private String currency;
        private String code;
        private Double mid;

        public Rates(){}

        public Rates(String currency, String code, Double mid) {
            this.currency = currency;
            this.code = code;
            this.mid = mid;
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
}
