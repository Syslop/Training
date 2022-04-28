package les2;

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = (i + 1) * 1.11;
        }
        System.out.println(Arrays.toString(doubles));
        doubles[0] = 1.00001;
        doubles[doubles.length - 1] = -0.189;
        System.out.println(Arrays.toString(doubles));
    }
}
