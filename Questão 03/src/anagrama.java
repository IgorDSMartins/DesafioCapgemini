import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Questão 03 Desafio Capgemini - Anagramas
 * 
 * @author Igor Martins
 * 
 * Atualizado: 15/02/2022 03:43 PM
 * 
 */

public class anagrama 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua palavra: ");
        String input = sc.next();
        int n = cAnagramas(input);
        System.out.printf("encontrados%2d anagramas", n);
        sc.close();
    }
    public static int cAnagramas(String n)
    {
        int a = 256; // tamanho da string array
        int equiv = 0;
        int cont = 0;
        
		String[] array = new String[a];
        
         for (int i = 0; i < n.length(); i++)
         {
            for (int j = i; j < n.length(); j++)
            {
                 String temp = n.substring(i, j+1); //Transforma em substrings a palavra
                 char[] ordenar = temp.toCharArray();
                 Arrays.sort(ordenar); //ordena as substrings
                 array[cont] = String.valueOf(ordenar);  //Insere resultado na array
                 cont++;
            }
        } 
        for (int i = 0; i < cont; i++) //Comparação entre substrings
        { 
            for (int j = i; j < cont; j++)
            {
                if (array[i].equals(array[j+1])) 
                {
                    equiv++;

                }  
            }
        }
	return equiv;        
    }
}