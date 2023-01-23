package com.bidhan;


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
public class CurrencyRateCalculateServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyRateCalculateServiceApp.class,args);
    }
    @Bean @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
