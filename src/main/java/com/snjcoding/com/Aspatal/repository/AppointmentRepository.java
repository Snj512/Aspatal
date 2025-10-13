package com.snjcoding.com.Aspatal.repository;

import com.snjcoding.com.Aspatal.modal.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}