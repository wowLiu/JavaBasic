package Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Введите строку разделенную пробелами: ");
    String textWithSpaces = input.nextLine();
    String[] arr = textWithSpaces.split(" ");

    int counter = 0;
for ( String ss : arr) {
        if (ss.matches("\\w+")) {
            System.out.println(ss);
            counter++;
        }
    }
System.out.println(counter);
}}
