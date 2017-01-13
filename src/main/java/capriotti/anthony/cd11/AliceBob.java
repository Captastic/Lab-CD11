package capriotti.anthony.cd11;

/**
 * Created by anthonycapriotti on 1/12/17.
 */
import java.util.Scanner;

public class AliceBob {
    public String aliceOrBob(String a) {
        if (a.equalsIgnoreCase("Alice")) {
            return "Alice";
        } else if (a.equalsIgnoreCase("Bob")) {
            return "Bob";
        } else {
            return "Ok";
        }
    }
}

