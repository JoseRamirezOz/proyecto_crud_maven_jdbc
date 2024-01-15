package org.example.main;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.repository.Repository;
import org.example.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(Connection myConn = DatabaseConnection.getInstance()){
            Repository<Employee> repository = new EmployeeRepository();

            Employee e = new Employee();
            e.setId(29);
            e.setFirst_name("Paquita");
            e.setPa_surname("Ramirez");
            e.setMa_surname("Quiroz");
            e.setEmail("dotCom_unde@pato.com");
            e.setSalary(999.2);


            //System.out.println(repository.getById(2));

            repository.save(e);
            System.out.println(repository.findAll());
        }


    }
}