package com.kuebiko.fakecreditscore.controller;

import com.kuebiko.fakecreditscore.model.CreditInfo;
import com.kuebiko.fakecreditscore.service.CreditInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class Controller {

    @Autowired
    CreditInfoService creditInfoService;

    @RequestMapping(value = "/check-credit-score", method = RequestMethod.GET)
    public CreditInfo checkCreditScore(@RequestParam Long ssn) {
        return creditInfoService.getCreditScore(ssn);
    }
}