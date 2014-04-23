package general;

public class SampleStaticRoutines {

	/**
	 * Método que calcula al máximo entre dos enteros
	 * 
	 * @param a
	 *            valor entero 1
	 * @param b
	 *            valor entero 2
	 * @return el máximo de los dos
	 */
	public static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static int max2(String aS, String bS) {

		int a = Integer.parseInt(aS);
		int b = Integer.parseInt(bS);
		
		return (max(a,b));
	}

}
