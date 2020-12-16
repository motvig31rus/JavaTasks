
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        double a, b, c;
        double D;
        System.out.println("Задача 1");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Для того, чтобы решить квдаратное уравнение, введите индексы:");
        System.out.println("Введите a");
        a = sc1.nextDouble();
        System.out.println("Введите b");
        b = sc1.nextDouble();
        System.out.println("Введите c");
        c = sc1.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }

        //Задача 2
        int zipNum = 0, zipCol = 0;
        String str;
        System.out.println("Задача 2");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите строку");
        str = sc2.nextLine();
        char[] StrSim = str.toCharArray();
        for (int i = 0; i < str.length() - 2; i++) {
            if (StrSim[i] == 'z') {
                if (StrSim[i + 1] == 'i') {
                    if (StrSim[i + 2] == 'p') {
                        zipCol++;
                        zipNum = i;
                    }
                }
            }
        }
        if (zipCol >= 2) {
            System.out.println(zipNum);
        } else {
            System.out.println("-1");
        }

        //Задача 3
        int number = 0, sumPerf = 0;
        System.out.println("Задача 3");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите идеальное число");
        number = sc3.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumPerf += i;
            }
        }
        if (sumPerf == number) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //Задача 4
        String str1;
        char h;
        System.out.println("Задача 4");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите строку для замены первого и последнего символа");
        str1 = sc4.nextLine();
        char[] Str1Sim = str1.toCharArray();
        if (str1.length() > 2) {
            if (Str1Sim[0] != Str1Sim[str1.length() - 1]) {
                h = Str1Sim[0];
                Str1Sim[0] = Str1Sim[str1.length() - 1];
                Str1Sim[str1.length() - 1] = h;
                for (int i = 0; i < Str1Sim.length; i++) {
                    System.out.print(Str1Sim[i]);
                }
            } else {
                System.out.println("Два - это пара");
            }
        } else {
            System.out.println("Несовместимо");
        }

        //Задача 5
        int z = 0;
        System.out.println("Задача 5");
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите шеснадцатеричный код");
        String code16 = sc5.nextLine();
        char[] Code16Sim = code16.toCharArray();
        char[] Letters = {'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (Code16Sim[0] == '#' && code16.length() == 7) {
            for (int i = 1; i < Code16Sim.length; i++) {
                for (int j = 0; j < Letters.length; j++) {
                    if ((Code16Sim[i] == Letters[j] | Character.isDigit(Code16Sim[i]) == true) == true) {
                        z++;
                        if (Character.isDigit(Code16Sim[i]) == true) {
                            i++;
                        }
                    }
                }
            }
        }
        if (z >= 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        //Задача 6
        System.out.println("Задача 6");
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Введем первый массив, укажите его размерность:");
        int size1 = sc6.nextInt();
        int array1[] = new int[size1];
        System.out.println("Вводите элементы массива по очереди");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc6.nextInt();
        }
        System.out.println("Теперь введме размерность второго массива:");
        int size2 = sc6.nextInt();
        int array2[] = new int[size2];
        System.out.println("Вводите элементы массива по очереди");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc6.nextInt();
        }
        int[] copy1 = new int[array1.length];
        int res1 = 0;
        int countNum1 = 0;
        int count1 = 0;
        for (int i = 0; i < copy1.length; i++) {
            copy1[i] = 0;
        }

        for (int i = 0; i < array1.length; i++) {
            if (copy1[i] == 0) {
                for (int j = 0; j < array1.length; j++) {
                    if (array1[i] == array1[j]) {
                        copy1[j] = 1;
                        count1++;
                    }
                }
            }
            if (countNum1 < count1) {
                countNum1 = count1;
                res1++;
            }
        }
        int[] copy2 = new int[array2.length];
        int res2 = 0;
        int countNum2 = 0;
        int count2 = 0;
        for (int i = 0; i < copy2.length; i++) {
            copy2[i] = 0;
        }
        for (int i = 0; i < array2.length; i++) {
            if (copy2[i] == 0) {
                for (int j = 0; j < array2.length; j++) {
                    if (array2[i] == array2[j]) {
                        copy2[j] = 1;
                        count2++;
                    }
                }
            }
            if (countNum2 < count2) {
                countNum2 = count2;
                res2++;
            }

        }
        if (res1 == res2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        //Задача 7

        System.out.println("Задача 7");
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Введите число для проверки на число карпа");
        int n = sc7.nextInt();

        int trueCount =0;
        if (n == 1) {
            trueCount++;
        }
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0) {
            count_digits++;
            sq_n /= 10;
        }
        sq_n = n * n;

        for (int r_digits = 1; r_digits < count_digits; r_digits++) {
            int eq_parts = (int) Math.pow(10, r_digits);
            // Чтобы избежать числа как 10, 100, 1000 (Это не Карпрекарские числа)
            if (eq_parts == n)
                continue;
            // Находим сумму текущих частей и сравниваем с n
            int sum = sq_n / eq_parts + sq_n % eq_parts;
            if (sum == n) {
                trueCount++;
            }
        }

        if (trueCount > 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        //Задача 8
        System.out.println("Задача 8");
        Scanner sc8 = new Scanner(System.in);
        System.out.println("Введите двоичную строку");
        String binStr = sc8.nextLine();
        int countZero = 0;
        int largestZero = 0;
        char[] SimBinStr = binStr.toCharArray();
        for(int i = 0; i< SimBinStr.length; i++){
            if (SimBinStr[i] == '0'){
                countZero++;
            }
            else{
                if (largestZero < countZero){
                    largestZero = countZero;
                }
                countZero = 0;
            }
        }
        System.out.println("0".repeat(largestZero));

        //Задача 9
        System.out.println("Задача 9");
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Введите число");
        int o = sc9.nextInt();
        int divider = 2;
        if (o > 1) {
            for(int i = 2; i <= o; i++) {
                if (o % divider != 0) {
                    divider++;
                }
            }
        }
        if (divider == o){
            System.out.println(o);
        }
        else{
            int counter;
            o++;
            while(true){
                int l = (int) Math.sqrt(o);
                counter = 0;
                for(int i = 2; i <= l; i ++){
                    if(o % i == 0)  counter++;
                }
                if(counter == 0){
                    System.out.println(o);
                    break;
                }
                else{
                    o++;
                    continue;
                }
            }
        }
        //Задача 10
        System.out.println("Задача 10");
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Введите a,b,c по очереди");
        int a1 = sc10.nextInt();
        int b1 = sc10.nextInt();
        int c1 = sc10.nextInt();
        int max = Math.max(a1, Math.max(b1,c1));
        if (max == a1){
            if(a1*a1 == b1*b1 + c1*c1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else if (max == b1){
            if(b1*b1 == a1*a1 + c1*c1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else if (max == c1){
            if(c1*c1 == a1*a1 + b1*b1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("Ошибка");
        }
    }
}