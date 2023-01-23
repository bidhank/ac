package com.bidhan.dto;

import java.util.List;

public class TableCDto {
    private String no;
    private String tradingDate;
    private String effectiveDate;
    private List<Rates> rates;


    public TableCDto() {
    }

    public TableCDto(String no, String tradingDate, String effectiveDate, List<Rates> rates) {
        this.no = no;
        this.tradingDate = tradingDate;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
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

    public static class Rates{
        private String currency;
        private String code;
        private Double bid;
        private Double ask;

        public Rates(String currency, String code, Double bid, Double ask) {
            this.currency = currency;
            this.code = code;
            this.bid = bid;
            this.ask = ask;
        }


        public Rates() {
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

        public Double getBid() {
            return bid;
        }

        public void setBid(Double bid) {
            this.bid = bid;
        }

        public Double getAsk() {
            return ask;
        }

        public void setAsk(Double ask) {
            this.ask = ask;
        }
    }
}
