package com.bidhan.resource;

import com.bidhan.dto.Response;
import com.bidhan.service.RetrieveRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rates")
public class CurrencyRateResource {


    @Autowired
    RetrieveRateService retrieveRateService;

    @RequestMapping("/{currencyCode}/{amount}")
    public Response getRate(@PathVariable("currencyCode") String currencyCode,@PathVariable("amount") String amount ){
       return retrieveRateService.getRate(currencyCode,amount);
    }

}
