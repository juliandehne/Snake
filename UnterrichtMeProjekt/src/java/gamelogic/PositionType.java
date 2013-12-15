/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamelogic;

import java.awt.Color;

/**
 *
 * @author lenni
 * 
 * Was ist auf einem bestimmten feld auf dem Spielfeld? -> 
 */
public enum PositionType {
    ITEMNORMAL (new Color(0,0,0)),
    ITEMFAST (new Color(255, 255, 0)),
    ITEMSHORT (new Color(255, 0, 0)),
    BORDER (new Color(0, 0, 255)),
    EMPTY (new Color(0, 0, 0)),
    SNAKETAIL (new Color(0, 125, 0)),
    SNAKEHEAD (new Color(0, 255, 0));
    public final Color color;

    private PositionType(Color color) {
        this.color = color;
    }
}