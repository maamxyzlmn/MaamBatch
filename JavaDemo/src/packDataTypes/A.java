package packDataTypes;

public class A {
	
	byte b;
	
	public void defaultValues(){
		System.out.println("Byte default value is :"+b);
	}
	public static void main(String[] args) {
		A a=new A();
		a.defaultValues();
	}

}
