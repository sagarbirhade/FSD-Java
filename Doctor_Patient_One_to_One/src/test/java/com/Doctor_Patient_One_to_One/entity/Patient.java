package com.Doctor_Patient_One_to_One.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "patient_table")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", nullable = false)
    private int patient_id;

    @Column
    private String name;

    @Column
    private String disease;

    @Column
    private String appointment;

    @Column
    private long contact;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.MERGE)
    private Doctor doctor;

    @Version
    @Column(name = "version")
    private int version;

    // Getters, setters, and constructors
    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient() {
        super();
    }

    public Patient(int patient_id, String name, String disease, String appointment, long contact, Doctor doctor) {
        super();
        this.patient_id = patient_id;
        this.name = name;
        this.disease = disease;
        this.appointment = appointment;
        this.contact = contact;
        this.doctor = doctor;
    }
}
