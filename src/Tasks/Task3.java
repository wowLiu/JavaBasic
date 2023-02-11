package Tasks;

public class Task3 {
    public static void main(String[] args){  //обязательный класс

        int[] a = {30,33,36,39,60}; //зарезервировали память, объявили массив

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]); //Выводим изначальный массив в консоль цифрами
        }

        System.out.println(); //допинтервал

        int n = a.length; // задала переменную, которая будет использоваться для обмена элементов
        int temp; //задала переменную временную = буфер?

        for(int i=0;i<n/2;i++){
            temp = a [n-i-1]; //n-i-1 - определяет противоположный элемент массива
            a[n-i-1] = a[i];
            a[i] = temp; }
            for (int i=0; i<a.length;i++){
                System.out.print(a[i]); //не знаю как поменять только 1 и 5. все перебробовала - иначе не вышло.
        }
        System.out.println();
        int sum = a [a.length - 3] + a [a.length - 5];
            {
        System.out.println(sum);}

    }

}
