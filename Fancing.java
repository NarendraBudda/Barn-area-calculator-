import java.util.Scanner;
class Fancing {
	public static void main(String[] input){
		int side;
		int radius;
		int length;
		int width;
		String need;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter square side value");
		side = sc.nextInt();
		System.out.println("enter circle radius");
		radius = sc.nextInt();
		System.out.println("enter rectangle length");
		length = sc.nextInt();
		System.out.println("enter rectangle width");
		width = sc.nextInt();
		System.out.println("enter which area needed");
		need = sc.next();
		switch(need){
			case "square": int squarearea=(side*side);
			System.out.println("square area = "+squarearea);
			break;
			case "circle": double circlearea=((radius*radius)*3.14);
			System.out.println("circle area = "+circlearea);
			break;
			case "rectangle": int rectanglearea=(length*width);
			System.out.println("rectangle area = "+rectanglearea);
			break;
			default: System.out.println("wrong command given");
		}

		}	
}	
