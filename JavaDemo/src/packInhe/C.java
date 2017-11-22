package packInhe;

public class C extends P{
	
	int c1=300;
	
	public void mm1(){
		System.out.println(a1+b1);
		m1();
		
	}
	public static void mm2(){
		C cc=new C();
		P p=new P();
		
		System.out.println(cc.a1+b1+cc.c1);
		System.out.println(p.a1+b1+cc.c1);
		p.m1();
	}

}
