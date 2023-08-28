package interface_abstraction;
public class process {
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		Triangle t=new Triangle();
		Square s=new Square();
		Rectangle rec=new Rectangle();
		Parallelogram p=new Parallelogram();
		c.radius();
		c.area();
		t.triangle();
		t.area();
		s.sides();
		s.area();
		rec.react();
		rec.area();
		p.para();
		p.area();
	}

}
