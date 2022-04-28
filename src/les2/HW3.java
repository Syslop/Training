package les2;

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x < 0) {
            System.out.println("Введите положительное число");
            x = sc.nextInt();
        }
        int[] ints = new int[x];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 11;
        }
        System.out.println(Arrays.toString(ints));
    }
}
