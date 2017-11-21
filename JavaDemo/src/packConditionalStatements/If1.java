package packConditionalStatements;

public class If1 {
	String city = "Bangalore";

	public void m1() {
		System.out.println("hello bangalore");
	}

	public void method() {
		if (city == "Bangalore") {
			System.out.println("SUBBU");
			m1();
		}

		else {
			System.out.println("no out put");
			m1();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
If1 i=new If1();
i.method();
	}

}
