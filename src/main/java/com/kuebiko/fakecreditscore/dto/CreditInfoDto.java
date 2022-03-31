package com.kuebiko.fakecreditscore.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditInfoDto {

    @Id
    private Long ssn;
    private int creditScore;

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

}
