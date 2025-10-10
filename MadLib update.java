import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String madlib = "straw was feeling very banana one day so they grabbed their favorite orange and started berry. Eventually, they ended up in grape!";

        System.out.print("Enter name:        (straw): ");
        String name = input.nextLine();

        System.out.print("Enter an adjective:    (banana): ");
        String adjective = input.nextLine();

        System.out.print("Enter a noun:         (orange): ");
        String noun = input.nextLine();

        System.out.print("Enter a verb ending in -ing:     (berry): ");
        String verb = input.nextLine();

        System.out.print("Enter a place (say a first though):     (grape): ");
        String place = input.nextLine();

        input.close(); 

        int strawIndex = madlib.indexOf("straw");
        int bananaIndex = madlib.indexOf("banana");
        int orangeIndex = madlib.indexOf("orange");
        int berryIndex = madlib.indexOf("berry");
        int grapeIndex = madlib.indexOf("grape");


        String part1 = madlib.substring(0, strawIndex);
        String part2 = madlib.substring(strawIndex + "strawberry".length(), bananaIndex);
        String part3 = madlib.substring(bananaIndex + "banana".length(), orangeIndex);
        String part4 = madlib.substring(orangeIndex + "orange".length(), berryIndex);
        String part5 = madlib.substring(berryIndex + "berry".length(), grapeIndex);
        String part6 = madlib.substring(grapeIndex + "grape".length());

        String finalMadLib = part1 + name + part2 + adjective + part3 + noun + part4 + verb + part5 + place + part6;
        System.out.println(finalMadLib);
    }
}


