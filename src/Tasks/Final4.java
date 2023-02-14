package Tasks;


import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Кто такой дед?");
        Scanner inputAnswer = new Scanner(System.in);
        String answer;
        boolean attempt;
        int count = 0;
        String advice = "Из зипа зараза";


    while (count < 3) {
        answer = inputAnswer.nextLine();
        attempt = answer.equalsIgnoreCase("Заархивированный вирус");
        if (attempt) {
            System.out.println("Правильно!");
            break;
        }

        if (answer.equalsIgnoreCase("Подсказка") && count == 0) {
            System.out.println(advice);
        } else if (count < 2 && !answer.equalsIgnoreCase("Подсказка")){
            System.out.println("Подумай еще");
        } else if (answer.equalsIgnoreCase("Подсказка") && count != 0) {
            System.out.println("Подсказка уже недоступна");
            count--;
        }

        count++;
        if (count == 3) System.out.println("Обидно, приходи в другой раз");
    }
}
}
