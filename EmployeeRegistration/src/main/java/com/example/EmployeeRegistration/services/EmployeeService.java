package com.example.EmployeeRegistration.services;

import com.example.EmployeeRegistration.models.Employee;
import com.example.EmployeeRegistration.repositories.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    static EmployeeRepo employeeRepo;

    public static void addEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public static List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public static Optional<Employee> getEmployeeById(Long id){
        return employeeRepo.findById(id);
    }


}
