package Tasks;

import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    private static final int X = 5;
    private static final int Y = 10;
    private static final int Z = 15;

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == X || array[i] == Y || array[i] == Z) {
                System.out.print ("Данное значение имеется в константах"); // Выводим на экран, полученный массив
                break;
            }
        }
    }
}

