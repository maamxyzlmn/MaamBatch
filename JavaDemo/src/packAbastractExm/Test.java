package packAbastractExm;

public class Test extends A {

	public void m2() {

	}

	public void m3() {

	}

	public static void main(String[] args) {
		//A a = new A();
		A aa=new Test();
		aa.m1();
		aa.m2();
		Test t=new Test();
		t.m1();
		t.m2();
		t.m3();
	}

}
