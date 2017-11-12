package br.com.app.controller;

import br.com.app.models.Client;
import br.com.app.utill.Render;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientController implements Task, Controller<Client> {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Render.jspPath(this, "client.jsp");
    }

    @Override
    public void insert(Client instance) {
        
    }

    @Override
    public void delete(Client instance) {
        
    }

    @Override
    public void update(Client instance) {
        
    }

    @Override
    public List<Client> list(Client instance) {
        return null;
    }

    @Override
    public Client search(Client instance) {
        return null;
    }

}