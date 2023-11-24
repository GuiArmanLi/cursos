import java.util.Scanner;

class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho de um arquivo Mbs");
		double tamanhoDoArquivo = scan.nextDouble();

		System.out.println("Digite a velocidade da internet em Mbps");
		double velocidadeDaInternet = scan.nextDouble();

		double tempoDoDownload = tamanhoDoArquivo / velocidadeDaInternet;

		System.out.println("O tempo para download do arquivo e " + tempoDoDownload + " minutos.");
		scan.close();
	}
}