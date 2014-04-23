package cobertura;

public class CajaBlanca {
	
	/**
	 * Método que nos responde si un año es bisiesto o no
	 * @param anio el año que queremos evaluar
	 * @return true si el año es bisiesto y false si no lo es
	 */
	public static boolean bisiesto (int anio)
	{
		boolean b = false;
		if ((anio % 4 == 0) && (anio % 100 != 0))
		{
			b = true;
		}
		return b;
	}
	
	public static boolean capicua (char[] list)
	{
		int index = 0;
		int l = list.length;
		while (index < (l - 1)) {
			if (list[index] != list[l - index - 1 ]) 
			{
				return false;
			}
			index++;
		}
		return true;
	}
	
	public static int mcd(int a, int b)
	{
		while (b != 0)
		{
			if (a > b)
			{
				a = a - b;				
			}
			else
			{
				b = b - a;
			}
		}
		return a;
	}

}
