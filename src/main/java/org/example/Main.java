package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/air_travel";
        String user = "postgres";
        String password = "Gthdsqyf[";

        Connection connection = null;
        connection = DriverManager.getConnection(url, user, password);

        String postgre = "select * from Company";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(postgre);
        rs.next();
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }

        String postgree = "select * from Trip where town_from = 'Moscow';";
        Statement  statemente = connection.createStatement();
        ResultSet rse = statemente.executeQuery(postgree);
        rse.next();
        while (rse.next()) {
            System.out.println(rs.getString(""));
        }


        String postgreee = "select * from Trip where town_from = 'Moscow';";
        Statement statementee = connection.createStatement();
        ResultSet rsee = statementee.executeQuery(postgreee);
        rsee.next();
        while (rsee.next()) {
            System.out.println(rs.getString(""));
        }


        String postgreeee = "select * from Passenger where passenger_name like '%man';";
        Statement statementeee = connection.createStatement();
        ResultSet rseee = statementeee.executeQuery(postgreeee);
        rseee.next();
        while (rseee.next()) {
            System.out.println(rs.getString(""));
        }


        String postgreeeeee = "select count(*) from Trip where plane like 'TU-134';";
        Statement statementeeeee = connection.createStatement();
        ResultSet rseeeee = statementeeeee.executeQuery(postgreeeeee);
        rseeeee.next();
        while (rseeeee.next()) {
            System.out.println(rs.getString(""));
        }


        String postgreeeeeew = "select company_name, Trip.id, Trip.plane from Company join Trip on Company.id = Trip.company_idwhere plane like 'Boeing';";
        Statement statementeeeeew = connection.createStatement();
        ResultSet rseeeeew = statementeeeeew.executeQuery(postgreeeeeew);
        rseeeeew.next();
        while (rseeeeew.next()) {
            System.out.println(rs.getString(""));
        }

        String postgreeeeeeq = "select plane from Trip where town_to like 'Moscow';";
        Statement statementeeeeeq = connection.createStatement();
        ResultSet rseeeeeq = statementeeeeeq.executeQuery(postgreeeeeeq);
        rseeeeeq.next();
        while (rseeeeeq.next()) {
            System.out.println(rs.getString(""));
        }
    }
}