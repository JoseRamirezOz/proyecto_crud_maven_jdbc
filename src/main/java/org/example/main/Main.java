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

            /*Employee e = new Employee();
            //e.setId(33);
            e.setFirst_name("Homer");
            e.setPa_surname("Simpson");
            e.setMa_surname("Geori");
            e.setEmail("dotCom_unde@pato.com");
            e.setSalary(999.2);

            repository.save(e);

            */

            repository.delete(30);



            //System.out.println(repository.getById(33));
            System.out.println(repository.findAll());
        }


    }
}