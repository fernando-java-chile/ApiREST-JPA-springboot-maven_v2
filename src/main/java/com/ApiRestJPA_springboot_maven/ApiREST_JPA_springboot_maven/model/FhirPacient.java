package com.ApiRestJPA_springboot_maven.ApiREST_JPA_springboot_maven.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "FHIR_PACIENT_CL_1_9_2_v2") // Cambia "SQLUser" al esquema correcto si es necesario
@Data // Usamos Lombok para generar getters, setters y toString automáticamente
public class FhirPacient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente el ID
    @Column(name = "PATIENT_ID", nullable = false)
    private Integer patientId;

    @Column(name = "ACTIVE", length = 1, columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private String active;

    @Size(max = 10, message = "Gender must be at most 10 characters")
    @Column(name = "GENDER", length = 10)
    private String gender;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "DECEASED_BOOLEAN", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String deceasedBoolean;

    @Column(name = "DECEASED_DATETIME")
    private Date deceasedDatetime;

    @Size(max = 100, message = "Name family must be at most 100 characters")
    @Column(name = "NAME_FAMILY", length = 100)
    private String nameFamily;

    @Size(max = 100, message = "Name given must be at most 100 characters")
    @Column(name = "NAME_GIVEN", length = 100)
    private String nameGiven;

    @Size(max = 50, message = "Name prefix must be at most 50 characters")
    @Column(name = "NAME_PREFIX", length = 50)
    private String namePrefix;

    @Size(max = 50, message = "Name suffix must be at most 50 characters")
    @Column(name = "NAME_SUFFIX", length = 50)
    private String nameSuffix;

    @Size(max = 20, message = "Telecom system must be at most 20 characters")
    @Column(name = "TELECOM_SYSTEM", length = 20)
    private String telecomSystem;

    @Size(max = 100, message = "Telecom value must be at most 100 characters")
    @Column(name = "TELECOM_VALUE", length = 100)
    private String telecomValue;

    @Size(max = 200, message = "Address line must be at most 200 characters")
    @Column(name = "ADDRESS_LINE", length = 200)
    private String addressLine;

    @Size(max = 100, message = "Address city must be at most 100 characters")
    @Column(name = "ADDRESS_CITY", length = 100)
    private String addressCity;

    @Size(max = 100, message = "Address state must be at most 100 characters")
    @Column(name = "ADDRESS_STATE", length = 100)
    private String addressState;

    @Size(max = 20, message = "Address postal code must be at most 20 characters")
    @Column(name = "ADDRESS_POSTAL_CODE", length = 20)
    private String addressPostalCode;

    @Size(max = 100, message = "Address country must be at most 100 characters")
    @Column(name = "ADDRESS_COUNTRY", length = 100)
    private String addressCountry;

    @Size(max = 50, message = "Marital status must be at most 50 characters")
    @Column(name = "MARITAL_STATUS", length = 50)
    private String maritalStatus;

    @Column(name = "MULTIPLE_BIRTH_BOOLEAN", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String multipleBirthBoolean;

    @Column(name = "MULTIPLE_BIRTH_INTEGER")
    private Integer multipleBirthInteger;

    @Size(max = 500, message = "Photo URL must be at most 500 characters")
    @Column(name = "PHOTO_URL", length = 500)
    private String photoUrl;

    @Size(max = 50, message = "Identidad genero code must be at most 50 characters")
    @Column(name = "IDENTIDAD_GENERO_CODE", length = 50)
    private String identidadGeneroCode;

    @Size(max = 100, message = "Identidad genero display must be at most 100 characters")
    @Column(name = "IDENTIDAD_GENERO_DISPLAY", length = 100)
    private String identidadGeneroDisplay;

    @Size(max = 50, message = "Sexo biologico code must be at most 50 characters")
    @Column(name = "SEXO_BIOLOGICO_CODE", length = 50)
    private String sexoBiologicoCode;

    @Size(max = 100, message = "Sexo biologico display must be at most 100 characters")
    @Column(name = "SEXO_BIOLOGICO_DISPLAY", length = 100)
    private String sexoBiologicoDisplay;

    @Size(max = 50, message = "Nacionalidad code must be at most 50 characters")
    @Column(name = "NACIONALIDAD_CODE", length = 50)
    private String nacionalidadCode;

    @Size(max = 100, message = "Nacionalidad display must be at most 100 characters")
    @Column(name = "NACIONALIDAD_DISPLAY", length = 100)
    private String nacionalidadDisplay;

    @Size(max = 20, message = "Identifier use must be at most 20 characters")
    @Column(name = "IDENTIFIER_USE", length = 20)
    private String identifierUse;

    @Size(max = 50, message = "Identifier type code must be at most 50 characters")
    @Column(name = "IDENTIFIER_TYPE_CODE", length = 50)
    private String identifierTypeCode;

    @Size(max = 100, message = "Identifier type display must be at most 100 characters")
    @Column(name = "IDENTIFIER_TYPE_DISPLAY", length = 100)
    private String identifierTypeDisplay;

    @Size(max = 100, message = "Identifier value must be at most 100 characters")
    @Column(name = "IDENTIFIER_VALUE", length = 100)
    private String identifierValue;

    @Size(max = 100, message = "Nombre oficial family must be at most 100 characters")
    @Column(name = "NOMBRE_OFICIAL_FAMILY", length = 100)
    private String nombreOficialFamily;

    @Size(max = 100, message = "Nombre oficial given must be at most 100 characters")
    @Column(name = "NOMBRE_OFICIAL_GIVEN", length = 100)
    private String nombreOficialGiven;

    @Size(max = 100, message = "Segundo apellido must be at most 100 characters")
    @Column(name = "SEGUNDO_APELLIDO", length = 100)
    private String segundoApellido;

    @Size(max = 100, message = "Nombre social given must be at most 100 characters")
    @Column(name = "NOMBRE_SOCIAL_GIVEN", length = 100)
    private String nombreSocialGiven;

    @Size(max = 50, message = "Contact relationship code must be at most 50 characters")
    @Column(name = "CONTACT_RELATIONSHIP_CODE", length = 50)
    private String contactRelationshipCode;

    @Size(max = 100, message = "Contact relationship display must be at most 100 characters")
    @Column(name = "CONTACT_RELATIONSHIP_DISPLAY", length = 100)
    private String contactRelationshipDisplay;

    @Size(max = 100, message = "Contact name family must be at most 100 characters")
    @Column(name = "CONTACT_NAME_FAMILY", length = 100)
    private String contactNameFamily;

    @Size(max = 100, message = "Contact name given must be at most 100 characters")
    @Column(name = "CONTACT_NAME_GIVEN", length = 100)
    private String contactNameGiven;

    @Size(max = 50, message = "Communication language code must be at most 50 characters")
    @Column(name = "COMMUNICATION_LANGUAGE_CODE", length = 50)
    private String communicationLanguageCode;

    @Size(max = 100, message = "Communication language display must be at most 100 characters")
    @Column(name = "COMMUNICATION_LANGUAGE_DISPLAY", length = 100)
    private String communicationLanguageDisplay;

    @Size(max = 500, message = "General practitioner reference must be at most 500 characters")
    @Column(name = "GENERAL_PRACTITIONER_REFERENCE", length = 500)
    private String generalPractitionerReference;

    @Size(max = 100, message = "General practitioner display must be at most 100 characters")
    @Column(name = "GENERAL_PRACTITIONER_DISPLAY", length = 100)
    private String generalPractitionerDisplay;

    @Column(name = "CREATED_DATE", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdDate;

    @Column(name = "LAST_UPDATED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date lastUpdated;

    @Size(max = 50, message = "Created by must be at most 50 characters")
    @Column(name = "CREATED_BY", length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'SYSTEM'")
    private String createdBy;

    @Size(max = 50, message = "Last updated by must be at most 50 characters")
    @Column(name = "LAST_UPDATED_BY", length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'SYSTEM'")
    private String lastUpdatedBy;
}