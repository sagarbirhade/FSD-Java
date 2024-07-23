package com.Doctor_Patient_One_to_One.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "doctor_table")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doct-id", nullable = false)
    private int doct_id;

    @Column
    private String dname;

    @Column
    private String specialist;

    @Column
    private long contact;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "patient_patient_id", referencedColumnName = "patient_id")
    private Patient patient;

    @Version
    @Column(name = "version")
    private int version;

    // Getters, setters, and constructors
    public int getDoct_id() {
        return doct_id;
    }

    public void setDoct_id(int doct_id) {
        this.doct_id = doct_id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor(int doct_id, String dname, String specialist, long contact, Patient patient) {
        super();
        this.doct_id = doct_id;
        this.dname = dname;
        this.specialist = specialist;
        this.contact = contact;
        this.patient = patient;
    }

    public Doctor() {
        super();
    }
}
