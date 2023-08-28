package interface_abstraction;
import java.util.*;
public class Rectangle implements area
{
	int lenght,width;
	Scanner sc=new Scanner(System.in);
	public void react()
	{
		System.out.println("Rectangle");
		System.out.println("Enter the Lenght and width:");
		lenght=sc.nextInt();
		width=sc.nextInt();
	}
	@Override
	public void area()
	{
		System.out.println("Area of Rectangle: "+(lenght*width));
	}

}
