package org.example.repository;

import org.example.model.Employee;

import java.util.List;

public class EmployeeRepository implements Repository<Employee>{

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee getById(Integer id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(Integer id) {

    }
}
