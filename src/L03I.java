import java.util.Scanner;
/**i) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
 somatório e a média aritmética dos valores lidos. */
public class L03I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int somatorio=0,tamanho=10;
		float mediaAritmetica=0;
		int[]valores=new int[tamanho];
		byte contadora=1;
		while(contadora<=tamanho){
			System.out.printf("Digite o %d° valor:",contadora);
			valores[contadora-1]=sc.nextInt();
			somatorio+=valores[contadora-1];
			contadora++;
		}
		mediaAritmetica=(float)somatorio/tamanho;
		System.out.printf("""
				\n\tA soma total dos valores digitados é: %d
				\tA média aritmética doas valores lidos é: %.2f
				""",somatorio,mediaAritmetica);
	}
}
