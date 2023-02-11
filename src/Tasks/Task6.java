package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
    String chooser = reader.readLine();
        System.out.println("Выберите единицу измерения: 1 - метр/килограммы, 2 - миля/граммы, 3 - ярд/тонны, 4 - фут/центнеры");
    int  unit = Integer.parseInt(reader.readLine());
        System.out.println("Введите число");
    int number = Integer.parseInt(reader.readLine());

    if (chooser.equals("1")) {
        switch (unit) {
            case 1:
                System.out.println("Килограммы: " + number);
                break;
            case 2:
                System.out.println("Граммы: " + number * 1000);
                break;
            case 3:
                System.out.println("Тонны: " + number / 1000);
                break;
            case 4:
                System.out.println("Центнеры: " + number / 100);
                break;
            default:
                System.out.println("Введите число из списка разрешенных");
                break;
        }
    } else {
        switch (unit) {
            case 1:
                System.out.println("Метры: " + number);
                break;
            case 2:
                System.out.println("Мили: " + number * 0.000621371);
                break;
            case 3:
                System.out.println("Ярды: " + number * 1.094);
                break;
            case 4:
                System.out.println("Футы: " + number * 3.281);
                break;
            default:
                System.out.println("Введите число из списка разрешенных");
                break;
        }
    }
}}

