package com.romanmarkunas.fees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
@EnableAutoConfiguration
public class ExchangeFeesApp {

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public Map<String, Double> getFees(@RequestParam String stock) {
        Random rn = new Random(stock.hashCode());
        Map<String, Double> exchangeFees = new HashMap<>();
        exchangeFees.put("LSE", rn.nextDouble());
        exchangeFees.put("NYSE", rn.nextDouble());
        exchangeFees.put("JPX", rn.nextDouble());
        return exchangeFees;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExchangeFeesApp.class, args);
    }
}
