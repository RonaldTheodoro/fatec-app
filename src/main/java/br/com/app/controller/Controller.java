package br.com.app.controller;

import java.util.List;

public interface Controller<T> {

    void insert(T instance);

    void delete(T instance);

    void update(T instance);

    List<T> list(T instance);

    T search(T instance);

}
