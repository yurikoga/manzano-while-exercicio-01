
/**b) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).*/
public class L03B {
	public static void main(String[] args) {
		int acumuladora=0,contadora=0;
		while (contadora<101){
			System.out.printf("\nNúmero: %d",contadora);
			acumuladora+=contadora;
			contadora++;
		}
		System.out.printf("\n\tO total da soma obtida dos cem primeiros números inteiros é %d\n",acumuladora);
	}
}
