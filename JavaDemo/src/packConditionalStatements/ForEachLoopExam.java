package packConditionalStatements;

public class ForEachLoopExam {
	
	int a=10;
	//String cities="Bangalore, Pune, Mumbai, Hyderabad";
	//DataType[] arrayObject=new DataType[size];
	//String[] cities=new String[5];//any kind of array default value is null
	//above one is declaration array.
	
	String[] cities={"Bangalore","Pune","Mumbai","Hyderabad"};//initialization array
	public void m(){
		//System.out.println(cities);
		/*for(int i=0;i<cities.length-2;i++){
			System.out.println(cities[i]);
		}*/
		//System.out.println(cities[2]);
		//Syntax for foreach----->for(DataType variable:array or collection){}
		for(String s:cities){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ForEachLoopExam f=new ForEachLoopExam();
		f.m();
	}

}
