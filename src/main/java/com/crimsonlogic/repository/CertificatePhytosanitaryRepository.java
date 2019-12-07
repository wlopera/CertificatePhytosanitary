package com.crimsonlogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crimsonlogic.entity.CertificatePhytosanitaryEntity;

@Repository

public interface CertificatePhytosanitaryRepository extends JpaRepository<CertificatePhytosanitaryEntity, Long> {

}
