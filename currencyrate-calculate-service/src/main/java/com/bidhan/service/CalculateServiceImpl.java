package com.bidhan.service;

import com.bidhan.dto.Rate;
import com.bidhan.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculateServiceImpl implements CalculateService{
    @Autowired
    RestTemplate rt;

    @Override
    public Response calculate(String currencyCode, String amount) {
        Response response=new Response();

        Rate rate=rt.getForObject("http://currencyrate-retrieve-service/rates/"+currencyCode+"/"+amount,Rate.class);

        response.setTotalPurchasingCost(Double.parseDouble(amount)*rate.getAskRate());
        response.setTotalPurchasingCostWithMiddleExchangeRate(Double.parseDouble(amount)*rate.getMidRate());
        response.setCurrencyCode(currencyCode);
        return response;
    }
}
