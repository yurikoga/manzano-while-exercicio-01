import java.util.Scanner;
/**f)
 Elaborar um programa que apresente como resultado o valor de uma potência de uma base
 qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
 do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
 portuguol (^).*/
public class L03F {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contadora=0,expoenteQualquer,baseQualquer,acumulador=1;
		System.out.print("Digite uma base:");
		baseQualquer=sc.nextInt();
		System.out.print("Digite um expoente:");
		expoenteQualquer=sc.nextInt();
		while(contadora<expoenteQualquer){
			acumulador*=baseQualquer;
			contadora++;
		}
		System.out.printf("%d^%d = %d",baseQualquer,expoenteQualquer,acumulador);
	}
}
