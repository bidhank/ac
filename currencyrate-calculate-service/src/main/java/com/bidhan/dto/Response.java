package com.bidhan.dto;

public class Response {
    private String currencyCode;
    private Double totalPurchasingCost;
    private Double totalPurchasingCostWithMiddleExchangeRate;


    public Response(String currencyCode, Double totalPurchasingCost, Double totalPurchasingCostWithMiddleExchangeRate) {
        this.currencyCode = currencyCode;
        this.totalPurchasingCost = totalPurchasingCost;
        this.totalPurchasingCostWithMiddleExchangeRate = totalPurchasingCostWithMiddleExchangeRate;
    }


    public Response() {
    }


    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getTotalPurchasingCost() {
        return totalPurchasingCost;
    }

    public void setTotalPurchasingCost(Double totalPurchasingCost) {
        this.totalPurchasingCost = totalPurchasingCost;
    }

    public Double getTotalPurchasingCostWithMiddleExchangeRate() {
        return totalPurchasingCostWithMiddleExchangeRate;
    }

    public void setTotalPurchasingCostWithMiddleExchangeRate(Double totalPurchasingCostWithMiddleExchangeRate) {
        this.totalPurchasingCostWithMiddleExchangeRate = totalPurchasingCostWithMiddleExchangeRate;
    }
}
