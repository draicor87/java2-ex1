public class App {
    public static void main(String[] args) throws Exception {
        double A, B, C, soma;
		
		System.out.println("\nEste programa lê tres valores para os lados de um triangulo (A, B e C).\nO programa verifica se os lados fornecidos formam realmente um triangulo.\n");

		System.out.print("Digite a medida do primeiro lado do triangulo: ");
		A = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a medida do segundo lado do triangulo: ");
		B = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a medida do terceiro lado do triangulo: ");
		C = Double.parseDouble(System.console().readLine());
		
		soma = A + B;

		if (soma > C)
			System.out.println("\nOs lados formam um triângulo\n");
		else
			System.out.println("\nOs valores informados não podem formar um triângulo\n");
    }
}
