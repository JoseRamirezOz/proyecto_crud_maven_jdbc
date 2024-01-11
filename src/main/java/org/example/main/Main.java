package org.example.main;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        EmployeeRepository empleadoRepository = new EmployeeRepository();
        System.out.println(empleadoRepository.findAll());
        System.out.println(empleadoRepository.getById(5));
    }
}