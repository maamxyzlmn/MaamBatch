package packInhe;

public class P {
	
	int a1=10;
	static int b1=20;
	public void m1(){
		C c=new C();
		System.out.println("this is P m1 method");
		System.out.println(a1+b1+c.c1);
	}

}
