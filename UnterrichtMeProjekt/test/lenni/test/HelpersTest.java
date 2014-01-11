/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lenni.test;

import database.MysqlConnect;
import database.VereinfachtesResultSet;
import gamelogic.Facing;
import gamelogic.PlayingGround;
import gamelogic.Position;
import gamelogic.PositionType;
import gamelogic.Snake;
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;
import picture.CreatePicture;

/**
 *
 * @author lenni
 */
public class HelpersTest {

    @Test
    public void test() {
//        Snake snake = new Snake(new Position(25, 25), 5, Facing.LEFT);
//        // playingGround wird nicht verwendet ...
//        PlayingGround playingGround = new PlayingGround(100, 100, snake);
//        PositionType[][] arr = new PositionType[100][100];
//        for (int x = 0; x < arr.length; x++) {
//            for (int y = 0; y < arr[x].length; y++) {
//                if (x % 2 == 0) {
//                    arr[x][y] = PositionType.EMPTY;
//                } else {
//                    arr[x][y] = PositionType.BORDER;
//                }
//            }
//
//        }
//
//        CreatePicture instance = new CreatePicture();
//        instance.paintPicture(new File("C:\\Users\\Public\\Pictures/lennis_test.png"), arr);
    }

    @Test
    public void test2() {
        MysqlConnect instance = new MysqlConnect();
        instance.connect();
        instance.otherStatements("use snake");
        VereinfachtesResultSet result = instance.issueSelectStatement("select x, y from positionschlange where id=? order by indexPos DESC;", 1);
        Queue<Position> queue = new LinkedList<Position>();
        while (result.next()) {
            queue.add(new Position(result.getInt("x"), result.getInt("y")));
        }
        instance.close();        
    }
}
