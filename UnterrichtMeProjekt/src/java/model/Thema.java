/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Julian
 */
public class Thema {

    private List<Kompetenz> kompetenzen;
    private List<Meinung> meinungen;
    private String beschreibung;
    private String name;

    public Thema(String name) {
        this.name = name;
    }

    public List<Kompetenz> getKompetenzen() {
        return kompetenzen;
    }

    public void setKompetenzen(List<Kompetenz> kompetenzen) {
        this.kompetenzen = kompetenzen;
    }

    public List<Meinung> getMeinungen() {
        return meinungen;
    }

    public void setMeinungen(List<Meinung> meinungen) {
        this.meinungen = meinungen;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
