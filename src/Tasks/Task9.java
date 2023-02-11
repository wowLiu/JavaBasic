package Tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
    double[] array = new double[size]; // Создаём массив int размером в size
    System.out.println("Введите элементы массива:");

    /*Пройдёмся по всему массиву, заполняя его*/
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
    }
    int res = 0;
    for (int i = 0; i < size; i++) {
        res += array[i];
    }
    System.out.println(res / size);
}
}
