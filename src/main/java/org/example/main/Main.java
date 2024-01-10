package org.example.main;

import org.example.util.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        try (
                Connection myConn = DatabaseConnection.getInstance();
        ){
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Conexión errada");
        }
    }



}