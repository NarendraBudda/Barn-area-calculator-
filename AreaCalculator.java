import java.util.Scanner;
public class AreaCalculator{
	public static void main(String args[]){
		AreaCalculator obj = new AreaCalculator();
		double areaofsquare= obj.calculateAreaofSquare();
		double areaofrectangel= obj.calculateAreaofRectangle();
		double areaofcircle= obj.calculateAreaofcircle();
		System.out.println("square area "+areaofsquare);
		System.out.println("rectanfle area "+areaofrectangel);
		System.out.println("circle area "+areaofcircle);
		
	}
	 public  double calculateAreaofSquare()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter side value of square");
		 int side = sc.nextInt();
	     double squarearea=(side*side);
	     return squarearea;
	 }
	 public double calculateAreaofRectangle()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter length of Rectangle");
		 int length = sc.nextInt();
		 System.out.println("enter width of Rectangle");
		 int width = sc.nextInt();
	     double rectanglearea=(length*width);
	     return rectanglearea;
	}
	public double calculateAreaofcircle()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius of Circle");
		int radius = sc.nextInt();
	    double circlearea=(3.14*radius*radius);
	    return circlearea;
	}
}
