package Tasks;

import java.util.Scanner;

public class Task4 {
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int c = (i+a+b)/3;
    String answer = (c > 3)? "Программа выполненна корректно" : "А такое условие уже не по задаче";


    System.out.println(answer);

    }}




