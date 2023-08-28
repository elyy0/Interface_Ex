package interface_abstraction;
import java.util.Scanner;
public class Circle implements area 
{
	double r;
	double pi=3.14;
	Scanner sc=new Scanner(System.in);
	public void radius()
	{
		System.out.println("Circle");
		System.out.println("Enter the Radius: ");
		r=sc.nextInt();
	}
	
	@Override
	public void area() 
	{
		System.out.println("The Area of Circle: "+(pi*r*r));
	}
}
