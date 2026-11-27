import java.util.Scanner;
/**a) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */
public class L03A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int variavel,resultado,contadora=0;
		System.out.print("Digite um número:");
		variavel=sc.nextInt();
		while (contadora<11){
			resultado=variavel*contadora;
			System.out.printf("\n\t%d * %d = %d",variavel,contadora,resultado);
			contadora++;
		}
		sc.close();
	}
}
