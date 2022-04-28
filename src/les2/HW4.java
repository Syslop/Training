package les2;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m < 0) {
            System.out.println("Введите положительное число");
            m = sc.nextInt();
        }
        int[] ints = new int[m];
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Введите " + i + "-й элемент");
            ints[i] = sc.nextInt();
            sum = sum + ints[i];
        }
        System.out.println(Arrays.toString(ints));
        System.out.println("Сумма элементов массива ints равна = " + sum);
    }
}
