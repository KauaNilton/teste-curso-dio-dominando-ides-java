package br.com.dio;

import java.util.Scanner;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Hello World!");
		float n1,n2, media;
		System.out.print("Digite um n�mero: ");
		n1 = sc.nextFloat();
		System.out.print("Digite o segundo n�mero: ");
		n2 = sc.nextFloat();
		media = (n1 + n2)/2;
		System.out.println("A m�dia dos n�meros digitados s�o: " + media); */
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);
		System.out.println(livros);

	}

}
class Livros {
	private String nome;
	private String npag;
}
