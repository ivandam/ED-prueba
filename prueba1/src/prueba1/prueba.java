package prueba1;

public class prueba {

	public static void main(String[] args) {
	int a = -5;
	int b = 2;
	
	if (a < 0) {
		a = 8;
	}
	
	int c = a + b;
	 
	System.out.println(c);
	
	String n = "pepe";
	
	for	(int i = 0; i < n.length(); i++) {
		System.out.print(n.charAt(i) + "  ");
	 }
	System.out.println("");
	String p = "*";
	System.out.println(p);
	for (int i = 0; i < 10; i++) {
		p+="*";
		System.out.println(p);
	}
	
	}

}
