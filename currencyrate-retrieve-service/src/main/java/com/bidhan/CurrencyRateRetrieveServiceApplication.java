package com.bidhan;

import com.bidhan.service.RetrieveRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaClient
@Configuration
public class CurrencyRateRetrieveServiceApplication implements CommandLineRunner {
    @Autowired
    RetrieveRateService retrieveRateService;

    public static void main(String[] args) {
        SpringApplication.run(CurrencyRateRetrieveServiceApplication.class,args);
        System.out.println("Hello");
    }

    @Override
    public void run(String... arg0) throws Exception {
        retrieveRateService.getRatesForTableA();
        retrieveRateService.getRatesForTableC();
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
