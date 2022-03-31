package com.kuebiko.fakecreditscore.dao;

import com.kuebiko.fakecreditscore.dto.CreditInfoDto;
import com.kuebiko.fakecreditscore.model.CreditInfo;
import com.kuebiko.fakecreditscore.repo.CreditInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreditInfoDaoImpl implements CreditInfoDao{

    @Autowired
    CreditInfoRepo creditInfoRepo;

    @Override
    public CreditInfo checkScore(Long ssn) {
        //Optional -> java 8 feature
        //Optional is used for wrapping the values (null or not null)
        //Optional<DataType>
        //Optional<String> lp;

        Optional<CreditInfoDto> optional = creditInfoRepo.findById(ssn);

        if(optional.isPresent()){
            CreditInfoDto response = optional.get();
            CreditInfo creditInfo = new CreditInfo();
            creditInfo.setCreditScore(response.getCreditScore());
            creditInfo.setSsn(response.getSsn());
            return  creditInfo;
        } else {
            return null;
        }
    }
}
