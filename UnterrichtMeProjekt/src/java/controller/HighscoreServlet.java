package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import util.LoggerHelper;

/**
 *
 * @author Julian
 */
public class HighscoreServlet extends HttpServlet {

    private static Boolean firstVisit = true;

    /**
     * Hier können HTML-GET-Anfragen verarbeitet werden
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Logger logger = LoggerHelper.initLogger();
        logger.info("Opening Start servlet class");

        //some magic        
        //Bilder laden im Hintergrund aktivieren
//        request.getSession().setAttribute("task", new Task());
        request.getRequestDispatcher("/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/highscore.jsp").forward(request, response);
    }

//    Hier können HTML POST Nachrichten verarbeitet werden
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /**
         * hier muss die spielerid dynamisch erstellt werden
         */        
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    }
}