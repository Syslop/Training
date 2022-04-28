package les1;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 1000000) {
            System.out.println("Большое число");
        } else {
            System.out.println("Небольшое число");
        }
    }
}
