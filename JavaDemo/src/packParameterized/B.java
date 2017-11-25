package packParameterized;

public class B extends A{

	public void parameterizedMethod(int a, int b,int c, int d){
		System.out.println(a+b+c+d);
	}
	
	public void bikeDesign(int cc){
		if(cc>=100){
		System.out.println("child design  :"+cc);
		}
		else{
			A aa=new A();
			aa.bikeDesign(cc);
		}
	}
	
	
	public static void main(String[] args) {
		B b=new B();
		b.bikeDesign(99);
	}
}
