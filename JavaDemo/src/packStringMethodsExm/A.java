package packStringMethodsExm;

public class A {
	
	String str="Hello Java";
	String str1=" where are you?";
	String str2=" ";
	String city="Bangalore";
	String str3="  Hello";
	
	String str4=str.substring(0, 5);
	String str5=str.substring(6);
	String str6=str4+str5;
	String str7=str.substring(5).trim();
	String tId="MyTrasactionId#1234S";
	
	public void stringMethodsDetails(){
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.concat(str1));
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str.charAt(3));
		System.out.println(city.equals("bangalore"));
		System.out.println(city.equalsIgnoreCase("Bangalore"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 5));
		System.out.println(str3);
		System.out.println(str3.trim());
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		String[] values=tId.split("#");
		/*for(String s:values){
			System.out.println(s);
		}*/
		String id=values[1];
		System.out.println(id);
		
	}
	
	public static void main(String[] args) {
	A a=new A();
	a.stringMethodsDetails();
	}

}
