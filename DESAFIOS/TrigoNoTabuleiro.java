package DESAFIOS;

import java.io.*;
import java.math.*;

public class TrigoNoTabuleiro {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qte = leitor(br);
        for (int i = 0; i < qte; i++) {
            int quadrados = leitor(br);
            BigInteger base = BigInteger.valueOf(2);
            BigInteger qteTrigo = base.pow(quadrados);
            System.out.println(qteTrigo.divide(BigInteger.valueOf(12000)) + " kg");
        }
    }

    static int leitor(BufferedReader br) throws NumberFormatException, IOException {
        int n;
        int resp = 0;
        int sinal = 1;
        while (true) {
            n = br.read();
            if (n >= '0' && n <= '9')
                break;
            if (n == '-')
                sinal = -1;
            if (n == '+')
                sinal = 1;
        }
        while (true) {
            resp = resp * 10 + n - '0';
            n = br.read();
            if (n < '0' || n > '9')
                break;
        }
        return resp * sinal;
    }
}
