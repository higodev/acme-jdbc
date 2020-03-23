package acme.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AcmeJdbc {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection server = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost/acme_jdbc", "root", "root");
            Statement query = (Statement) server.createStatement();
            query.executeUpdate("insert into cliente (nome, telefone) values ('Higo', '83999337165')");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
