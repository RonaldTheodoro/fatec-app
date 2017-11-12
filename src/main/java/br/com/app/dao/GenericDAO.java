package br.com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class GenericDAO {
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public GenericDAO(Connection connection) {
        this.connection = connection;
    }

    protected void prepareStatement(String sql) throws SQLException {
        statement = connection.prepareStatement(sql);
    }

    protected void setString(int indice, String value) throws SQLException {
        statement.setString(indice, value);
    }

    protected String getString(int index) throws SQLException {
        return resultSet.getString(index);
    }

    protected void setInt(int indice, int value) throws SQLException {
        statement.setInt(indice, value);
    }

    protected int getInt(int index) throws SQLException {
        return resultSet.getInt(index);
    }

    protected void setLong(int indice, Long value) throws SQLException {
        statement.setLong(indice, value);
    }

    protected Long getLong(int index) throws SQLException {
        return resultSet.getLong(index);
    }

    protected void setDouble(int indice, double value) throws SQLException {
        statement.setDouble(indice, value);
    }

    protected double getDouble(int index) throws SQLException {
        return resultSet.getDouble(index);
    }

    protected void executeQuery() throws SQLException {
        resultSet = statement.executeQuery();
    }

    protected boolean nextResultSet() throws SQLException {
        return resultSet.next();
    }

    protected void executeStatement() throws SQLException {
        statement.execute();
    }

    protected void closeStatement() throws SQLException {
        statement.close();
    }

    protected void closeResultSet() throws SQLException {
        resultSet.close();
    }

}
