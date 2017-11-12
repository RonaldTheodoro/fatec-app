package br.com.app.controller;

import br.com.app.models.Part;
import br.com.app.utill.Render;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PartController implements Task, Controller<Part> {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Render.jspPath(this, "part.jsp");
    }

    @Override
    public void insert(Part instance) {
        
    }

    @Override
    public void delete(Part instance) {
        
    }

    @Override
    public void update(Part instance) {
        
    }

    @Override
    public List<Part> list(Part instance) {
        return null;
    }
    
    @Override
    public Part search(Part instance) {
        return null;
    }
    
}