package trin1;

public class FelipeChuenck {

	public static void main(String[] args) {
		// TODO poupança = 0 6%;renda fixa = 1%
		
		Scanner sc = new Scanner(System.in);
		
		float sal_pão, sal_batata;
		int meses;
		
		System.out.println("informe o salario de carlos: ");
		sal_pão = sc.nextFloat();
		
		sal_batata = sal_pão / 3;
		
		meses = 0;
		
		while (sal_batata <  sal_pão) {
			sal_pão = sal_pão + (sal_pão * (0,6f / 100));
			sal_batata = sal_batata + (sal_batata * (1/ 100));
			meses++;
			System.out.println(meses);
			
		}
		
		System.out.println(ira levar d% meses para o Salario);
		

	}

}
