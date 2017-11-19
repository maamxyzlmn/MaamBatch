package pack4;

public class Methods {
	public void add() {
		System.out.println("i am non static method");
	}

	public void sub() {
		System.out.println("i am also non  static method");
	}

	public static void mul() {
		System.out.println("i am static method");

	}

	public static void addi() {
		System.out.println("i like addi car");
		mul();
		Methods m1 = new Methods();
		m1.add();
		m1.sub();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addi();
	}

}
