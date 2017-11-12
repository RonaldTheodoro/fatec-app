package br.com.app.dao;

import br.com.app.models.Vehicle;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*
CREATE TABLE vehicle (
    id_vehicle INT NOT NULL PRIMARY KEY,
    brand_vehicle VARCHAR(100) NOT NULL,
    model_vehicle VARCHAR(100) NOT NULL,
    year_vehicle INT NOT NULL,
    category_vehicle VARCHAR(100) NOT NULL,
    color_vehicle VARCHAR(100) NOT NULL,
    value_vehicle DECINAL(7, 2) NOT NULL
);
*/

public class VehicleDAO extends GenericDAO implements CRUD<Vehicle> {
    
    public VehicleDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void insert(Vehicle instance) throws SQLException {
        
    }

    @Override
    public Vehicle search(Vehicle instance) throws SQLException {
        return null;
    }

    @Override
    public List<Vehicle> list(Vehicle instance) throws SQLException {
        return null;
    }

    @Override
    public List<Vehicle> listAll() throws SQLException {
        return null;
    }

    @Override
    public List<Vehicle> createList() throws SQLException {
        return null;
    }

    @Override
    public void delete(Vehicle instance) throws SQLException {
        
    }

    @Override
    public void update(Vehicle instance) throws SQLException {
        
    }

}