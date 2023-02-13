package Tasks;

public class Task12 {
    public static void main(String[] args) {
    String var = "I like Java!!!";

if (var.contains("Java")) {
        System.out.println("Yes");
        if (var.startsWith("I like")) {
            System.out.println("Yes");
            if (var.endsWith("!!!")) {
                System.out.println(var.toUpperCase());
            }
        }
    }
    String res = var.substring(7, 11);
System.out.println(res.substring(0,1) + 'o' + res.substring(2, 3) + 'o');
}}
