import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String madlib = "(strawberry) was feeling very (banana) one day so they grabbed their favorite (orange) " +
                        "and started (berry). Eventually, they ended up in grape!";

        System.out.print("Enter name:           (strawberry): ");
        String name = input.nextLine();

        System.out.print("Enter an adjective:    (banana): ");
        String adjective = input.nextLine();

        System.out.print("Enter a noun:          (orange): ");
        String noun = input.nextLine();

        System.out.print("Enter a verb ending in -ing:       (berry): ");
        String verb = input.nextLine();

        System.out.print("Enter a place (say a first though):         (grape): ");
        String place = input.nextLine();

        int phoneIndex = madlib.indexOf("phone");
        int bananaIndex = madlib.indexOf("banana");
        int orangeIndex = madlib.indexOf("orange");
        int berryIndex = madlib.indexOf("berry");
        int grapeIndex = madlib.indexOf("grape");

        String part1 = madlib.substring(0, phoneIndex);
        String part2 = madlib.substring(phoneIndex + "phone".length(), bananaIndex);

        String finalMadLib = part1 + name + part2;
        System.out.println(finalMadLib);


    }
}
