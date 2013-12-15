/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logik;

import java.util.ArrayList;

/**
 *
 * @author weichert
 */
public class Snake {
    int länge, ausrichtung;
    int letzteAusrichtung;
    ArrayList<Integer> schlange = new ArrayList<Integer>();
    Spielfeld spielfeld;
    
    public Snake(Spielfeld feld){
        
         this.spielfeld = feld;
         länge = 30;
         ausrichtung = 0;
         letzteAusrichtung = 2;
         for(int k = 1; k < (länge+1); k++){
            schlange.add(spielfeld.getfeldlength()/2+k);
            schlange.add(spielfeld.getfeld0length()/2);
         }
        
    }
    public int getSchlangeSize(){
        return schlange.size();
    }
    /**
     * Warum gibt die Methode getSchlange einen int zurück und kein 
     * Schlangenobjekt? (Dehne)
     * @param index
     * @return 
     */
    public int getSchlange(int index){
        return schlange.get(index);
    }
    public int getfeldlength(){
        return spielfeld.getfeldlength();
    }
    public int getfeld0length(){
        return spielfeld.getfeld0length();
    }
    public int getfeld(int x, int y){
        return spielfeld.getfeld(x, y);    
    }
    
    
}
