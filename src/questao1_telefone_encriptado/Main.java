package questao1_telefone_encriptado;

import java.util.Scanner;

/*1. Telefone Encriptado (vale 3 pontos)
Em alguns lugares é comum lembrar um número do telefone associando
seus dígitos a letras. Dessa maneira a expressão MY LOVE significa 69
5683. Claro que existem alguns problemas, uma vez que alguns números
de telefone não formam uma palavra ou uma frase e os dígitos 1 e 0 não
estão associados a nenhuma letra.
Sua tarefa é ler uma expressão e encontrar o número de telefone
correspondente baseado na tabela abaixo. Uma expressão é composta
por letras maiúsculas (A-Z), hifens (-) e os números 1 e 0.
Letras -> Número
ABC -> 2
DEF -> 3
GHI -> 4
JKL -> 5
MNO -> 6
PQRS -> 7
TUV -> 8
WXYZ -> 9
Entrada
A entrada consiste em uma expressão. Cada expressão possui C
caracteres, onde 1 ≤ C ≤ 30.
Saída

Para cada expressão você deve imprimir o número de telefone
correspondente.
Exemplo de entrada:
1-HOME-SWEET-HOME
MY-MISERABLE-JOB
Saída correspondente:
1-4663-79338-4663
69-647372253-562*/
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva os caracteres:");
		String palavra = entrada.next();
		if(palavra.equalsIgnoreCase("A") || palavra.equalsIgnoreCase("B") || palavra.equalsIgnoreCase("C")) {
			System.out.println("2");
		} else if (palavra.equalsIgnoreCase("D") || palavra.equalsIgnoreCase("E") || palavra.equalsIgnoreCase("F")) {
			System.out.println("3");
		}else if (palavra.equalsIgnoreCase("G") || palavra.equalsIgnoreCase("H") || palavra.equalsIgnoreCase("I")) {
			System.out.println("4");
		}else if (palavra.equalsIgnoreCase("J") || palavra.equalsIgnoreCase("K") || palavra.equalsIgnoreCase("L")) {
			System.out.println("5");
		}else if (palavra.equalsIgnoreCase("M") || palavra.equalsIgnoreCase("N") || palavra.equalsIgnoreCase("O")) {
			System.out.println("6");
		}else if (palavra.equalsIgnoreCase("P") || palavra.equalsIgnoreCase("Q") || palavra.equalsIgnoreCase("R")| palavra.equalsIgnoreCase("S")) {
			System.out.println("7");
		}
			

	}

}
