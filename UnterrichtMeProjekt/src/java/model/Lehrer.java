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
public class Lehrer {
    public List<Kurs> kurse;    

    public Lehrer() {
        this.kurse = new LinkedList<Kurs>();
    }
}
