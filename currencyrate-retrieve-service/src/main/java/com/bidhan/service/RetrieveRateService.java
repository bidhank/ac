package com.bidhan.service;

import com.bidhan.dto.Response;
import com.bidhan.dto.TableADto;
import com.bidhan.dto.TableCDto;

public interface RetrieveRateService {
    public void getRatesForTableA();
    public void getRatesForTableC();
    public void saveRatesForTableA(TableADto t);
    public void saveRatesForTableC(TableCDto t);
    public Response getRate(String currencyCode, String amount);
}
