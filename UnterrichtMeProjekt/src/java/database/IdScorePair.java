package database;

/**
 *
 * @author Julian
 */
public class IdScorePair {
    private int id;
    private int punkte;    

    public IdScorePair(int id, int punkte) {
        this.id = id;
        this.punkte = punkte;
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
    public int getScore() {
        return punkte;
    }

    /**
     * @param name the name to set
     */
    public void setScore(int punkte) {
        this.punkte = punkte;
    }
    
}

