import org.junit.Test;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by paluro on 3/27/17.
 */

public class NextEntityAlgorithmTest {

    //create entity objects:
    @Test
    public void testNextEntityAlgorithm() {

        Date date1 = new Date(10);
        Entity entity1 = new Entity("A", "B", date1, Entity.BeverageType.BEER, "1");//Entity 1

        Date date2 = new Date(9);
        Entity entity2 = new Entity("C", "A", date2, Entity.BeverageType.WINE, "2");//Entity 2

        Date date3 = new Date(8);
        Entity entity3 = new Entity("D", "E", date3, Entity.BeverageType.WINE, "3");//Entity 3

        Date date4 = new Date(7);
        Entity entity4 = new Entity("B", "A", date4, Entity.BeverageType.DISTILLED, "4");//Entity 4

        Date date5 = new Date(6);
        Entity entity5 = new Entity("a", "b", date5, Entity.BeverageType.WINE, "5");// Entity 5

        Date date6 = new Date(5);
        Entity entity6 = new Entity("F", "G", date6, Entity.BeverageType.WINE, "6");// Entity 6

        Date date7 = new Date(4);
        Entity entity7 = new Entity("F", "G", date7, Entity.BeverageType.BEER, "7");// Entity 7

        Date date8 = new Date(3);
        Entity entity8 = new Entity("F", "G", date8, Entity.BeverageType.DISTILLED, "8");// Entity 8

        Date date9 = new Date(2);
        Entity entity9 = new Entity("F", "G", date9, Entity.BeverageType.BEER, "9");// Entity 9

        Date date10 = new Date(1);
        Entity entity10 = new Entity("F", "G", date10, Entity.BeverageType.WINE, "10");// Entity 10

        List<Entity> entities = new LinkedList<>();
        entities.add(entity1);
        entities.add(entity2);
        entities.add(entity3);
        entities.add(entity4);
        entities.add(entity5);
        entities.add(entity6);
        entities.add(entity7);
        entities.add(entity8);
        entities.add(entity9);
        entities.add(entity10);

        //expected output of NextEntityAlgorithm
        List<Entity> ordered = new LinkedList<>();
        ordered.add(entity10);
        ordered.add(entity9);
        ordered.add(entity8);
        ordered.add(entity7);
        ordered.add(entity6);
        ordered.add(entity5);
        ordered.add(entity4);
        ordered.add(entity3);
        ordered.add(entity2);
        ordered.add(entity1);



        NextEntityAlgorithm nextEnt = new NextEntityAlgorithm(entities);

        assertEquals(nextEnt.runAlgorithm(Entity.BeverageType.BEER), ordered);
    }

}
