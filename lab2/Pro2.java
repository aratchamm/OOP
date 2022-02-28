package lab2;
import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);
        int rand = (int)(Math.random()*3);

        String[]randName = {"scissor","rock","paper"};

        System.out.printf("scissor (0), rock (1), paper (2): ");
        int me    =  scan.nextInt();

        System.out.printf("The computer is " + randName[rand] + "." + " You are " + randName[me]);
        if(me == 0) {
            if (rand == 0)System.out.printf(" too." + " It is a draw");
            else if(rand == 2)System.out.printf("." + " You won");
            else if(rand == 1)System.out.printf("." + " You lose");
        }
        else if(me == 1) {
            if (rand == 1)System.out.printf(" too." + " It is a draw");
            else if(rand == 0)System.out.printf("." + " You won");
            else if(rand == 2)System.out.printf("." + " You lose");
        }
        else if(me == 2) {
            if (rand == 2)System.out.printf(" too." + " It is a draw");
            else if(rand == 1)System.out.printf("." + " You won");
            else if(rand == 0)System.out.printf("." + " You lose");
        }
    }
}
