package com.abdramsyah.services;

import java.util.List;

import com.abdramsyah.models.entities.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    public void destroyEmployeeById(Long id);
}
