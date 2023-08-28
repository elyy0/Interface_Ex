package interface_abstraction;
import java.util.*;
public class Triangle implements area 
{
	int base,height;
	Scanner sc= new Scanner(System.in);
	public void triangle()
	{
		System.out.println("Triangle");
		System.out.println("Enther the Base and Height of Triangle: ");
		base=sc.nextInt();
		height=sc.nextInt();
	}
	@Override
	public void area()
	{
		System.out.println("Area of Triangle: "+(base*height)/2);
	}

}
