package general;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SampleStaticRoutines2 {

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
		Integer[] aux = new Integer[2];
		aux[0] = a;
		aux[1] = b;
		return largest(aux);
	}
	
	/**
	 * Método que devuelve el mayor valor de una lista de enteros
	 * 
	 * @param list la lista de enteros de la cual se quiere obtener el mayor
	 * @return el mayor valor de la lista
	 */
	public static int largest(Integer[] list)
	{
		List<Integer> aux = Arrays.asList(list);
		return Collections.max(aux);
	}
}
