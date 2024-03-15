package project_Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement stm;

    public Conn(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ Hotel_Project", "root", "Sunny123@");
            stm = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}