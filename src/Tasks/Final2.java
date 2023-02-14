package Tasks;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String text = input.nextLine();
        int res = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        if (text.charAt(0) == 'x') {
            second = Integer.parseInt(String.valueOf(text.charAt(2)));
            third = Integer.parseInt(String.valueOf(text.charAt(4)));
        } else if (text.charAt(2) == 'x') {
            first = Integer.parseInt(String.valueOf(text.charAt(0)));
            third = Integer.parseInt(String.valueOf(text.charAt(4)));
        } else {
            first = Integer.parseInt(String.valueOf(text.charAt(0)));
            second = Integer.parseInt(String.valueOf(text.charAt(2)));
        }

        if (text.charAt(1) == '+') {
            if (text.charAt(0) == 'x') {
                res = third - second;
            } else if (text.charAt(2) == 'x') {
                res = third - first;
            } else {
                res = first + second;
            }
        } else if (text.charAt(1) == '-') {
            if (text.charAt(0) == 'x') {
                res = second + third;
            } else if (text.charAt(2) == 'x') {
                res = first - third;
            } else {
                res = first - second;
            }
        }
        System.out.println(res);
    }
}
