package com.kuebiko.fakecreditscore.dao;

import com.kuebiko.fakecreditscore.model.CreditInfo;

public interface CreditInfoDao{
    public CreditInfo checkScore(Long ssn);
}
