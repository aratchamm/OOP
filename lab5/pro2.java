package lab5;

public class pro2 {
    public static void main(String[] args) {
        
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Regular Polygon Object 1, Perimeter = " + regularPolygon1.getPerimeter() + ", Area = " + regularPolygon1.getArea());
        System.out.println("Regular Polygon Object 2, Perimeter = " + regularPolygon2.getPerimeter() + ", Area = " + regularPolygon2.getArea());
        System.out.println("Regular Polygon Object 3, Perimeter = " + regularPolygon3.getPerimeter() + ", Area = " + regularPolygon3.getArea());
	}
}
