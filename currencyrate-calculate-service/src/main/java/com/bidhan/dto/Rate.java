package com.bidhan.dto;

public class Rate {
    private String currencyCode;
    private Double askRate;
    private Double midRate;

    public Rate(String currencyCode, Double askRate, Double midRate) {
        this.currencyCode = currencyCode;
        this.askRate = askRate;
        this.midRate = midRate;
    }

    public Rate() {
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getAskRate() {
        return askRate;
    }

    public void setAskRate(Double askRate) {
        this.askRate = askRate;
    }

    public Double getMidRate() {
        return midRate;
    }

    public void setMidRate(Double midRate) {
        this.midRate = midRate;
    }
}
