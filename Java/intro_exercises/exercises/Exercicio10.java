package exercises;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFim, duracao;
		
		System.out.println("Digite a hora de início e de término do jogo:");
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		if(horaInicio >= horaFim) {
			duracao = 24 + horaFim - horaInicio;
		} else {
			duracao = horaFim - horaInicio;
		} 

		System.out.printf("O JOGO DUROU %d HORA(S).", duracao);
		
		sc.close();
	}

}
