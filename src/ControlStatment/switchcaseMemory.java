package ControlStatment;

public class switchcaseMemory {

	public static void main(String[] args) 
	{
		//1---it is memory size for byte
		//2---it is memory size for short
		//4--it is memory size for integer
		//8---it is memory size for long
		
		int memory=3;
		switch (memory) {
		case 1:System.out.println("memory size for byte");
			break;
		case 2:System.out.println("memory size for short");
			break;
		case 4:System.out.println("memory size for integer");
			break;
		case 8:System.out.println("memory size for long");
			break;

		default:System.out.println("enter valid memory no.");
			break;
		}

	}

}
