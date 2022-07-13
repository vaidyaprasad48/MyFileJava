package inheritance;

public class Hierarchical //type4 4hie
{

	public static void main(String[] args) 
	{
		Mother1 m1=new Mother1();
		m1.Gold();
		
		child1 c1=new child1();
		c1.Kindness();
		c1.Gold();
		
		child2 c2=new child2();
		c2.cruelNess();
		c2.Gold();
		
		//for static
		//classname.methodname();
		Mother1.receipe();
		
		child1.Ball();
		child1.receipe();
		
		child2.Bat();
		child2.receipe();
		
	}

}
