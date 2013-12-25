/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gamelogic.Facing;
import gamelogic.PlayingGround;
import gamelogic.Position;
import gamelogic.Snake;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import picture.CreatePicture;
import util.LoggerHelper;
import static util.LoggerHelper.initLogger;

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
        Logger logger = initLogger();
        
        
        /**
         * Aufgabe1 Team Schlange          
         * 
         * Hier musst jetzt der Code eingefügt werden, der die letzte Position aus der Datenbank ließt
         * und dann ein update durchführt, das die neue Position dann in die Datenbank schreibt.
         * 
         * Erstellt hierfür eine Testschlange in der Datenbank!
         */
        
        /**
         * Aufgabe2 Team Schlange
         * Erweitert den Code von oben, so dass die Richtungsänderungen die Team Frontend in die Datenbank 
         * schreibt beachtet werden.
         * 
         * Lest die aktuelle Richtung aus einer entsprechenden Tabelle!
         */
        
        /**
         * Aufgabe3 Team Schlange
         * Wenn es eine Kollision gibt, 
         * dann muss die Schlange aus der Datenbank gelöscht werden
         * 
         * Ladet hierfür die Position aller Schlangen - zunächst mehrere Testschlangen - aus der Datenbank!
         * 
         * Bei der Spielertabelle, die zu der Schlange gehört, muss markiert werden, dass
         * der Spieler "tot" ist
         */
        
        /**
         * Aufgabe 4 Team Schlange
         * Erweitert Aufgabe1, so dass die Items aus der Datenbank gelesen werden, die Team Item in die Datenbank schreibt!
         *
         */
        
          // neue TestSchlange erstellen
        Position position = new Position(random.nextInt(99), random.nextInt(99));             
        Snake snake = new Snake(position,5, Facing.RIGHT);    
        PlayingGround playingGround = new PlayingGround(100, 100, snake);
        //logger.info(playingGround.toString()); // should be deleted in deploy version, because it creates huge files
        //logger.info(position.toString()); // should be deleted in deploy version, because it creates huge files
        
        
        // Bild erstellen ab hier bitte ignorieren
        // Cache für Bilder ausschalten
        CreatePicture instance = new CreatePicture();
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.
        
        instance.paintPicture(deployStream, playingGround.getPlayingGround()); //Size von dem Feld ist unabhängig von der größe des Pictures                
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
