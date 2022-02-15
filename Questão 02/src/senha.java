import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Questão 02 Desafio Capgemini - Senha
 * 
 * @author Igor Martins
 * 
 * Atualizado: 14/02/2022 11:04 PM
 * 
 */


public class senha {

public static void main(String[] args) {
    int min =6; // numero minimo de caracteres
    int numero=0;
    int especial=0;
    int maiusculo=0;
    int minusculo=0;
    String senha;
    Scanner scan = new Scanner(System.in); // Captando senha
    System.out.println(" Insira sua senha:");
        senha = scan.nextLine();
        
    if(senha.length()>=min){
        for(int i =0;i<senha.length();i++){
            char c = senha.charAt(i); // checa caractere
            if(Character.isUpperCase(c)){ // Maiusculo
                maiusculo++; 
            }
            if(Character.isLowerCase(c)){ // Minusculo
                minusculo++;
            }
            if(Character.isDigit(c)){ // numero
                numero++;
            }
            Pattern p = Pattern.compile("[^A-Za-z0-9]"); // padrão de caracteres nao especiais
            Matcher m = p.matcher(senha);
            boolean b = m.find();
            if (b)
               especial++; 
        }
        
        if(especial>=1&&minusculo>=1&&maiusculo>=1&&numero>=1){ // possui todos os requerimentos para ser considerada uma senha forte
            System.out.println("A senha é forte");
        }
        else {
            System.out.println("A senha possui o tamanho minimo"); // Senha possui apenas o tamanha minimo
        }
    }
    if(senha.length()<min) {
    	int restante = min - senha.length();
    	System.out.printf("É necessario mais%2d caracteres para a senha ser considerada segura", restante); // diz o numero de caracteres que precisa
    }
			scan.close();
   }

}