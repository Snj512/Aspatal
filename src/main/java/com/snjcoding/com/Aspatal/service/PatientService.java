package com.snjcoding.com.Aspatal.service;

import com.snjcoding.com.Aspatal.modal.patient;
import com.snjcoding.com.Aspatal.repository.patientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final patientRepo patientRepo;

    public void getPatientById(int id){
        Optional<patient> p1 = patientRepo.findById(id);
    }

}
