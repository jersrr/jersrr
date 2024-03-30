package meuprojeto;
import java.util.Scanner;

public class AskAndAnswer {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String resposta;
		int point=0;
		String answer1 = "Luffy";
		String answer2 = "Zoro";
		String answer3 = "Chopper";
		System.out.println("Quem é o capitão da tripulação dos Chapéu de Palha?");
		resposta= scanner.next();
		if(resposta.equals(answer1)) {
			System.out.println("CORRETO!");
			point++;
		}else {
			System.out.println("ERRADO!");
			System.out.println("A RESPOSTA CORRETA É: Luffy!");
		}
		
		System.out.println("Quem é o espadachim do Bando do Chapéu de Palha?");
		resposta= scanner.next();
		if(resposta.equals(answer2)) {
			System.out.println("CORRETO!");
			point++;
		}else {
			System.out.println("ERRADO!");
			System.out.println("A RESPOSTA CORRETA É: Zoro!");
		}
		
		System.out.println("Quem é a Rena Humana do Bando do Chapéu de Palha?");
		resposta= scanner.next();
		if(resposta.equals(answer3)) {
			System.out.println("CORRETO!");
			point++;
		}else {
			System.out.println("ERRADO!");
			System.out.println("A RESPOSTA CORRETA É: Chopper!");
		}
		System.out.println("A soma dos seus pontos no quizz é:" +point);
	}
}