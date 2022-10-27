
public class Calcolatrice {

	public static int pow(int b, int e) {
		return (int) Math.pow(b, e);
	}
	
	public static int pow2(int b, int e) {
		return (int) Math.pow(b, e);
	}
	
	public static int pow3(int b, int e) {
		int oldB = b;
		for (int i=0; i<e-1; i++) {
			b = b*oldB;
		}
		if (e != 0)
			return b;
		else 
			return 1;
	}
	
}
