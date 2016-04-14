package ordenarDescendente;

import java.util.Scanner;

public class OrdenarDescendente
{
	
	public static void main(String[] args)
	{
		int[] numeros = new int[8];
		int aux;
		Scanner sc = new Scanner(System.in);
		boolean ordenado = false;
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.print("Introduce número: ");
			numeros[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < numeros.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for(int j = 0; j < numeros.length - 1 - i; j++)
			{
				if(numeros[j] < numeros[j + 1])
				{
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
					ordenado = false;
				}
			}
		}
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);
		}
	}
}

