package com.pluralsight.dp;

import com.pluralsight.models.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Shipper> getAllShippers() {
        List<Shipper> shippers = new ArrayList<>();
        String shipperQuery = "SELECT ShipperID, CompanyName, Phone FROM shippers";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(shipperQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int shipperID = resultSet.getInt(1);
                String companyName = resultSet.getString(2);
                double phone = resultSet.getDouble(3);

                Shipper shipper = new Shipper(shipperID, companyName, phone);
                shippers.add(shipper);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return shippers;
    }

    public Shipper getShipperByID(int shipperID) {
        String shipperByIdQuery = "SELECT ShipperID, CompanyName, Phone FROM shippers WHERE shipperID = ?";
        Shipper shipper = null;

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(shipperByIdQuery) {
            preparedStatement.setInt(1, shipperID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int shipperIdFromDb = resultSet.getInt(1);
                    String companyName = resultSet.getString(2);
                    double phone = resultSet.getDouble(3);

                    shipper = new Shipper(shipperIdFromDb, companyName, phone);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  shipper;
    }
}
