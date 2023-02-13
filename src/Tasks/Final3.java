package Tasks;

import java.util.HashSet;
import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Введите количество строк: ");
    int quantity = input.nextInt();
    int counter = 0;
    String max = " ";
    HashSet<Character> s = new HashSet<Character>();
    System.out.println("Введите строки: ");
    while (counter <= quantity) {
        String res = input.nextLine();
        for(int i = 0; i < res.length(); i++)
        {
            s.add(res.charAt(i));
        }
        if (s.size() > max.length()) {
            max = res;
        }
        counter++;
        s.clear();
    }
    System.out.println("Строка с максимальным количеством символов " + max);
}
        }

