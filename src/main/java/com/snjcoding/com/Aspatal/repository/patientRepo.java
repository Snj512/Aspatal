package com.snjcoding.com.Aspatal.repository;

import com.snjcoding.com.Aspatal.modal.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepo extends JpaRepository<patient, Integer> {
}
