package packLoopsExam;

public class Looping {
	String s = "ravana";

	public void looping() {
		for (int i = 0; i <= 10; i++) {

			if (s == "ravana") {
				System.out.println(i+ "------------>");
				System.out.println("hello:" + s);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping l1 = new Looping();
		l1.looping();

	}

}
