
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println("O valor é " + valor); // 1270
		
		int inteiroPositivo = 999999999;
		int inteiroNegativo = -999999999;
		long numeroGrandePositivo = 999999999999999999l;
		long numeroGrandeNegativo = -999999999999999999l;
		short numeroPequenoPositivo = 9999;
		short numeroPequenoNegativo = -9999;
		
		System.out.println(inteiroPositivo);
		System.out.println(inteiroNegativo);
		System.out.println(numeroGrandePositivo);
		System.out.println(numeroGrandeNegativo);
		System.out.println(numeroPequenoPositivo);
		System.out.println(numeroPequenoNegativo);
	}
}
