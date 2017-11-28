package packStringExm;

public class A {

	
	String name1="xyz";
	
	String name2=new String("Hello");
	String myName="vijay";
	
	//StringBuffer name3="dfjdlkj";
	StringBuffer name4=new StringBuffer("Hello"); 
	
	
	public void m(){
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(myName);
		System.out.println(myName.concat(" pakala"));
		System.out.println(myName);
		System.out.println(name4);
		System.out.println(name4.append(" vijay"));
		System.out.println(name4);
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.m();
	}
}
