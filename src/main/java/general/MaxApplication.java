package general;

/** 
 * 
 * Clase de ejemplo para el curso de automatización
 * 
 * @author fede
 * @version 1.0
 *
 */
public class MaxApplication {
	
	/** 
	 * Método inicial de la aplicación MaxApplication
	 * 
	 *  @param args es el array de parámetros pasados al programa
	 *  @return retorna vacío
	 */
	public static void main (String args[])
	{
		if (args.length != 2)
			System.out.println("Parámetros inválidos");
		else{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if (a > b)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(b);				
			}
		}
	}
}
