/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdehne
 */
public class Spieler {

    public String name; 
    public String vorname;
    public Integer alter;
    protected int id;
        
    
    public Spieler(String name, String vorname, Integer alter) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;   
        this.id = 1000000;
    }
    
}
