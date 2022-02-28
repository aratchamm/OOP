package lab1;
public class Pro1_64010994 {
    public static void main(String[] args) {
        int now = 312032486;
        double birth = (60.0/7)* 60 * 24 * 365;
        double im = (60.0/45)* 60 * 24 * 365;
        double death = (60.0/13)* 60 * 24 * 365;

        int sumBirth = (int) birth;
        int sumIm = (int) im;
        int sumDeath = (int) death;
    
        System.out.printf("the population for each of the next one year is ");
        System.out.println(now + sumIm + sumBirth - sumDeath);

        System.out.printf("the population for each of the next two years is ");
        System.out.println(now + ((sumIm + sumBirth - sumDeath) * 2));

        System.out.printf("the population for each of the next three years is ");
        System.out.println(now + ((sumIm + sumBirth - sumDeath) * 3));

        System.out.printf("the population for each of the next four years is ");
        System.out.println(now + ((sumIm + sumBirth - sumDeath) * 4));

        System.out.printf("the population for each of the next five years is ");
        System.out.println(now + ((sumIm + sumBirth - sumDeath) * 5));
    }
}

