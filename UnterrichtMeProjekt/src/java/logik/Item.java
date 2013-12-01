/**
 * Lieber Fabian,
 * 
 * die Klassen enthalten Kompilierfehler (die roten Markierungen)
 * Die Struktur, warum ein Highscore ein item enthält, ist mir unklar.
 * Der Sinn der Klasse "Normal" erschließt sich mir nicht.
 * 
 * Goldene Regel: Nur Dinge pushen, die keine Kompilierfehler enthalten.
 */
package logik;

import java.util.Random;

/**
 *
 * @author krah
 */
class Item {
    protected int x;
    protected int y;
    public int punkte;
    public int zeit;
    public int pause;
    public Item(int x, int y){
        this.x = random();
        this.y = random();
    } 
    
    public int random() {
        Random r = new Random();
        return r;
    }
        
}


    
