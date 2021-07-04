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
    private final String FIND_ALL_QUERY = "SELECT * FROM customer;";
    private final String ADD_QUERY = "INSERT INTO customer VALUES (?, ?, ?, ?);";
    public List<Customer> findAll() throws SQLException, ClassNotFoundException {

        List<Customer> customers = new ArrayList<>();
        Connection connection = sqlConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_QUERY);
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
    public void add(Customer customer) throws SQLException, ClassNotFoundException {
        Connection connection = sqlConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(ADD_QUERY);
        preparedStatement.setInt(1, customer.getId());
        preparedStatement.setInt(3, customer.getAge());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(4, customer.getAddress());
        preparedStatement.executeUpdate();

    }
}
