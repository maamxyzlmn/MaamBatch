package packConditionalStatements;

public class Loop {
	 String str="song";
	public static void Looping(){
		for(int i=0;i<=10;i++){
			Loop l1=new Loop();
			if(l1.str=="song"){
				System.out.println(i+"----------->");
				System.out.println("sing a song;"+l1.str);
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Looping();

	}

}
