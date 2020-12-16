import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите множитель символа");
        int n = sc.nextInt();
        System.out.println("Введите слово");
        String text = sc.next();

        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeat.append(text.charAt(i));
            }
        }
        System.out.println("Ответ " + repeat);
        //Задача 2
        System.out.println("Задача 2");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите размер масива");
        int size = sc1.nextInt();
        int array[] = new int[size];
        System.out.println("Введите числа в массив по очереди");
        for (int i = 0; i < size; i++) {
            array[i] = sc1.nextInt();
        }
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        double rez = max - min;
        System.out.println("Ответ " + rez);
        //Задача 3
        System.out.println("Задача 3");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size2 = sc2.nextInt();
        int array2[] = new int[size2];
        System.out.println("Введите числа в массив по очереди");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc2.nextInt();
        }
        float sum_array2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum_array2 = sum_array2 + array2[i];
        }
        System.out.println("Сумма элементов массива " + sum_array2);
        float avg2 = sum_array2 / (float) size2;
        System.out.println("Среднее значение" + avg2);
        if (avg2 % 1 == 0) {
            System.out.println("Ответ " + "True");
        } else {
            System.out.println("Ответ " + "False");
        }
        //Задача 4
        System.out.println("Задача 4");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size3 = sc3.nextInt();
        int array3[] = new int[size3];
        System.out.println("Введите числа в массив по очереди");
        for (int i = 0; i < size3; i++) {
            array3[i] = sc3.nextInt();
        }
        int arraySum = 0;
        for (int i = 0; i < size3; i++) {
            arraySum = arraySum + array3[i];
            System.out.println("Число " + (i+1) + " - " + arraySum);
        }
        //Задача 5
        System.out.println("Задача 5");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите десятичную дробь");
        String number = sc.next();
        char[] Nums = number.toCharArray();
        int i = Nums.length - 1;
        int col = 0;
        while (Nums[i] != '.'){
            i--;
            col++;
        }
        System.out.println("Число знаков после запятой - " + col);
        //Задача 6
        System.out.println("Задача 6");
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите число, от которого хотите получить число Фибоначчи");
        int n1 = sc.nextInt();
        int[] f = new int[n1+2];
        f[0] = 0;
        f[1] = 1;
        for (int j = 2; j < (n1 + 2); j++) {
            f[j] = f[j - 1] + f[j - 2];
        }
        System.out.println("Число Фибоначи - " + f[n1+1]);
        //Задача 7
        System.out.println("Задача 7");
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Введиет индекс, который хотите проверить");
        String index = sc6.nextLine();
        char[] Index = index.toCharArray();
        int j = 0;
        boolean g = false;
        boolean isdigit = false;
        System.out.println(Index.length);
        if (Index.length == 5) {
            for (int z = 0; z < 5; z++) {
                if(Index[z] == ' '){
                    j = 1;
            }
            }
            //System.out.println("ok1");
            if (j == 0){
                //System.out.println("ok2");
                try {
                    Integer.parseInt(index);
                }
                catch (Exception e) {
                    g = false;
                }
                g = true;
                    if (g = true){
                        //System.out.println("ok3");
                        System.out.println("true");
                    }
                else{
                    System.out.println("false");
                }
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
        //Задача 8
        System.out.println("Задача 8");
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Введите слова странной пары:");
        System.out.println("Введите первое слово");
        String str1 = sc7.nextLine();
        System.out.println("Введите второе слово");
        String str2 = sc7.nextLine();
        char[] Str1A = str1.toCharArray();
        char[] Str2A = str2.toCharArray();
        if (Str1A[0] == Str2A[Str2A.length-1]){
            if (Str1A[Str1A.length-1] == Str2A[0]) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("false");
        }

//Задача 9
        System.out.println("Задача 9");
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = sc9.nextLine();
        System.out.println("Что вы хотите проверить? 1-суффикс, 2 - префикс");
        int prod = sc9.nextInt();
        if (prod == 1){
            System.out.println("Введите суффикс");
            String suf = sc9.next();
            int lWord = word.length();
            int lSuf = suf.length();
            String t = "";
            for(int m=lWord-1;m>lWord-lSuf;m--){
                t=word.charAt(m)+t;
                System.out.println(t);
            }
            t = "-" +t;
            if (t.equals(suf) == true) {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else if (prod == 2){
            System.out.println("Введите Префикс");
            String pref = sc9.next();
            String t = "";
            System.out.println(pref);
            for(int b=0;b<pref.indexOf("-");b++){
                t+=word.charAt(b);
                System.out.println(t);
            }
            t+="-";
            if (t.equals(pref) == true){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else {
            System.out.println("Вы ошиблись");
        }
//Задча 10
        System.out.println("Задача 10");
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Введите номер шага последовательности");
        int k = sc10.nextInt();
        int res=0;
        for (int q=1;q<=k;q++){
            if(q%2==0){
                res--;
            }
            else{
                res+=3;
            }
        }
        System.out.println("Результат" + res);
    }
}