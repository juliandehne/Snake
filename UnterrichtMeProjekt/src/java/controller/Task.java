<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import picture.CreatePicture;
import gamelogic.*;
import itemlogic.ItemController;

/**
 *
 * @author Julian
 */
public class Task extends Thread implements HttpSessionBindingListener {
   
    //Vielleicht ein bisschen gehackt --> ja leicht, aber das ist ok
    public static Facing facing = Facing.UP;

    private final File deployStream;

    public Task(File file) {
        this.deployStream = file;
    }

    Task() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static synchronized void setFacing(Facing facing) {
       Task.facing = facing;
    }

    public void run() {
        Snake snake = new Snake(new Position(25,25),5, Facing.LEFT);
        PlayingGround playingGround = new PlayingGround(100,100,snake);
        while (true) {
            CreatePicture instance = new CreatePicture();
            instance.paintPicture(deployStream,playingGround.getPlayingGround()); //Size von dem Feld ist unabhängig von der größe des Pictures
            //instance.paintPicture(deployStream);
                       
            // das hier muss in die paintPictureMethode und dort als Datenbankzugriff implementiert werden
            //snake.setFacing(Task.facing);                        
//            snake.move(false);
//            boolean gameRunning = playingGround.update();
//            if (!gameRunning) {
//                //return;
//            }            

            ItemController itemController = new ItemController();
            itemController.spawnItems();
            
            try {
                this.sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
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
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import gamelogic.*;
import itemlogic.ItemController;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import util.LoggerHelper;

/**
 *
 * @author Julian Dehne
 *
 * Diese Klasse ist die Hauptmethode des Spiels. Sie wird bei jedem Seitenbesuch
 * am Anfang aufgerufen
 * 
 * WICHTIGE ÄNDERUNG: Das Bild wird nun in der Klasse ImageServlet generiert
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
            Einstiegspunkte e = new Einstiegspunkte();
            e.itemTeam();

            // black magic: Bewirkt, dass die Schleife für 800 Millisekunden angehalten wird.
            stopThreadfor800millis();
        }
    }

    /**
     * Am besten ignorieren
     * @param event 
     */
    public void valueBound(HttpSessionBindingEvent event) {
        start(); // Will instantly be started when doing session.setAttribute("task", new Task());
    }

    /**
     * Am besten ignorieren
     * @param event 
     */
    public void valueUnbound(HttpSessionBindingEvent event) {
        interrupt(); // Will signal interrupt when session expires.
    }

    /**
     * stop Thread for 800 millis 
     */
    private void stopThreadfor800millis() {
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
>>>>>>> 8622e1ab16ed9f6a262f92e7274148574d061b35
