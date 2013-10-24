package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Kompetenzplaner;

/**
 *
 * @author Julian
 */
public class StartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Kompetenzplaner k = new Kompetenzplaner();
        
        request.setAttribute("hw", k.termin.getDate());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    }
}
