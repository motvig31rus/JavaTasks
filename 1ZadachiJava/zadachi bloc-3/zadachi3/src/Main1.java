import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Main1 {
    public static void main(String[] args) {
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
