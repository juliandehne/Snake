package database;

/**
 *
 * @author Julian
 */
public class IdRichtungPair {
    private int id;
    private String richtung;    

    public IdRichtungPair(int id, String richtung) {
        this.id = id;
        this.richtung = richtung;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getRichtung() {
        return richtung;
    }

    /**
     * @param name the name to set
     */
    public void setRichtung(String richtung) {
        this.richtung = richtung;
    }
    
}
