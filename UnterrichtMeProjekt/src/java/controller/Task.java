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

/**
 *
 * @author Julian
 */
public class Task extends Thread implements HttpSessionBindingListener {

    private final File deployStream;

    public Task(File file) {
        this.deployStream = file;
    }

    Task() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        Snake snake = new Snake(new Position(25,25),5, Facing.LEFT);
        PlayingGround playingGround = new PlayingGround(50,50,snake);
        while (true) {
            CreatePicture instance = new CreatePicture();
            instance.paintPicture(deployStream,playingGround); //Size von dem Feld ist unabhängig von der größe des Pictures
            //instance.paintPicture(deployStream);

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