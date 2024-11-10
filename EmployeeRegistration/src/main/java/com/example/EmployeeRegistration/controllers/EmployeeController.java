package com.example.EmployeeRegistration.controllers;

import com.example.EmployeeRegistration.models.Employee;
import com.example.EmployeeRegistration.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class EmployeeController {

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee employee){
        EmployeeService.addEmployee(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getALlEmployee(){
        List<Employee> allEmployee = EmployeeService.getAllEmployee();
        return allEmployee;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return getEmployeeById(id);
    }




}
