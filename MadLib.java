import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String madlib = "phone was feeling very banana one day so they grabbed their favorite orange 
            and started berry. Eventually, they ended up in grape!";

        System.out.println(madlib);

        System.out.print("Enter name:           (phone)");
        String name = input.nextLine();
        String replacement1 = name.replace("phone", name);

        System.out.print("Enter an adjective:    (banana)");
        String adjective = input.nextLine();

        System.out.print("Enter a noun:          (orange)");
        String noun = input.nextLine();

        System.out.print("Enter a verb ending in -ing:       (berry)");
        String verb = input.nextLine();

        System.out.print("Enter a place:         (grape)");
        String place = input.nextLine();

        
    }

}
