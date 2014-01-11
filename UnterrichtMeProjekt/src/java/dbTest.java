/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import database.IdNamePair;
import database.MysqlConnect;
import database.VereinfachtesResultSet;
import java.util.ArrayList;

/**
 *
 * @author vogelsang
 */
public class dbTest {
        
    
     public static void main(String[] args) {
        System.out.println("connect");
        MysqlConnect instance = new MysqlConnect();   //voodoo             
        // Verbindung erstellen
        //instance.connect(); 
        //instance.connectLokal(); // bitte auskommentieren
        instance.connect();
        // datenbank test verwenden
        instance.otherStatements("use mydb;");
        // Tabelle löschen
        instance.otherStatements("drop table lehrer");
        // Tabelle erstellen
        instance.otherStatements("create table lehrer (id INT, name varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=utf8 ;");
        // Werte in Tabelle einfügen
        instance.issueInsertOrDeleteStatement("insert into lehrer (id,name) values (?,?)", 1,"hello");
        // Werte in Tabelle einfügen (nochmal)
        instance.issueInsertOrDeleteStatement("insert into lehrer (id,name) values (?,?)", 2,"hello2");
        // Werte in Tabelle einfügen (nochmal)
        instance.issueInsertOrDeleteStatement("insert into lehrer (id,name) values (?,?)", 3,"hello3");
        // update ausführen
        instance.issueUpdateStatement("update lehrer set name = ? where id = ?", "updatedhello", 1);
        // delete ausführen
        int i = 5;
        
        instance.issueInsertOrDeleteStatement("delete from lehrer where id = ?", 2);
        // select ausführen
        VereinfachtesResultSet result = instance.issueSelectStatement("select id, name from lehrer");                
        // resultset auslesen
        ArrayList<IdNamePair> ergebnisAlsArray = new ArrayList<IdNamePair>();        
        while (result.next()) {                        
            ergebnisAlsArray.add(new IdNamePair(result.getInt("id"), result.getString("name")));
        }                        
        instance.close();
        // Ergebnis ausgeben
        for(IdNamePair idNamePair : ergebnisAlsArray) {
            System.out.println("Die ID lautet: " + idNamePair.getId());
            System.out.println("Der Name lautet: " + idNamePair.getName());
        }
    }
    
}
