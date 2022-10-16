import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// TODO: Auto-generated Javadoc
/**
 * La classe sommatore serve per fare
 * la somma tra due numeri.
 */
public class Sommatore {
	
	/**  Il primo numero. */
	int n1;
	
	/**  Il secondo numero. */
	int n2;
	
	/**
	 * Instantiates a new sommatore
	 * with n1 and n2 = 0.
	 */
	Sommatore() {
		n1 = 0;
		n2 = 0;
	}
	
	/**
	 * Instantiates a new sommatore.
	 *
	 * @param n1 il primo numero
	 * @param n2 il secondo numero
	 */
	Sommatore(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/**
	 * Sets the n1.
	 *
	 * @param n1 the new n1
	 */
	void setN1(int n1) {
		this.n1 = n1;
	}
	
	/**
	 * Gets the somma.
	 *
	 * @return the somma
	 */
	int getSomma() {
		return n1 + n2;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader fileReader = new BufferedReader(new FileReader(new File("numeri.txt")));
		int n1 = 0;
		int n2 = 0;
		int i = 0;
		
		for (Object s : fileReader.lines().toArray()) {
			if (i==0)
				n1 = Integer.parseInt((String)s);
			else 
				n2 = Integer.parseInt((String)s);
			
			i++;
		}		
		
		Sommatore s = new Sommatore(n1, n2);
		System.out.println(s.getSomma());
	}
}
