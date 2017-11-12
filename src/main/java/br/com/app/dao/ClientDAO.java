package br.com.app.dao;

import br.com.app.models.Client;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends GenericDAO implements CRUD<Client> {

    public ClientDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void insert(Client instance) throws SQLException {
        String sql = "INSERT INTO client "
            + "(name_client, address_client, phone_client) VALUES (?, ?, ?)";
        
        prepareStatement(sql);
        
        setString(1, instance.getName());
        setString(2, instance.getAddress());
        setString(3, instance.getPhone());
        
        executeStatement();
        closeStatement();
    }

    @Override
    public Client search(Client instance) throws SQLException {
        String sql = "SELECT id_client, name_client, address_client, "
            + "phone_client FROM client WHERE id_client = ?";

        prepareStatement(sql);
        
        setLong(1, instance.getId());
        
        executeQuery();
        
        instance.setId(getLong(1));
        instance.setName(getString(2));
        instance.setAddress(getString(3));
        instance.setPhone(getString(4));
        
        executeStatement();
        closeStatement();
        
        return instance;
    }

    @Override
    public List<Client> list(Client instance) throws SQLException {
        String sql = "SELECT id_client, name_client, address_client, "
            + "phone_client FROM client WHERE name_client like %?%";
        
        prepareStatement(sql);
        
        setString(1, instance.getName());
        
        executeQuery();
        
        List<Client> clients = createList();
        
        closeResultSet();
        closeStatement();
        
        return clients;
    }

    @Override
    public List<Client> listAll() throws SQLException {
        String sql = "SELECT id_client, name_client, address_client, "
            + "phone_client FROM client";

        prepareStatement(sql);
        executeQuery();
        
        List<Client> clients = createList();
        
        closeResultSet();
        closeStatement();
        
        return clients;
    }

    public List<Client> createList() throws SQLException {
        List<Client> clients = new ArrayList<>();
        
        while (nextResultSet()) {
            Client client = new Client();
            
            client.setId(getLong(1));
            client.setName(getString(2));
            client.setAddress(getString(3));
            client.setPhone(getString(4));
            
            clients.add(client);
        }
        
        return clients;
    }
    
    @Override
    public void delete(Client instance) throws SQLException {
        String sql = "DELETE FROM client WHERE id_client = ?";
        
        prepareStatement(sql);
        setLong(1, instance.getId());
        executeStatement();
        closeStatement();
    }

    @Override
    public void update(Client instance) throws SQLException {
        String sql = "UPDATE client SET name_client = ?, address_client = ?, "
            + "phone_client = ? WHERE id_client = ?";
        
        prepareStatement(sql);
        setString(1, instance.getName());
        setString(2, instance.getAddress());
        setString(3, instance.getPhone());
        setLong(4, instance.getId());
        
        executeStatement();
        closeStatement();
    }

}