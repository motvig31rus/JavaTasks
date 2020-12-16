import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число, от которого хотите получить число белла");
        int num = sc1.nextInt();
        int[][] mass = new int[num + 1][num + 1];
        int sum = 0;
        mass[0][0] = 1;
        mass[num][num] = 1;
        for (int n = 1; n <= num; n++) {
            for (int i = 1; i < num; i++) {
                mass[n][i] = mass[n - 1][i - 1] + i * mass[n - 1][i];
            }
        }
        for (int i = 0; i <= num; i++) sum += mass[num][i];
        System.out.println("Число белла - "+sum);

        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Вы хотите перевести слово или предложение? \n1 - слово, 2 - предложение");
        Scanner sc2 = new Scanner(System.in);
        int f = sc2.nextInt();
        Scanner sc2_1 = new Scanner(System.in);
        System.out.println("Введите текст для перевода");
        String word = sc2_1.nextLine();
        String vowel = "aeiouyAEIOUY";
        if(f == 1) {
            if (vowel.indexOf(word.charAt(0)) != -1) {
                word += "yay";
            }
            else {
                String newWord = word.split("[aeiouy]")[0];
                word = word.replaceFirst(newWord, "") + newWord + "ay";
            }
            System.out.println(word);
        }
        if(f == 2) {
            String[] newword = word.substring(0, word.length() - 1).split(" ");
            word = "";
            for (String s : newword) {
                for (int j = 0; j < vowel.length(); j++) {
                    if (vowel.indexOf(s.charAt(j)) != -1) {
                        word += s + "yay ";
                        break;
                    }
                    else {
                        String newWord = s.split("[aeiyouAEIYOU]")[0];
                        word += s.replaceFirst(newWord, "") + newWord + "ay ";
                        break;
                    }
                }
            }
            System.out.println(word);
        }

        //Задача 3
        int counter3 = 0;
        System.out.println("Задача 3");
        System.out.println("Введите строку для проверки на формат RGB");
        Scanner sc3 = new Scanner(System.in);
        String rgb = sc3.nextLine();
        int rgbNum = rgb.indexOf('(');
        if (rgb.contains(" ")) {
            System.out.println("False");
        }
        String[] newrgb = rgb.substring(rgb.indexOf('(') + 1, rgb.indexOf(')')).split(",");
        double[] n = new double[rgbNum];
        for (int i = 0; i < rgbNum; i++) {
            n[i] = Double.parseDouble(newrgb[i]);
        }
        for (int i = 0; i < rgbNum; i++) {
            if (n[i] >= 0 && n[i] <= 255 && rgbNum == newrgb.length) {
                counter3++;
            }
        }
        if(counter3 >= 3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        //Задача 4
        System.out.println("Задача 4");
        System.out.println("Введите ссылку для удаления дублирующихся параметров");
        Scanner sc4 = new Scanner(System.in);
        String url = sc4.nextLine();
        System.out.println("Хоитте ввести необязательные параметры? Если да, то сколько?");
        Scanner sc4_1 = new Scanner(System.in);
        int g = sc4_1.nextInt();
        String[] paramsToStrip = new String[g];
        Scanner sc4_2 = new Scanner(System.in);
        if(g>0){
            System.out.println("Вводите параметры");
            for(int i = 0; i < g; i++){
                paramsToStrip[i] = sc4_2.nextLine();
            }
        }
        String str = "";
        if (!url.contains("?"))
            System.out.println(url);
        else {
            str = url.substring(url.indexOf("?") + 1);
            url = url.substring(0, url.indexOf("?") + 1);
        }
        char[] params = str.toCharArray();

        StringBuilder print = new StringBuilder();
        for (char param : params) {
            if (Character.isLetter(param))
                if (!(print.toString().contains(String.valueOf(param)))) {
                    if (paramsToStrip.length > 0) {
                        for (String arg : paramsToStrip) {
                            if (!(arg.contains(String.valueOf(param))))
                                print.append(str.substring(str.lastIndexOf(param), str.lastIndexOf(param) + 3)).append("&");
                        }
                    }
                    else
                        print.append(str.substring(str.lastIndexOf(param), str.lastIndexOf(param) + 3)).append("&");
                }
        }
        System.out.println(url + print.substring(0, print.length()-1));

        //Задача 5
        System.out.println("Задача 5");
        System.out.println("Введите заголовок газеты");
        Scanner sc5 = new Scanner(System.in);
        str = sc5.nextLine();
        String[] hashtags = new String[]{" ", " ", " "};
        StringBuilder buf = new StringBuilder();
        String hashtagBuf = "";
        for (int i = 0 ; i<str.length();i++){
            if (str.charAt(i) != ' ')
                buf.append(str.charAt(i));
            else if (buf.length() > hashtags[0].length()) {
                hashtags[0] = buf.toString();
                buf = new StringBuilder();
            }
            else if (buf.length() > hashtags[1].length()) {
                hashtags[1] = buf.toString();
                buf = new StringBuilder();
            }
            else if (buf.length() > hashtags[2].length()) {
                hashtags[2] = buf.toString();
                buf = new StringBuilder();
            }
            else
                buf = new StringBuilder();
            if(hashtags[0].length() > hashtags[1].length() & hashtags[0].length() > hashtags[2].length()){
                if (hashtags[1].length() > hashtags[2].length()){
                    hashtagBuf = hashtags[2];
                    hashtags[2] = hashtags[0];
                    hashtags[0] = hashtagBuf;
                }
                else{
                    hashtagBuf = hashtags[1];
                    hashtags[1] = hashtags[0];
                    hashtags[0] = hashtagBuf;
                }
            }
        }
        for (int i = 0; i < hashtags.length; i++){
            hashtags[i] = "#" + hashtags[i].toLowerCase();
        }
        System.out.println(Arrays.toString(hashtags));

        //Задача 6
        System.out.println("Задача 6");
        System.out.println("Введите номер числа в последовательности Улама");
        Scanner sc6 = new Scanner(System.in);
        int N = sc6.nextInt();
        int[] mas = new int[N];
        mas[0]=1;
        mas[1]=2;
        int len=2, next=3;
        while (next<Integer.MAX_VALUE && len<N){
            int count =0;
            for (int i=0;i<len;i++){
                for (int j=len-1; j>i; j--){
                    if (mas[i]+mas[j]==next && mas[i]!=mas[j])
                        count++;
                    else if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1) {
                mas[len]=next;
                len++;
            }
            next++;
        }
        System.out.println(mas[N-1]);

        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Введите строку для поиска наибольшей неповторяющейся последовательности");
        Scanner sc7 = new Scanner(System.in);
        str = sc7.nextLine();
        String dlstr = "";
        char [] strSim = str.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c : strSim) {
            if (!strBuilder.toString().contains(String.valueOf(c)))
                strBuilder.append(c);
            else {
                if (strBuilder.length() > dlstr.length())
                    dlstr = strBuilder.toString();
                strBuilder = new StringBuilder("" + c);
            }
        }
        str = strBuilder.toString();
        if (str.length()>dlstr.length())
            dlstr=str;
        System.out.println(dlstr);

        //Задача 8
        System.out.println("Задача 8");
        System.out.println("Введите число для преобразования в римское");
        Scanner sc8 = new Scanner(System.in);
        num = sc8.nextInt();
        StringBuilder roman = new StringBuilder();
        if (num < 1 || num > 3999)
            System.out.println("Число слишком большое");
        while (num >= 1000) {
            roman.append("M");
            num -= 1000;
        }
        while (num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }
        while (num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }
        while (num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }
        while (num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }
        while (num >= 9) {
            roman.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }
        while (num >= 4) {
            roman.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            roman.append("I");
            num -= 1;
        }
        System.out.println(roman.toString());

        //Задача 9
        System.out.println("Задача 9");
        System.out.println("Введите выражение для проверки на его корректность");
        Scanner sc9 = new Scanner(System.in);
        String formula = sc9.nextLine();
        String[] formulaArr = formula.split(" ");
        int ans = 0;
        int expectedResult = 0;
        if (!Character.isDigit(formulaArr[0].charAt(0))){
            System.out.println("False");
        }
        else {
            ans = Integer.parseInt(formulaArr[0]);
        }
        int i = 1;
        while (!formulaArr[i].equals("=")) {
            if (formulaArr[i].equals("+")){
                ans += Integer.parseInt(formulaArr[i + 1]);
            }
            if (formulaArr[i].equals("-")){
                ans -= Integer.parseInt(formulaArr[i + 1]);
            }
            if (formulaArr[i].equals("*")){
                ans *= Integer.parseInt(formulaArr[i + 1]);
            }
            if (formulaArr[i].equals("/")){
                ans /= Integer.parseInt(formulaArr[i + 1]);
            }
            i += 2;
        }
        i = formula.indexOf('=');
        String check = formula.substring(i + 1, formula.length());
        if (check.contains("=")){
            System.out.println("False");
        }
        else{
            expectedResult = Integer.parseInt(formulaArr[formulaArr.length - 1]);
        }
        if (ans == expectedResult){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        //Задача 10
        System.out.println("Задача 10");
        System.out.println("Введите падиндром");
        Scanner sc10 = new Scanner(System.in);
        num = sc10.nextInt();
        boolean check2 = false;
        StringBuffer frstbf =new StringBuffer(num);
        StringBuffer scndbg =new StringBuffer(num);
        if (frstbf.length()%2!=0)
            System.out.println("False");
        else{
            while (!check2){
                if(frstbf != frstbf.reverse()){
                    for(int j=0; j<frstbf.length();j+=2){
                        int a = Integer.parseInt(String.valueOf(frstbf.charAt(j)));
                        int b = Integer.parseInt(String.valueOf(frstbf.charAt(j+1)));
                        scndbg.append(a+b);
                    }
                }
                else
                    check2 = true;
            }
        }
        System.out.println(check2);
    }
}