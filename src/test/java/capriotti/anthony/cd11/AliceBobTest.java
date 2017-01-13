package capriotti.anthony.cd11;

/**
 * Created by anthonycapriotti on 1/13/17.
 */
import static  org.junit.Assert.*;
import capriotti.anthony.cd11.AliceBob;
import org.junit.Before;
import org.junit.Test;

public class AliceBobTest {
    AliceBob thing= new AliceBob();

    @Test
    public void aliceTest() {
        String expected = "Alice";
        String actual = thing.aliceOrBob("alice");
        assertEquals("Alice should retrun", expected, actual);
    }

    @Test
    public void bobTest(){
        String expected = "Bob";
        String actual = thing.aliceOrBob("Bob");
        assertEquals("Bob should return", expected, actual);
    }

    @Test
    public void otherTest(){
        String expected = "Ok";
        String actual = thing.aliceOrBob("Ok");
        assertEquals("Ok should return", expected, actual);
    }

}
