package packVariables;

public class A {
	
	int a1;//declaration
	int a=10;
	int x=100;//initialization
	static int b;
	int c=200;
	public void add(){
		//int c=900;//
		//static int dd=200;
		System.out.println(c+a+b);//900
	}
	public void mul(){
		System.out.println(a*x*c);
	}

	public static void main(String[] args) {
		A a=new A();
		a.add();
		a.mul();
	}
}
