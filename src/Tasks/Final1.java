package Tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текущий курс: ");
        double exchangeRate = input.nextDouble();
        System.out.println("Введите количество рублей: ");
        double total = input.nextDouble();
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String result = decimalFormat.format(total / exchangeRate);
        System.out.println(result);
    }
}
