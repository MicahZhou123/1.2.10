import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verb = input.nextLine();

        System.out.print("Enter a place: ");
        String place = input.nextLine();

        System.out.println(name + " was feeling very " + adjective + " one day.");
        System.out.println("So they grabbed their favorite " + noun + " and started " + verb + ".");
        System.out.println("Eventually, they ended up in " + place + "!");

    }
}