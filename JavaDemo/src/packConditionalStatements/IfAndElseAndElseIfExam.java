package packConditionalStatements;

public class IfAndElseAndElseIfExam {
	
	
	String city="Mumbai";
	
	public void whereIsHe(){
		if(city=="Mangalore"){
			System.out.println("He is in Mangalore");
		}
		else if(city=="Bangalore"){
			System.out.println("He is in Bangalore");
		}
		else if(city=="Pune"){
			System.out.println("He is in Pune");
		}
		else{
			System.out.println("He is in out off station");
		}
	}
	
	
	public static void main(String[] args) {
		IfAndElseAndElseIfExam a=new IfAndElseAndElseIfExam();
		a.whereIsHe();
	}

}
