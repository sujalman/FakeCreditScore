package com.kuebiko.fakecreditscore.repo;

import com.kuebiko.fakecreditscore.dto.CreditInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditInfoRepo extends JpaRepository <CreditInfoDto,Long> {
}
