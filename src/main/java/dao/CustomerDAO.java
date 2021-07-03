package dao;

import dao.SQLConnection;
import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerDAO {
    SQLConnection sqlConnection = new SQLConnection();
    public List<Customer> findAll() throws SQLException, ClassNotFoundException {
        List<Customer> customers = new ArrayList<>();
        Connection connection = sqlConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer;");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            customers.add(new Customer(id, name, age, address));
        }
        return customers;
    }
}
