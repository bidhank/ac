package com.bidhan.service;

import com.bidhan.dto.Response;
import com.bidhan.dto.TableADto;
import com.bidhan.dto.TableCDto;
import com.bidhan.entity.TableA;
import com.bidhan.entity.TableC;
import com.bidhan.repo.TableARepo;
import com.bidhan.repo.TableCRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RetrieveRateServiceImpl implements RetrieveRateService{

    @Autowired
    private RestTemplate rt;

    @Autowired
    private TableARepo tableARepo;

    @Autowired
    private TableCRepo tableCRepo;

    @Override
    public void getRatesForTableA() {
        ResponseEntity<TableADto[]> response =
                rt.getForEntity(
                        "https://api.nbp.pl/api/exchangerates/tables/A/?format=json",
                        TableADto[].class);
        TableADto[] dtos = response.getBody();
        saveRatesForTableA(dtos[0]);
    }

    @Override
    public void saveRatesForTableA(TableADto dto) {
        List<TableA> listTableA=new ArrayList<>();
        List<TableADto.Rates> rates=dto.getRates();

        rates.forEach(r->{
            TableA ta=new TableA();
            ta.setNo(dto.getNo());
            ta.setEffectiveDate(dto.getEffectiveDate());
            ta.setCurrency(r.getCurrency());
            ta.setCode(r.getCode());
            ta.setMid(r.getMid());
            listTableA.add(ta);
        });
        tableARepo.saveAll(listTableA);
    }

    @Override
    public void getRatesForTableC() {
        ResponseEntity<TableCDto[]> response =
                rt.getForEntity(
                        "https://api.nbp.pl/api/exchangerates/tables/C/?format=json",
                        TableCDto[].class);
        TableCDto[] dtos = response.getBody();
        saveRatesForTableC(dtos[0]);
    }

    @Override
    public void saveRatesForTableC(TableCDto dto) {

        List<TableC> listTableC=new ArrayList<>();

        List<TableCDto.Rates> rates=dto.getRates();

        rates.forEach(r->{
            TableC ta=new TableC();
            ta.setNo(dto.getNo());
            ta.setEffectiveDate(dto.getEffectiveDate());
            ta.setTradingDate(dto.getTradingDate());
            ta.setCurrency(r.getCurrency());
            ta.setCode(r.getCode());
            ta.setAsk(r.getAsk());
            ta.setBid(r.getBid());
            listTableC.add(ta);
        });
        tableCRepo.saveAll(listTableC);
    }


    @Override
    public Response getRate(String currencyCode, String amount) {
        TableA tableA=tableARepo.findByCode(currencyCode);
        TableC tableC=tableCRepo.findByCode(currencyCode);

        Response response=new Response();
        response.setAskRate(tableC.getAsk());
        response.setMidRate(tableA.getMid());
        response.setCurrencyCode(currencyCode);


        return response;

    }
}
