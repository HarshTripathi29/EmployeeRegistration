package com.example.EmployeeRegistration.repositories;
import com.example.EmployeeRegistration.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
