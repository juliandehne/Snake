
package model;

import java.util.Date;

/**
 *
 * @author Julian
 */
public class Kompetenzplaner {
    public final Termin termin;

    public Kompetenzplaner() {
        /**
         * Entrypoint in application
         */    
        this.termin = new Termin(null, new Date());
    }
    
}
