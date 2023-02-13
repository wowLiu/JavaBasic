package Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Введите первое число: ");
    String firstNumber = input.nextLine();
    int secondNumber = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
if (Integer.parseInt(firstNumber) < secondNumber) {
        System.out.println("большее " + secondNumber);
        System.out.println("меньшее " + Double.parseDouble(firstNumber));
    } else {
        System.out.println("большее " + firstNumber);
        System.out.println("меньшее " + Double.parseDouble(String.valueOf(secondNumber)));
    }
}}
