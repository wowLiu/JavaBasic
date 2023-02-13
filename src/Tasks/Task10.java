package Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
    int[][] array = new int[size][size]; // Создаём массив int размером в size
    System.out.println("Введите элементы массива:");

    /*Пройдёмся по всему массиву, заполняя его*/
    for (int j = 0; j < size; j++) {
        for (int i = 0; i < size; i++) {
            array[j][i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
    }

    for (int i = 0; i < size; i++) {
        System.out.println(array[1][i] * 3);
    }

}
}
