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
		sc.close();
	}

}
