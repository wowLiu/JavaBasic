package Tasks;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String text = input.nextLine();
        int res = 0;
        if (text.charAt(1) == '+') {
            if (text.charAt(0) == 'x') {
                res = text.charAt(4) - text.charAt(2);
            } else if (text.charAt(2) == 'x') {
                res = text.charAt(4) - text.charAt(0);
            } else {
                res = text.charAt(0) + text.charAt(2);
            }
        } else if (text.charAt(1) == '-') {
            if (text.charAt(0) == 'x') {
                res = text.charAt(4) + text.charAt(2);
            } else if (text.charAt(2) == 'x') {
                res = text.charAt(0) - text.charAt(4);
            } else {
                res = text.charAt(0) - text.charAt(2);
            }
        }
        System.out.println(res);
    }
}
