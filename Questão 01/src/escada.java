import java.util.Scanner;

/**
 * 
 * Questão 01 Desafio Capgemini - Escada
 * 
 * @author Igor Martins
 * 
 * Atualizado: 14/02/2022 11:04 PM
 * 
 */

public class escada
{
	
	public static void main(String args[])
	{
	 
		try(Scanner scan = new Scanner(System.in)) // Scanner para captar o numero de degraus (n)
		{
		System.out.print("Insira o numero de degraus: ");
		int n = scan.nextInt();
		
		
		for(int i = 0; i < n; i++) 
			{ // controlador de linhas
			
			for(int j = 1; j < n - i; j++){ //Loop interno para controlar os espaços
				System.out.print(" ");
				}
			
			for (int j = 0; j < i + 1; j++){ //Loop interno para controlar os asteriscos*
				System.out.print("*");
				}
			
		System.out.println();
			}
	     }
	}
}