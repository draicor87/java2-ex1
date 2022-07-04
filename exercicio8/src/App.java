public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2, n3;
		
		System.out.print("\nEste programa le tres valores numericos inteiros\ne mostra o valor menor.\n");

		System.out.print("\nDigite o primeiro numero: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("\nDigite o segundo numero: ");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.print("\nDigite o terceiro numero: ");
		n3 = Integer.parseInt(System.console().readLine());
		System.out.print("\n");
		
		if (n1 < n2 && n1 < n3)
                    System.out.printf("O numero menor e %d\n", n1);
		if (n2 < n1 && n2 < n3)
                    System.out.printf("O numero menor e %d\n", n2);
		if (n3 < n1 && n3 < n2)
                    System.out.printf("O numero menor e %d\n", n3);
    }
}
