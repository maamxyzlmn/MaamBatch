package packVariables;

public class B {

	int a = 10;//non static or global or instance or concrete variable
	static int b = 20;//class or static variable

	public static void add() {
		//static int x=30;
		b=300;
		B bb = new B();
		System.out.println(bb.a + b);
	}

	public static void main(String[] args) {
		add();
	}

}
