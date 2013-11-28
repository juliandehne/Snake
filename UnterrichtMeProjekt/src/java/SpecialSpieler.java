/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdehne
 */
public class SpecialSpieler extends Spieler{

    public SpecialSpieler(String name, String vorname, Integer alter) {
        super(name, vorname, alter);
        super.id = 99999;
    }
    
}
