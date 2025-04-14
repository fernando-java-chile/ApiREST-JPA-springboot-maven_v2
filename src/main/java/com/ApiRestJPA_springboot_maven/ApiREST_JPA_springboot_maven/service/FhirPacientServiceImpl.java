package com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.service;

import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.model.FhirPacient;
import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.repository.FhirPatientRepository;
import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.validation.RutValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class FhirPacientServiceImpl implements FhirPacientService {

    private static final Set<String> VALID_GENDERS = Set.of("male", "female", "other", "unknown");
    @Autowired
    private FhirPatientRepository fhirPacientRepository;

    @Override
    public FhirPacient addPatient(FhirPacient fhirPacient) {
        // Validar el valor de GENDER
        if (!VALID_GENDERS.contains(fhirPacient.getGender())) {
            throw new IllegalArgumentException("El valor de GENDER no es válido. Debe ser 'male', 'female', " +
                    "'other' o 'unknown'.");
        }

        // Validar formato del RUT si el tipo de identificador es CI
        if ("CI".equals(fhirPacient.getIdentifierTypeCode())) {
            if(!RutValidator.validarRut(fhirPacient.getIdentifierValue())) {
                throw new IllegalArgumentException("El RUT ingresado no es válido.");
            }
        }
        // Asignar valores predeterminados
        if (fhirPacient.getActive() == null) {
            fhirPacient.setActive("Y");
        }
        return fhirPacientRepository.save(fhirPacient);
    }

    @Override
    public void deletePatient(Integer patientId) {
        fhirPacientRepository.deleteById(patientId);
    }

    @Override
    public Page<FhirPacient> getAllPatients(Pageable pageable) {
        return (Page<FhirPacient>) fhirPacientRepository.findAll(pageable);
    }
}
