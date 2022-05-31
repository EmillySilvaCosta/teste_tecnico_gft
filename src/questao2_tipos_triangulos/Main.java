package questao2_tipos_triangulos;

import java.util.Scanner;

/*Tipos de Tri�ngulos (vale 2 pontos)
Determine se um tri�ngulo � equil�tero, is�sceles ou escaleno.
Um tri�ngulo equil�tero tem os tr�s lados com o mesmo comprimento.
Um tri�ngulo is�sceles tem pelo menos dois lados com o mesmo
comprimento.
Um tri�ngulo escaleno tem todos os lados de comprimentos diferentes.
Considere tamb�m que s� ir� existir um tri�ngulo se, e somente se, os
seus lados obedeceram � seguinte regra: um de seus lados deve ser maior
que o valor absoluto (m�dulo) da diferen�a dos outros dois lados e menor
que a soma dos outros dois lados.
Exemplo de Entrada Exemplo de Sa�da
7 7 7 Equil�tero
7 7 8 Is�sceles
7 8 14 Escaleno
7 8 15 N�o � tri�ngulo*/

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite os lados de um tri�ngulo:");

	int lado1 = entrada.nextInt();
	int lado2 = entrada.nextInt();
	int lado3 = entrada.nextInt();
	
	 if(lado1 == lado2 && lado2 == lado3 ) {
		 System.out.println("Equilatero");
	 } else if(lado1 == lado2 && lado3 >= lado2) {
		 System.out.println("Is�sceles");
	 } else if(lado1 != lado2 && lado3 >= lado2) {
		 System.out.println("Escaleno");
	 } else{
		 System.out.println("N�o � tri�ngulo");
	 }

	}

}
