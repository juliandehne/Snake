/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Datenbankzugriffe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import picture.CreatePicture;

/**
 *
 * @author Julian
 * 
 * Diese Klasse gibt bei Request der URL 
 * [ip]/image/* das Bild zurück
 */
public class ImageServlet extends HttpServlet {

    public ByteArrayOutputStream deployStream;
    
    public final static Random random = new Random();     

    public ImageServlet() {
        this.deployStream = new ByteArrayOutputStream();
    }
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        Einstiegspunkte e = new Einstiegspunkte();
        
        //e.setSpielerId((Integer)request.getAttribute("spielerid"));
        e.setSpielerId(1);
        
        //Datenbankzugriffe dbz = new Datenbankzugriffe();
        //dbz.log("ImageServlet");
        // Bild erstellen ab hier bitte ignorieren
        // Cache für Bilder ausschalten
        CreatePicture instance = new CreatePicture();
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.                
        
        instance.paintPicture(deployStream, e.getPlayingGround()); //Size von dem Feld ist unabhängig von der größe des Pictures                
        response.setContentType("image/png");
        response.getOutputStream().write(deployStream.toByteArray());
        response.getOutputStream().flush();
        //logger.info(deployStream.size());
        deployStream.reset();
        response.getOutputStream().close();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
