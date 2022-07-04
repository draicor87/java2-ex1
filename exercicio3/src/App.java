public class App {
    public static void main(String[] args) throws Exception {
        double A, B, C, delta;
		
		System.out.println("\nEste programa lê três valores numéricos,\nrepresentados pelas variáveis A, B e C,\nentão faz o cálculo do delta de uma equação de segundo grau,\nsegundo a fórmula de Báskara.\nO programa deve mostrar quantas raízes reais a equação possui\n");
		System.out.print("Digite o primeiro valor: ");
		A = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o segundo valor: ");
		B = Double.parseDouble(System.console().readLine());
		System.out.print("Digite o terceiro valor: ");
		C = Double.parseDouble(System.console().readLine());
		
		delta = (B * B) - 4 * A * C;

		if (delta < 0)
			System.out.println("\nA equação não possui raízes reais\n");

		if (delta > 0)
			System.out.println("\nA equação possui duas raízes reais\n");

		if (delta == 0)
			System.out.println("\nA equação possui uma raíz real\n");
    }
}
