/**j)
 Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
 pares situados na faixa numérica de 50 a 70. */
public class L03J {
	public static void main(String[] args){
		int somatorio=0,tamanho=70;
		float mediaAritmetica;
		byte contadora=50,qtdNumeros=0;
		while(contadora<=tamanho){
			System.out.println("Valor guardado no acumulador:"+contadora);
			somatorio+=contadora;
			contadora+=2;
			qtdNumeros++;
		}
		mediaAritmetica=(float)somatorio/qtdNumeros;
		System.out.printf("""
				\n\tA soma total dos valores digitados é: %d
				\tA média aritmética doas valores lidos é: %.0f
				""",somatorio,mediaAritmetica);
	}
}
