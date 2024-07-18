package com.eltayeb.firstSpringApi.repository;

import com.eltayeb.firstSpringApi.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
