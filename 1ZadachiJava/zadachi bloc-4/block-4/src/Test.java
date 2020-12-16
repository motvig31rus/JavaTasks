import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
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
    }
}

