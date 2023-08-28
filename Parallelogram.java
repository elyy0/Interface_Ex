package interface_abstraction;
import java.util.*;
public class Parallelogram implements area
{
	int base,height;
	Scanner sc=new Scanner(System.in);
	public void para()
	{
		System.out.println("Parallelogram");
		System.out.println("Enter the Base and Height: ");
		base=sc.nextInt();
		height=sc.nextInt();
	}
	@Override
	public void area()
	{
		System.out.println("Area of Parallelogram: "+base*height);
	}

}
