import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Crie um programa que receba através do teclado o primeiro nome de uma pessoa e retorne uma
		//mensagem de boas vindas com o valor informado, por exemplo: “Olá, Douglas”.

		Scanner input = new Scanner(System.in);
	    String nome;
	    System.out.println("Digite seu nome: ");
	       nome = input.nextLine();
	       
	     System.out.println("Olá, " + nome);
	        
	}

}
