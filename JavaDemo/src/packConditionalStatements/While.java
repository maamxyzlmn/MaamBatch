package packConditionalStatements;

public class While {
	int i=98;
	static int a=100;
	public void m(){
		while(i<a){
			System.out.println("its true value");
			break;
		}
	}
	public void m1(){
		while(a>i){
			System.out.println("i am true");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While w1 =new While();
		w1.m();
		w1.m1();

	}

}
