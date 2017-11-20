package packVariables;

public class FinalVExm {
	
	final int a=10;//final variable is constant variable
	//final int c; as final can't define  as a declaration
	int b=20;
	public void add(){
	//	a=200;
		int a=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		FinalVExm f=new FinalVExm();
		f.add();
	}

}
