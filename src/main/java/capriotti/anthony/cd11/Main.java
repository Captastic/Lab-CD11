package capriotti.anthony.cd11;

/**
 * Created by anthonycapriotti on 1/13/17.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AliceBob a = new AliceBob();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = input.next();
        System.out.println(a.aliceOrBob(n));
    }
}
