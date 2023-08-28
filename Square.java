package interface_abstraction;
import java.util.*;
public class Square implements area 
{
	int side;
	Scanner sc=new Scanner(System.in);
	public void sides()
	{
		System.out.println("Square");
		System.out.println("Enter the Sides: ");
		side=sc.nextInt();
	}
	@Override
	public void area()
	{
		System.out.println("Area of Square: "+(side*side));
	}

}
