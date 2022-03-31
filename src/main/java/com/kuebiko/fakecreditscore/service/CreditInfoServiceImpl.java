package com.kuebiko.fakecreditscore.service;

import com.kuebiko.fakecreditscore.dao.CreditInfoDao;
import com.kuebiko.fakecreditscore.model.CreditInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditInfoServiceImpl implements CreditInfoService{

    @Autowired
    CreditInfoDao creditInfoDao;

    @Override
    public CreditInfo getCreditScore(Long ssn) {
        String ssnToString = String.valueOf(ssn);
        int ssnLength = ssnToString.length();
        if(ssnLength != 9 ){
            CreditInfo creditInfo = new CreditInfo();
            creditInfo.setMessage("Invalid SSN ");
            return creditInfo;
        }
        return creditInfoDao.checkScore(ssn);
    }
}
