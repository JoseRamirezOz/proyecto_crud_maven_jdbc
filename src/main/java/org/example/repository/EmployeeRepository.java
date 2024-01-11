package org.example.repository;

import org.example.model.Employee;
import org.example.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements Repository<Employee>{
    private Connection getConection() throws SQLException {
        return DatabaseConnection.getInstance();
    }

    @Override
    public List<Employee> findAll() throws SQLException {
        List<Employee> empleados = new ArrayList<>();
        try(Statement myStatement = getConection().createStatement();
            ResultSet myRes = myStatement.executeQuery("SELECT * FROM employees")
        ){
            while (myRes.next()){
                Employee e = createEmployee(myRes);
                empleados.add(e);
            }
        }catch (SQLException exception){
            System.out.println(exception);
        }

        return empleados;
    }



    @Override
    public Employee getById(Integer id) throws SQLException {
        Employee empleado = new Employee();

        try(PreparedStatement pstmt =
                    getConection().prepareStatement("SELECT * FROM employees WHERE id = ?")){
            pstmt.setInt(1, id);
            try (ResultSet res = pstmt.executeQuery()){
                if (res.next()) empleado = createEmployee(res);
            }
        }
        return empleado;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(Integer id) {

    }



    private Employee createEmployee(ResultSet myRes) throws SQLException {
        Employee e = new Employee();
        e.setId(myRes.getInt("id"));
        e.setFirst_name(myRes.getString("first_name"));
        e.setPa_surname(myRes.getString("pa_surname"));
        e.setMa_surname(myRes.getString("ma_surname"));
        e.setEmail(myRes.getString("email"));
        e.setSalary(myRes.getDouble("salary"));
        return e;
    }
}
