public class App {
    public static void main(String[] args) throws Exception {
        double salario1, salario2, aumento;
		
		System.out.print("\nEste programa recebe o valor do salario\ne mostra o valor com aumento de 30%.\n");

		System.out.print("\nDigite o valor do salario: R$ ");
		salario1 = Double.parseDouble(System.console().readLine());
		
		if (salario1 >= 5000) {
			System.out.println("\nEste salario é igual ou superior a R$ 5000,00");
		} else {
				aumento = salario1 * 0.3;
				salario2 = salario1 + aumento;
				System.out.printf("\nO valor do salario com o aumento é: R$ %.2f\n", salario2);
		}
    }
}
