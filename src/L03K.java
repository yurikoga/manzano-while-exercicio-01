import java.util.Scanner;
/**k) Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
 banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
 nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
 do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
 calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
 total acumulado da área residencial. */
public class L03K {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float larguraComodo,comprimentoComodo,area,areaResidencial=0;
		String nomeComodo,decisao;
		boolean teste=false;
		while(!teste){
			System.out.println("\n==========================");
			System.out.print("Digite o nome do cômodo:");
			nomeComodo=sc.nextLine();
			System.out.print("Digite a largura do cômodo:");
			larguraComodo=sc.nextFloat();
			System.out.print("Digite o comprimento do cômodo:");
			comprimentoComodo=sc.nextFloat();
			area=larguraComodo*comprimentoComodo;
			areaResidencial+=area;
			System.out.printf("A área total do cômodo '%s' é de %.2fm²\n",nomeComodo,area);
			System.out.print("\nDesejar calcular novos cômodos?\n(digite 'SIM' ou 'NAO'):");
			decisao=sc.next().toUpperCase();
			sc.nextLine();
			if(!decisao.equals("SIM")){
				System.out.println("\\ntMuito Obrigado por ter feito bom uso de nossa ferramenta!");
				System.out.printf("\tÁrea residencial total: %.2fm²\n",areaResidencial);
				break;
			}
		}

	}
}
