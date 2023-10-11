package com.example.company.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;



}
