package les1;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((x > 1 && x < 100) || (x > -1000 && x < -100)) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
