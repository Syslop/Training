package les2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = Math.abs(x);
        while (y > 0) {
            System.out.println("Цикл while");
            y--;
        }
    }
}
