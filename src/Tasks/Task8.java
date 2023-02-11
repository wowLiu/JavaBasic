package Tasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                res += i;
            }
        }
        System.out.println (res);
    }
    }


