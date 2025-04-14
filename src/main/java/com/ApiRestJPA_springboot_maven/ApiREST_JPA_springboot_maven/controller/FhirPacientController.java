package com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.controller;

import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.dto.Response;
import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.dto.Support;
import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.model.FhirPacient;
import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.repository.FhirPatientRepository;
import com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.service.FhirPacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/patients")
public class FhirPacientController {
    private static final Logger logger = LoggerFactory.getLogger(FhirPacientController.class);

    @Autowired
    private FhirPacientService fhirPacientService;


    @GetMapping
    public ResponseEntity<Response<FhirPacient>> getAllPatients(
            @RequestParam(defaultValue = "0") int page,      // Página actual (por defecto 0)
            @RequestParam(defaultValue = "10") int perPage  // Elementos por página (por defecto 10)
    ) {
        // Configura la paginación
        Pageable pageable = PageRequest.of(page, perPage);

        // Obtiene los productos paginados
        Page<FhirPacient> patientPage = fhirPacientService.getAllPatients(pageable);

        // Verifica si hay productos
        if (patientPage.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        // Crea la respuesta estandarizada
        Response<FhirPacient> response = new Response<>(
                patientPage.getNumber(),         // Página actual
                patientPage.getSize(),           // Elementos por página
                patientPage.getTotalElements(),  // Total de elementos
                patientPage.getTotalPages(),     // Total de páginas
                patientPage.getContent(),        // Lista de productos
                new Support("https://example.com/support", "Contact us for support") // Soporte
        );
        return ResponseEntity.ok(response);
    }
    @PostMapping
    public ResponseEntity<?> addPatient(@RequestBody FhirPacient fhirPacient) {
        try
        {
            fhirPacientService.addPatient(fhirPacient);
            return new ResponseEntity<>(fhirPacient, HttpStatus.CREATED);
        }
        catch (Exception e) {
            // Se registra el error en el log para su análisis
            logger.error("Error al insertar paciente: {}", e.getMessage());
            // Se retorna un mensaje de error junto con un código HTTP apropiado
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error al insertar paciente: " + e.getMessage());
        }

    }

    @DeleteMapping("/{patientId}")
    public void deletePatient(@PathVariable Integer patientId) {
        fhirPacientService.deletePatient(patientId);
    }
}