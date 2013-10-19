/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Julian
 */
public class Termin {

    private List<Thema> themen;
    private Date date;

    public Termin() {
        this.themen = new LinkedList<Thema>();
    }

    public Termin(List<Thema> themen, Date date) {
        this.themen = themen;
        this.date = date;
    }

    public List<Thema> getThemen() {
        return themen;
    }

    public void setThemen(List<Thema> themen) {
        this.themen = themen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
