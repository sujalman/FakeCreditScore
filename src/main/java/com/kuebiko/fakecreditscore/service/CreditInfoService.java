package com.kuebiko.fakecreditscore.service;

import com.kuebiko.fakecreditscore.model.CreditInfo;

public interface CreditInfoService {
    public CreditInfo getCreditScore(Long ssn);
}
