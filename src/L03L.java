import java.util.Scanner;

/**l)
 Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
 seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
 usuário. */
public class L03L {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int valor,maior=Integer.MIN_VALUE,menor=Integer.MAX_VALUE;
		byte contadora=0;
		while(contadora>=0){
			System.out.println("Digite um valor:");
			valor=sc.nextInt();
			if(valor<0){
				break;
			}
			if(valor>maior){
				maior=valor;
			}
			if(valor<menor){
				menor=valor;
			}
			// se fosse colocadao uma estrutura de decisão se/senão o código consideraria a teste que é verdadeiro e iria ignorar o resto do código
			// se o if for verdadeiro o else automáticamente é pulado, se if for falso, mas else for verdadeiro, então o teste do if é ignorado
			contadora++;
		}
		if(contadora>0) {
				System.out.printf("""
							Quantidade de Números digitados: %d
							Maior valor digitado: %d
							Menor valor digitado: %d
							""", contadora, maior, menor);
		}else{
			System.out.println("\tNenhum valor positivo foi digitado!");
		}
		sc.close();
	}
}
