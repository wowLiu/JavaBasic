package Tasks;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] A = new int[15];
        Random r = new Random();
        int min = -20;
        int max = 20;
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(max-min) + min;
        }
        int minRes = getMin(A);
        int maxRes = getMax(A);
        System.out.println("Минимальный элемент " + minRes);
        System.out.println("Максимальный элемент " + maxRes);

        if (Math.abs(minRes) < Math.abs(maxRes)){
            System.out.println("Наибольшее по модулю " + maxRes);
        } else {
            System.out.println("Наибольшее по модулю " + minRes);
        }

    }


private static int getMax(int[] A)
        {
        int max = Integer.MIN_VALUE;
        for (int i: A) {
        max = Math.max(max, i);
        }

        return max;
        }

private static int getMin(int[] A)
        {
        int min = Integer.MAX_VALUE;
        for (int i: A) {
        min = Math.min(min, i);
        }

        return min;
        }

}


