package DESAFIOS;

import java.io.IOException;
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int x = leitor.nextInt();
            if (x == 0)
                System.out.println("NULL");
            if (x != 0 && x % 2 == 0)
                System.out.print("EVEN");
            else if (x != 0)
                System.out.print("ODD");
            if (x > 0)
                System.out.println(" POSITIVE");
            if (x < 0)
                System.out.println(" NEGATIVE");
        }
        leitor.close();
    }
}
