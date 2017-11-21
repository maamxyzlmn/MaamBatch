package packConditionalStatements;

public class WhileCondExam {

	int a = 100;
	int b=20;
	public void m() {
		
		while (a>b) {
			System.out.println("Hello While....");
			break;
		}
	}
	
	public void mm(){
		do{
			System.out.println("Hello do-while....");
		}while(a>b);
	}

	public static void main(String[] args) {
		WhileCondExam w = new WhileCondExam();
		//w.m();
		w.mm();
	}
}
