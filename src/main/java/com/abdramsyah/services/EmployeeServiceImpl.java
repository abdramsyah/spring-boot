package com.abdramsyah.services;

import java.util.List;
import java.util.Optional;

import com.abdramsyah.models.entities.Employee;
import com.abdramsyah.models.repos.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepo.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found fo id :: " + id );
        }
        return employee;
    }

    @Override
    public void destroyEmployeeById(Long id) {
        this.employeeRepo.deleteById(id);
        
    }
    
}
