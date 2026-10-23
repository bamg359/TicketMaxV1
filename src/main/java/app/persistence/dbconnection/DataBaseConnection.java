package app.persistence.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static DataBaseConnection instance;
    private final Connection connection;

    private static final String url = "jdbc:mysql://localhost:3306/ticketmax_db";
    private static final String username = "root";
    private static final String password = "";

    private DataBaseConnection() {

        try {

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Se establecio conexión con la base de datos");

        } catch (SQLException e) {
            throw new RuntimeException("Erros al conectar a la base de dato" + e.getMessage());
        }
    }

    public static synchronized DataBaseConnection getInstance(){

        if (instance== null){
            instance = new DataBaseConnection();
        }
        return instance;
    }


    public Connection getConnection() {
        return connection;

    }

}
