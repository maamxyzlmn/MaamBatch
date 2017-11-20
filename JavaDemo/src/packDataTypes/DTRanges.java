package packDataTypes;

public class DTRanges {

	byte bMax = Byte.MAX_VALUE;
	byte bMin = Byte.MIN_VALUE;
	short sMax = Short.MAX_VALUE;
	short sMin = Short.MIN_VALUE;
	int iMax = Integer.MAX_VALUE;
	int iMin = Integer.MIN_VALUE;
	long lMax = Long.MAX_VALUE;
	long lMin = Long.MIN_VALUE;

	public void dataTypesRanges() {
		System.out.println("Byte max value is :" + bMax);
		System.out.println("Byte min value is :" + bMin);
		System.out.println("Short max value is :" + sMax);
		System.out.println("Short min value is :" + sMin);
		System.out.println("int max value is :" + iMax);
		System.out.println("int min value is :" + iMin);
		System.out.println("long max value is :" + lMax);
		System.out.println("long min value is :" + lMin);
	}

	public static void main(String[] args) {
		DTRanges d = new DTRanges();
		d.dataTypesRanges();
	}

}
