public class App {
    public static void main(String[] args) throws Exception {
        double n1, n2, n3, media;
		
		System.out.println("\nEste programa recebe as tres notas de um aluno,\ncalcula e mostra a media ponderada e o conceito do mesmo.\n");

		System.out.print("Digite a primeira nota: ");
		n1 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a segunda nota: ");
		n2 = Double.parseDouble(System.console().readLine());
		System.out.print("Digite a terceira nota: ");
		n3 = Double.parseDouble(System.console().readLine());
		System.out.print("\n");
		
		media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / (2.0 + 3.0 + 5.0);

		if (media >= 0.0 && media < 5.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Conceito: E\n");
			}
		if (media >= 5.0 && media < 6.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Conceito: D\n");
			}
		if (media >= 6.0 && media < 7.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Conceito: C\n");
			}
		if (media >= 7.0 && media < 8.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Conceito: B\n");
			}
		if (media >= 8.0 && media <= 10.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Conceito: A\n");
			}
    }
}
