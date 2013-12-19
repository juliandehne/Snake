/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgaben.logik;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import picture.CreatePicture;

/**
 *
 * @author Julian
 */
public class Aufgabe1 {

    public Aufgabe1() {
    }

    
    @Test
    public void Beispiel() {
        System.out.println("paintPicture");
        File outputStream = new File("./web/pics/aufgabe1.png");
        CreatePicture instance = new CreatePicture();
        instance.paintPicture(outputStream);
    }
    /**
     * Schaut euch die CreatePicture Klasse in dem package/Ordner picture an.
     * Mit STRG-Click auf die Klasse könnt ihr einfach dorthin navigieren.
     * 
     * Mit Rechtsclick -> Test File könnt ihr die Tests ausführen lassen
     * Vergleiche Beispiel
     */
    @Test
    public void aufgabe1() {
        
    }
}
