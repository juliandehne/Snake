/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import picture.CreatePicture;
import gamelogic.*;
import itemlogic.ItemController;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import util.LoggerHelper;

/**
 *
 * @author Julian
 *
 * Diese Klasse ist die Hauptmethode des Spiels. Sie wird bei jedem Seitenbesuch
 * am Anfang aufgerufen
 */
public class Task extends Thread implements HttpSessionBindingListener {

    //Vielleicht ein bisschen gehackt --> ja leicht, aber das ist ok
    public static Facing facing = Facing.UP;

    static synchronized void setFacing(Facing facing) {
        Task.facing = facing;
    }

    public void run() {
        Logger logger = LoggerHelper.initLogger();
        logger.info("starte SnakeThread");
        
        // hier sollte eine Datenbankabfrage hin, die schaut, ob dieser Thread schon existiert, damit die 
        // Threads sich nicht multiplizieren
        while (true) {                
            // hier werden die neuen Items generiert
            ItemController itemController = new ItemController();
            itemController.spawnItems();

            // black magic
            try {
                this.sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task.class.getName()).log(Level.ERROR, null, ex);
            }
            if (isInterrupted()) {
                return;
            }
        }
    }

    
    public void valueBound(HttpSessionBindingEvent event) {
        start(); // Will instantly be started when doing session.setAttribute("task", new Task());
    }

    public void valueUnbound(HttpSessionBindingEvent event) {
        interrupt(); // Will signal interrupt when session expires.
    }

}
