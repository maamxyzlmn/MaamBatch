package packParameterized;

public class A {
	
	public void parameterlessMethod(){
		System.out.println(1+5);
	}
	public void parameterizedMethod(int a, int b){
		System.out.println(a+b);
	}
	void parameterizedMethod(double a, double b){
		System.out.println(a+b);
	}
	public void parameterizedMethod(int a, int b,int c){
		System.out.println(a+b+c);
	}
	
	public void bikeDesign(int cc){
		System.out.println("parent design  :"+cc);
	}
	public static void main(String[] args) {
		A a=new A();
		a.parameterizedMethod(11, 22);
		a.parameterizedMethod(33, 43);
		a.parameterizedMethod(0.2, 0.3);
		a.parameterizedMethod(11, 22, 33);
		a.bikeDesign(50);
	}

}
