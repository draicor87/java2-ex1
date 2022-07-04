public class App {
    public static void main(String[] args) throws Exception {
        int n1;
		
		System.out.print("Digite o valor: ");
		n1 = Integer.parseInt(System.console().readLine());
		
		if (n1 > 0 && n1 < 10)
			System.out.print("O valor está na faixa permitida");
		else
			System.out.print("O valor está fora da faixa permitida");
    }
}