package condicinal;

import java.util.Scanner;

public class provajava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contTime = 1;
		int qtd = 0;
		int contJog, idade;
		double peso, mediaIdade, mediaAltura, porc;
		double tot80 = 0;
		double alt = 0;
				
		while (contTime <= 5) {
			mediaIdade = 0;
			contJog = 1;

			

			while (contJog <= 11) {
				System.out.println("Insira sua idade, peso e altura");
				idade = sc.nextInt();				peso = sc.nextDouble();
				alt += sc.nextDouble();				

				if (idade < 18) {
					qtd ++;
					mediaIdade += idade;
				}
				if (peso > 80) {
					tot80 ++;
				}			

				contJog ++;

			}		

			mediaIdade /= 11;
			
			System.out.printf("A idade média é %.2f%n", mediaIdade);			

			System.out.println("Número de jogadores com menos de 18 anos é " + qtd);		

			mediaAltura = (alt /11);
			
			System.out.printf("A média da altura dos jogadores é %.2f%n", mediaAltura);			

			contTime ++;

		}

		porc = (tot80 / 55) * 100;		

		System.out.printf("Porcentagem de jogadores acima de 80kg: %.2f%%%n", porc);		

		sc.close();

	}

}

