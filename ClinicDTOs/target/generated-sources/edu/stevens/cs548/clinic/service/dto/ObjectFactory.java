//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.30 at 06:15:35 PM MST 
//


package edu.stevens.cs548.clinic.service.dto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.stevens.cs548.clinic.service.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.stevens.cs548.clinic.service.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PatientDto }
     * 
     */
    public PatientDto createPatientDto() {
        return new PatientDto();
    }

    /**
     * Create an instance of {@link TreatmentDto }
     * 
     */
    public TreatmentDto createTreatmentDto() {
        return new TreatmentDto();
    }

    /**
     * Create an instance of {@link DrugTreatment }
     * 
     */
    public DrugTreatment createDrugTreatment() {
        return new DrugTreatment();
    }

    /**
     * Create an instance of {@link RadiologyTreatment }
     * 
     */
    public RadiologyTreatment createRadiologyTreatment() {
        return new RadiologyTreatment();
    }

    /**
     * Create an instance of {@link SurgeryTreatment }
     * 
     */
    public SurgeryTreatment createSurgeryTreatment() {
        return new SurgeryTreatment();
    }

    /**
     * Create an instance of {@link ProviderDto }
     * 
     */
    public ProviderDto createProviderDto() {
        return new ProviderDto();
    }

}
