package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ht,th=0;
		double vh,ct=0.0,maior=0;
		char t='S';
		String nome,nmaior = null;
		
		
		while(t=='S') {
			
			System.out.println("Nome: ");
			nome= sc.next();
			System.out.println("Horas trabalhadas: ");
			ht=sc.nextInt();
			if(ht<0) {
				System.out.println("Horas trabalhadas: ");
				ht=sc.nextInt();
			}
			System.out.println("Valor por hora: ");
			vh=sc.nextDouble();
			if(vh<0) {
				System.out.println("Valor por hora: ");
				vh=sc.nextDouble();
			}
			th+= ht;
			ct+= ht*vh;
			
			if(ct*vh>maior) {
				nmaior=nome;
				
			}
			
			System.out.println("Digitar outro (S/N)?");
			t=sc.next().charAt(0);
			}
		int menu=0;
		
		while(menu!=4) {
		
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo Total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4- Sair");
			
			System.out.print("Digite uma opção: ");
			menu=sc.nextInt();
			if(menu==1) {
				System.out.printf("Total de horas = %d%n", th);
			}
			if(menu==2) {
				System.out.printf("Custo total = R$ %.2f%n", ct);
			}
			if(menu==3) {
				System.out.printf("Pessoa que mais ganhou: %s%n", nmaior);
			}
			
			
		}
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}

}
