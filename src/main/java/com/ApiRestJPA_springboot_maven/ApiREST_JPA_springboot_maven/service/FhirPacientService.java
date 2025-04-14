package com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.service;

import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.model.FhirPacient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FhirPacientService {
    Page<FhirPacient> getAllPatients(Pageable pageable);
    FhirPacient addPatient(FhirPacient fhirPacient);
    void deletePatient(Integer patientId);
}
