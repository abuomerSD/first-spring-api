package com.eltayeb.firstSpringApi.controllers;


import com.eltayeb.firstSpringApi.models.Employee;
import com.eltayeb.firstSpringApi.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployeesList() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody  Employee employee ,@PathVariable Integer id) {
        Optional<Employee> oldEmployee = employeeService.findById(id);

        if(oldEmployee != null) {
            employee.setId(id);
            employeeService.save(employee);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        System.out.println("DELETE");
        employeeService.deleteById(id);
    }
}
