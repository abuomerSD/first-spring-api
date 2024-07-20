package com.eltayeb.firstSpringApi.services;

import com.eltayeb.firstSpringApi.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> findAll();
    Optional<Employee> findById(Integer id);
    void deleteById(Integer id);

}
