package com.Doctor_Patient_One_to_One.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Doctor_Patient_One_to_One.entity.Doctor;
import com.Doctor_Patient_One_to_One.entity.Patient;

public class Doctor_Patient_Main {

    public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");

        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();

        Patient p1 = new Patient(101, "Bhushan Patil", "Albinism", "Dr.Sumit", 123456799, null);
        Doctor d1 = new Doctor(501, "Dr.Sumit", "Skin Care Specialist", 565655656, p1);

        p1.setDoctor(d1);
        d1.setPatient(p1);

        session.save(p1);
        session.save(d1);
        trans.commit();
        session.close();
        factory.close();
    }
}
