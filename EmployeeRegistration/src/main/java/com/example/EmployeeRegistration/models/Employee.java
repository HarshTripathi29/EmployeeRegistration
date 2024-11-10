package com.example.EmployeeRegistration.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
public class Employee {
    @Id
    private Long empId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String Department;
    private String salary;
    private String position;
}
