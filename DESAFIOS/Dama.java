package DESAFIOS;

import java.util.Scanner;

public class Dama {
    public static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        while (true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
                break;
            else if (x1 == x2 && y1 == y2)
                System.out.println("0");
            else if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2))
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}