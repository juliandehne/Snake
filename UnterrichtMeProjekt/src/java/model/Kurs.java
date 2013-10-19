/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class Kurs {
    List<Schüler> schuler;
    List<Termin> termine;
    String name;

    public Kurs() {
        this.schuler = new LinkedList<Schüler>();
        this.termine = new LinkedList<Termin>();
        this.name = "";
    }

    public Kurs(List<Schüler> schuler, List<Termin> termine, String name) {
        this.schuler = schuler;
        this.termine = termine;
        this.name = name;
    }
    
    
}
