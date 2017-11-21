package packLoopsExam;

public class ForLoopExam {
	
	String city="Bangalore";
	public void printNum(){
		for(int i=0; i<=100;i++){
			
			if(city=="Bangalore"){
				System.out.print(i+ "   ---->");
				System.out.println("Hello  :"+city);
			}
			//System.out.println("print numeric nums :"+i);
		}
	}

	public static void main(String[] args) {
		ForLoopExam f=new ForLoopExam();
		f.printNum();
	}
	
}
