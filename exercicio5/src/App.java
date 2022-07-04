public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2, n3, n4;
		
		System.out.print("\nEste programa le quatro valores numericos inteiros\ne mostra os valores que sao divisiveis por 2 e 3 respectivamente.\n");

		System.out.print("\nDigite o primeiro numero: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("\nDigite o segundo numero: ");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.print("\nDigite o terceiro numero: ");
		n3 = Integer.parseInt(System.console().readLine());
		System.out.print("\nDigite o quarto numero: ");
		n4 = Integer.parseInt(System.console().readLine());
		System.out.print("\n");

		if (((n1 % 2) == 0)  && ((n1 % 3)  ==0))
                    System.out.printf("O numero %d e Divisivel por 2 e 3\n", n1);
                if (((n2 % 2) == 0)  && ((n2 % 3)  ==0))
                    System.out.printf("O numero %d e Divisivel por 2 e 3\n", n2);
		if (((n3 % 2) == 0)  && ((n3 % 3)  ==0))
                    System.out.printf("O numero %d e Divisivel por 2 e 3\n", n3);
		if (((n4 % 2) == 0)  && ((n4 % 3)  ==0))
                    System.out.printf("O numero %d e Divisivel por 2 e 3\n", n4);
    }
}
