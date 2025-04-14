package com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.repository;

import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.model.FhirPacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FhirPatientRepository extends JpaRepository<FhirPacient, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar pacientes por nombre, apellido, etc.
    // List<FhirPacient> findByName(String name);

}
