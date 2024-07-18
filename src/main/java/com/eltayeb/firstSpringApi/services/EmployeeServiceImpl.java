package com.eltayeb.firstSpringApi.services;

import com.eltayeb.firstSpringApi.models.Employee;
import com.eltayeb.firstSpringApi.repository.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }
    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {

    }
}
