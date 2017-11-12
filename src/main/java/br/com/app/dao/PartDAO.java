package br.com.app.dao;

import br.com.app.models.Part;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartDAO extends GenericDAO implements CRUD<Part> {

    public PartDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void insert(Part instance) throws SQLException {
        String sql = "INSERT INTO part "
            + "(name_part, model_part, value_part) VALUES (?, ?, ?)";
        
        prepareStatement(sql);
        
        setString(1, instance.getName());
        setString(2, instance.getModel());
        setDouble(3, instance.getValue());
        
        executeStatement();
        closeStatement();
    }

    @Override
    public Part search(Part instance) throws SQLException {
        String sql = "SELECT id_part, name_part, model_part, value_part "
            + "FROM part WHERE id_part = ?";
        
        prepareStatement(sql);
        
        setLong(1, instance.getId());
        
        executeQuery();
        
        return null;
    }

    @Override
    public List<Part> list(Part instance) throws SQLException {
        String sql = "SELECT id_part, name_part, model_part, value_part "
            + "FROM part WHERE id_part = ?";
        
        prepareStatement(sql);
        
        setLong(1, instance.getId());
        
        executeQuery();
        
        List<Part> parts = createList();
        
        closeResultSet();
        closeStatement();
        
        return parts;
    }

    @Override
    public List<Part> listAll() throws SQLException {
        String sql = "SELECT id_part, name_part, model_part, "
            + "value_part FROM part";
        
        prepareStatement(sql);

        executeQuery();
        
        List<Part> parts = createList();
        
        closeResultSet();
        closeStatement();
        
        return parts;
    }

    @Override
    public List<Part> createList() throws SQLException {
        List<Part> parts = new ArrayList<>();
        
        while (nextResultSet()) {
            Part part = new Part();
            
            part.setId(getLong(1));
            part.setName(getString(2));
            part.setModel(getString(3));
            part.setValue(Double.parseDouble(getString(4)));
            
            parts.add(part);
        }
        
        return parts;
    }

    @Override
    public void delete(Part instance) throws SQLException {
        String sql = "DELETE FROM peca WHERE id_peca = ?";
        
        prepareStatement(sql);
        
        setLong(1, instance.getId());
        
        executeStatement();
        closeStatement();
    }

    @Override
    public void update(Part instance) throws SQLException {
        String sql = "UPDATE peca SET name_part = ?, model_part = ?, "
            + "value_part = ? WHERE id_part = ?";
        
        prepareStatement(sql);
        setString(1, instance.getName());
        setString(2, instance.getModel());
        setDouble(3, instance.getValue());
        setLong(4, instance.getId());
        
        executeStatement();
        closeResultSet();
    }
    
}