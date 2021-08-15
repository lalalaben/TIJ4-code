

class Class1 {
	String str;
}

class Class2 {
 	String str = "Class2"; 
}
class Class3 {
  	String str;
	Class3(String i) {
  		str = i;
	}
}
public class StringClass {
  public static void main(String[] args) {
    	Class1 a = new Class1();
   	Class2 b1 = new Class2();
   	Class2 b2 = new Class2();
    	Class3 c = new Class3("Class3");
	
	System.out.println(a.str);
	System.out.println(b1.str);
	System.out.println(b2.str);
	System.out.println(c.str);

  }
} 
