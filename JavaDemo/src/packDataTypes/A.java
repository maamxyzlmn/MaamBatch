package packDataTypes;

public class A {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	String str;
	
	public void defaultValues(){
		System.out.println("Byte default value is :"+b);
		System.out.println("Short default value is :"+s);
		System.out.println("Int default value is :"+i);
		System.out.println("Long default value is :"+l);
		System.out.println("float default value is :"+f);
		System.out.println("double default value is :"+d);
		System.out.println("char default value is :"+c);
		System.out.println("boolean default value is :"+bool);
		System.out.println("String default value is :"+str);
	}
	public static void main(String[] args) {
		A a=new A();
		a.defaultValues();
	}

}
