package com.bidhan.controller;


import com.bidhan.dto.Response;
import com.bidhan.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalcServiceController {
    @Autowired
    CalculateService calculateService;

    @GetMapping("/{currencyCode}/{amount}")
    public @ResponseBody Response
    calculatePurchasingCost(@PathVariable("currencyCode")String currencyCode, @PathVariable("amount")String amount){

        return calculateService.calculate(currencyCode,amount);

    }

}
