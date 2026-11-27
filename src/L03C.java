
/**c) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
 1 até 500. */
public class L03C {
	public static void main(String[] args) {
		int acumuladora = 0,contadora=0,modulo;
		while (contadora<(500+1)){
			modulo=contadora%2;
			if(modulo!=0){
				contadora++;
				continue;
			}
			System.out.printf("\nNúmero acumulado: %d",contadora);
			acumuladora+=contadora;
			contadora++;
		}
		System.out.printf("\n\tSomatório dos valores pares existentes na faixa de 1 até 500 é %d",acumuladora);
	}
}
