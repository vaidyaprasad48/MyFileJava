package StringClassStudy;

public class StringUse1 {

	public static void main(String[] args) 
	{
		String name= "Velocity";//without using new keywords i.e string s1="abc"	
		String city= new String("Pune");//using newkeywords i.e string s2=new string("XYZ")
		
		//length() method use
		System.out.println(name.length());//name is object
		System.out.println(city.length());
		int output = name.length();//name.length =output
		System.out.println("length of string is "+ output);
		int output1 = city.length();
		System.out.println("length of string is "+ output1);//output la reference variable mantat
		                                                     //we can refuse reference variable
		System.out.println("*********************************");
		
		//touppercase() method use
		
		String a="velocity";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		String b=a.toUpperCase();
		System.out.println(b);
		System.out.println(b.toLowerCase());
		String c=b.toLowerCase();
		System.out.println(c);
		
		System.out.println("*********************************");
		
		//4 equals() method
		
		String a1="Velocity";
		String a2="Velocity";
		String a3=new String("Velocity");
		String a4=new String("Velocity");
		String a5=new String("velocity");
				
		//==will contain memory location will not contain compare
		System.out.println(a1==a2);
		System.out.println(a3==a4);
		System.out.println(a1==a3);
		System.out.println(a2==a3);
		System.out.println(a2==a1);
		
		//equal will compare contain of string
		System.out.println("+++++++++++++++++");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a4));
		System.out.println(a2.equals(a1));
		System.out.println(a4.equals(a3));
		
		System.out.println("++++++++++++++++++++++++++");
		System.out.println(a1.equals(a5));
		System.out.println(a1.equalsIgnoreCase(a5));
		
		//6 contains() method
		System.out.println("++++++++++++++++++++++++++");
		
		String b1="Velocity";
		System.out.println(b1.contains("lo"));
		boolean result=b1.contains("lo");
		System.out.println("result is "+ result);
		System.out.println(b1.contains("city"));
		boolean test=b1.contains("city");
		System.out.println("test is "+ test);
		System.out.println(b1.contains("ec"));
		System.out.println(b1.contains("v"));
		
		//7 isEmpty() method used
		System.out.println("++++++++++++++++++");
		
		String m="Pune";
		String n="";
		String l=" ";
		//String o=null;
		System.out.println(m.length());
		System.out.println(n.length());
		System.out.println(l.length());
		//System.out.println(o.length());
		
		System.out.println(m.isEmpty());
		System.out.println(n.isEmpty());
		System.out.println(l.isEmpty());
		//System.out.println(o.isEmpty());
		
		System.out.println(m.isBlank());
		System.out.println(n.isBlank());
		System.out.println(l.isBlank());
		//System.out.println(o.isBlank());
		System.out.println("+++++++++++++++++++++++++++");
		
		//charAt() use method
		
		String p="INDIA";
		System.out.println(p.charAt(4));
		System.out.println(p.charAt(0));
		//char requriedchar=p.charAt(2);
		//System.out.println(requiredchar);
	System.out.println(p.charAt(-1));
	//	System.out.println(p.charAt(9));
		System.out.println("+++++++++++++++++++++++++++");
		
		//endwith() method use
		
		String e="Velocity";
		System.out.println(e.endsWith("ty"));
		System.out.println(e.endsWith("City"));
		System.out.println(e.endsWith("city"));
		System.out.println(e.endsWith("my"));
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println(e.startsWith("Ve"));
		System.out.println(e.startsWith("ve"));
		System.out.println(e.startsWith("loc"));
		System.out.println(e.startsWith("loc", 0));
		System.out.println(e.startsWith("loc", 2));
		System.out.println(e.startsWith("ty", 6));
		System.out.println("+++++++++++++++++++++++++++");
		
		//substring() method
		
		String test2="Maharashi Vidya Mandir";
		System.out.println(test2.substring(16));
		String mystring=test2.substring(16);
		System.out.println(mystring);
		System.out.println(test2.substring(0));
	
		System.out.println(test2.substring(0,10));
		System.out.println("++++++++++++++++++=++");
		
		//concat method used
		String x="Pune";
		String y="City";
		System.out.println(x.concat(y));
		System.out.println(x.concat(" ").concat(y));
		System.out.println("++++++++++++++++++++++++");
		
		//IndexOf() method used
		String h="INDIAINDISI";
		System.out.println(h.indexOf('I'));
		System.out.println(h.indexOf('D'));
		System.out.println(h.indexOf('I',7 ));
		System.out.println(h.lastIndexOf('I'));
		
		System.out.println("++++++++++++++++++");
		
		//replace method used
		
		String j="Automation Testing";
		System.out.println(j.replace('u', 'a'));
		System.out.println(j.replace("ti", " "));
		
		
				
	
		
		
		
		
		
		
	}

}
