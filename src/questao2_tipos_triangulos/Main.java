package questao2_tipos_triangulos;

import java.util.Scanner;

/*Tipos de Triângulos (vale 2 pontos)
Determine se um triângulo é equilátero, isósceles ou escaleno.
Um triângulo equilátero tem os três lados com o mesmo comprimento.
Um triângulo isósceles tem pelo menos dois lados com o mesmo
comprimento.
Um triângulo escaleno tem todos os lados de comprimentos diferentes.
Considere também que só irá existir um triângulo se, e somente se, os
seus lados obedeceram à seguinte regra: um de seus lados deve ser maior
que o valor absoluto (módulo) da diferença dos outros dois lados e menor
que a soma dos outros dois lados.
Exemplo de Entrada Exemplo de Saída
7 7 7 Equilátero
7 7 8 Isósceles
7 8 14 Escaleno
7 8 15 Não é triângulo*/

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite os lados de um triângulo:");

	int lado1 = entrada.nextInt();
	int lado2 = entrada.nextInt();
	int lado3 = entrada.nextInt();
	
	 if(lado1 == lado2 && lado2 == lado3 ) {
		 System.out.println("Equilatero");
	 } else if(lado1 == lado2 && lado3 >= lado2) {
		 System.out.println("Isósceles");
	 } else if(lado1 != lado2 && lado3 >= lado2) {
		 System.out.println("Escaleno");
	 } else{
		 System.out.println("Não é triângulo");
	 }

	}

}
