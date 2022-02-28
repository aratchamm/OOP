package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        String[] name = new String[3];

        System.out.printf("Enter the first city: ");
        name[0] = scan.nextLine();
        System.out.printf("Enter the second city: ");
        name[1] = scan.nextLine();
        System.out.printf("Enter the third city: ");
        name[2] = scan.nextLine();

        Arrays.sort(name);
        System.out.printf("The three cities in alphabetical order are " + name[0] + " " + name[1] + " " + name[2] );

    }
}
