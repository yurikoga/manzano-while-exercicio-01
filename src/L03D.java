
/**d) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
 se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução se,
 perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.*/
public class L03D {
	public static void main(String[] args) {
		int contadora=0,modulo;
		while (contadora<=20){
			modulo=contadora%2;
			if(modulo!=0){
				System.out.printf("\nNúmero Ímpar: %d",contadora);
			}
			contadora++;
		}
	}
}
