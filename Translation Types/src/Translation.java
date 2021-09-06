import java.util.Scanner;

public class Translation {
//	private int x1,y1;
	private String axis;
	
	public void reflection()
	{		
		int x1,y1,x2,y2;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the axis of Reflection (X/Y) : ");
			axis = sc.nextLine();
			System.out.print("\nEnter the X-Coordinate : ");
			x1 = sc.nextInt();
			System.out.print("\nEnter the Y-Coordinate : ");
			y1 = sc.nextInt();
			System.out.println("Coordinates Before Reflection  : ("+x1+","+y1+") ");
			if(axis.equalsIgnoreCase("x"))
			{
				x2 = x1;
				y2 = (-1*y1);
				System.out.println("Coordinates After  Reflection  : ("+x2+","+y2+") ");
			}
			else
			{
				x2 = (-1*x1);
				y2 = y1;
				System.out.println("Coordinates After  Reflection  : ("+x2+","+y2+") ");
			}
	}

	
	public void translation()
	{
		int x1,y1,x2,y2,tx,ty;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the X-Coordinate : ");
		x1 = sc.nextInt();
		System.out.print("\nEnter the Y-Coordinate : ");
		y1 = sc.nextInt();
		System.out.print("\nEnter the Translation Vector for X-Coordinate : ");
		tx = sc.nextInt();
		System.out.print("\nEnter the Translation Vector for Y-Coordinate : ");
		ty = sc.nextInt();
		System.out.println("\nInitial Coordinates are  : ("+x1+","+y1+") ");
		System.out.println("\nGiven Translation vector (tx,ty)   : ("+tx+","+ty+") ");
		x2 = x1+tx;
		y2 = y1+ty;
		System.out.println("\nNew Coordinates After Translation are  : ("+x2+","+y2+") ");

	}
	
	
	public void add() {
		
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the X1-Coordinate : ");
		x1 = sc.nextInt();
		System.out.print("\nEnter the Y1-Coordinate : ");
		y1 = sc.nextInt();
		
		System.out.print("\nEnter the X2-Coordinate : ");
		x2 = sc.nextInt();
		System.out.print("\nEnter the Y2-Coordinate : ");
		y2 = sc.nextInt();
		System.out.println("\nInitial Coordinates are  : ("+x1+","+y1+")  , ("+x2+","+y2+")");
		System.out.println("\nCoordinates after addition are  : ("+(x1+x2)+","+(y1+y2)+") ");
		
		
	}
	
	public void distance() {
		
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the X1-Coordinate : ");
		x1 = sc.nextInt();
		System.out.print("\nEnter the Y1-Coordinate : ");
		y1 = sc.nextInt();
		
		System.out.print("\nEnter the X2-Coordinate : ");
		x2 = sc.nextInt();
		System.out.print("\nEnter the Y2-Coordinate : ");
		y2 = sc.nextInt();
		
		double distance =	Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) * 1.0);
		
		 
		System.out.println("distance is :  "+distance);
		
	}
	
	public void quadrant() {
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the X1-Coordinate : ");
		x = sc.nextInt();
		System.out.print("\nEnter the Y1-Coordinate : ");
		y = sc.nextInt();
		
		
		if (x > 0 && y > 0)
            System.out.println("lies in First quadrant");
 
        else if (x < 0 && y > 0)
            System.out.println("lies in Second quadrant");
 
        else if (x < 0 && y < 0)
            System.out.println("lies in Third quadrant");
 
        else if (x > 0 && y < 0)
            System.out.println("lies in Fourth quadrant");
 
        else if (x == 0 && y > 0)
            System.out.println("lies at positive y axis");
 
        else if (x == 0 && y < 0)
            System.out.println("lies at negative y axis");
 
        else if (y == 0 && x < 0)
            System.out.println("lies at negative x axis");
 
        else if (y == 0 && x > 0)
            System.out.println("lies at positive x axis");
 
        else
            System.out.println("lies at origin");
 
		
	}
	
	public static void main(String[] args) {
		
		
		Translation t = new Translation();
		t.reflection();
		t.translation();
		t.add();
		t.distance();
		t.quadrant();

	}

}
