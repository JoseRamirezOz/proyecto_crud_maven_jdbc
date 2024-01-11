package org.example.main;

import org.example.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args){
        try (
                // CREAS LA CONEXION
                Connection myConn = DatabaseConnection.getInstance();

                // CREAS EL OBJETO DONDE SE PONDRA LA CONSULTA
                Statement myStamt = myConn.createStatement();

                // EJECUTAS LA CONSULTA Y GUARDAR EN UN OBJETO PREPARADO PARA RECIBIR ESTA INFORMACION
                ResultSet myRes = myStamt.executeQuery("SELECT * FROM employees");
        ){

            // TRATAS LOS DATOS OBTENIDOS
            while(myRes.next()){
                System.out.println(myRes.getString("first_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Conexión errada");
        }












    }
}