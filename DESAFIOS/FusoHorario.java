package DESAFIOS;
import java.util.Scanner;

public class FusoHorario {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
		
	  int res = horasaida + tempoviagem + fuso;
	  if(res > 24)
	      res -= 24;
		if (res < 0)
		    res += 24;
		System.out.println(res);
		
		sc.close();
	}
}
