package br.com.app.controller;

import br.com.app.utill.Render;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController implements Task {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Render.jspPath(this, "index.jsp");
    }
    
}