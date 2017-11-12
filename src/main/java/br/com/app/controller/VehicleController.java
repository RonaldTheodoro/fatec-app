package br.com.app.controller;

import br.com.app.models.Vehicle;
import br.com.app.utill.Render;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VehicleController implements Task, Controller<Vehicle> {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Render.jspPath(this, "vehicle.jsp");
    }

    @Override
    public void insert(Vehicle instance) {
        
    }

    @Override
    public void delete(Vehicle instance) {
        
    }

    @Override
    public void update(Vehicle instance) {
        
    }

    @Override
    public List<Vehicle> list(Vehicle instance) {
        return null;
    }
    
    @Override
    public Vehicle search(Vehicle instance) {
        return null;
    }
    
}