public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2, res;
		
		System.out.print("Digite o primeiro número: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.print("Digite o segundo número: ");
		n2 = Integer.parseInt(System.console().readLine());
		
		if (n1 > n2)
		{
			res = n1 - n2;
			System.out.printf("A diferença entre os valores é: %d\n", res);
		}
		if (n2 > n1)
		{
			res = n2 - n1;
			System.out.printf("A diferença entre os valores é: %d\n", res);
		}
		if (n1 == n2)
		{
			res = 0;
			System.out.printf("A diferença entre os valores é: %d\n", res);
		}
    }
}