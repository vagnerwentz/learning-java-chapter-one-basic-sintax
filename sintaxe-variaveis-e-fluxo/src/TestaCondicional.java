
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais!");

		int idade = 17;
		boolean acompanhado = true;

		if (idade >= 18) {
			System.out.println("Você pode entrar na festa. \nSeja bem vindo");
		} else if (idade < 18 && acompanhado){
			System.out.println("Você pode entrar pois está acompanhado.");
		} else if (idade < 18 && !acompanhado) {
			System.out.println("Você não pode entrar pois é menor que 18 anos, e não está acompanhado.");
		}
		
	}

}
