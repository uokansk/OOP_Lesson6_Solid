package solid.srp.models;

import java.util.Scanner;

public class Utils extends Input {
    public static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
