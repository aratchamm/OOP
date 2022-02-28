package lab1;
public class Pro2_64010994 {
    public static void main(String[] args) {
        double x,y;
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        x = (e*d - b*f)/(a*d-b*c);
        y = (a*f - e*c)/(a*d-b*c);
        
        System.out.printf("x = %.2f", x);
        System.out.println("");
        System.out.printf("y = %.2f", y);
    }
}

