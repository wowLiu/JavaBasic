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


        while (count<3) {
            answer = inputAnswer.nextLine();
            attempt = answer.equalsIgnoreCase("Заархивированный вирус");
            if (answer.equalsIgnoreCase("Подсказка")) {
                System.out.println(advice);
                count = 2;
                System.out.println(count);
            }else if (attempt) {
                System.out.println("Правильно!");
                break;
            } else if (count<2){
                System.out.println("Подумай еще");
                count++;
            }else{
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }
    }
}
