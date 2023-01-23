package com.bidhan.service;

import com.bidhan.dto.Response;

public interface CalculateService {
    public Response calculate(String currencyCode, String amount);
}
