package com.snjcoding.com.Aspatal.modal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@ToString
@Table(name = "patient",
        uniqueConstraints = {
        @UniqueConstraint(name = "unique_email", columnNames = {"email"})
        })
public class patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ToString.Exclude
    private LocalDate birthdate;
    private String email;
    private String gender;
    private LocalDateTime createdAt;
}
