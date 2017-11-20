package packConditionalStatements;

public class SwitchCondtionExam {

	String city = "Pune";
	public void m(){
		System.out.println("Hello vijay...");
	}

	public void whereIsHe() {
		switch (city) {

		case "Bangalore":
			System.out.println("He is in Bangalore");
			m();
			break;
		case "Mangalore":
			System.out.println("He is in Mangalore");
			m();
			break;
		case "Pune":
			System.out.println("He is in Pune");
			m();
			break;
		default:
			System.out.println("He is in out off station");
			break;

		}
	}

	public static void main(String[] args) {
		SwitchCondtionExam s = new SwitchCondtionExam();
		s.whereIsHe();
	}
}
