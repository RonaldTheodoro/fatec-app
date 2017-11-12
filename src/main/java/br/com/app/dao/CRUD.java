package br.com.app.dao;

import java.sql.SQLException;
import java.util.List;

public interface CRUD<T> {

    void insert(T instance) throws SQLException;
    
    T search(T instance) throws SQLException;
    
    List<T> list(T instance) throws SQLException;
    
    List<T> listAll() throws SQLException;
    
    List<T> createList() throws SQLException;
    
    void delete(T instance) throws SQLException;
    
    void update(T instance) throws SQLException;

}