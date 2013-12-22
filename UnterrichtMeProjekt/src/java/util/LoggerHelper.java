/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import controller.Task;
import java.io.IOException;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

/**
 *
 * @author Julian
 */
public class LoggerHelper {
    private static boolean hasInitializedLogger = false;

    /**
     * Diese Methode initialisiert einen Logger, den man verwenden kann, um den
     * aktuellen Zustand des Programmes zu evaluieren
     *
     * @return
     */
    public static Logger initLogger() {
        Logger logger = Logger.getRootLogger();
        if (!LoggerHelper.hasInitializedLogger) {
            logger.setLevel(Level.INFO);
            SimpleLayout layout = new SimpleLayout();
            ConsoleAppender consoleAppend = new ConsoleAppender(layout);
            logger.addAppender(consoleAppend);
            try {
                logger.addAppender(new FileAppender(layout, "C:\\Users\\Julian\\Desktop\\snakelog.log"));
            } catch (IOException ex) {
                System.err.println("could not init logger");
            }
            LoggerHelper.hasInitializedLogger = true;
        }
        return logger;
    }
    
}
