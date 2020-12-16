import java.security.MessageDigest;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        //Задача 1

        int i = 1;
        System.out.println("Задача 1");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите слово для шифрования");
        String word = sc1.nextLine();
        char[] wordSim = word.toCharArray();
        int[] crypt = new int[word.length()];
        crypt[0] = wordSim[0];
        System.out.println(crypt[0]);
        while (i < wordSim.length) {
            crypt[i] = wordSim[i] - wordSim[i - 1];
            System.out.println(crypt[i]);
            i++;
        }
        i = 1;
        StringBuffer encrypt = new StringBuffer();
        encrypt.append((char) crypt[0]);
        while (i < crypt.length) {
            crypt[i] = crypt[i] + crypt[i - 1];
            encrypt.append((char) crypt[i]);
            i++;
        }
        System.out.println(encrypt);


        //Задача 2

        i = 0;
        int counter = 0;
        System.out.println("Задача 2");
        Scanner sc2_1 = new Scanner(System.in);
        Scanner sc2_2 = new Scanner(System.in);
        Scanner sc2_3 = new Scanner(System.in);
        System.out.println("Введите фигуру");
        System.out.println("1 - Пешка; 2 - Конь; 3 - Слон; 4 - Ладья; 5 - Ферзь; 6 - Король");
        int figure = sc2_1.nextInt();

        System.out.println("Введите позицию фигуры");
        String curPoz = sc2_2.nextLine();

        System.out.println("Введите целевую позицию");
        String nextPoz = sc2_3.nextLine();

        char[] curPozSim = curPoz.toCharArray();
        char[] nextPozSim = nextPoz.toCharArray();

        if (figure == 1) {
            if (curPozSim[1] == '2' & (nextPozSim[1] == '3' | nextPozSim[1] == '4')  & curPozSim[0] == nextPozSim[0]) {
                System.out.println("True");
            }
            else if (curPozSim[0] == nextPozSim[0] & (int)nextPozSim[1] == (int)curPozSim[1]+1){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        if(figure == 2){
            if (((int)curPozSim[0] == (int)nextPozSim[0] + 1 | (int)curPozSim[0] == (int)nextPozSim[0] - 1)&
                    ((int)curPozSim[1] == (int)nextPozSim[1] + 2 | (int)curPozSim[1] == (int)nextPozSim[1] - 2)) {
                System.out.println("True");
            }
            else if (((int)curPozSim[0] == (int)nextPozSim[0] + 2 | (int)curPozSim[0] == (int)nextPozSim[0] - 2)&
                    ((int)curPozSim[1] == (int)nextPozSim[1] + 1 | (int)curPozSim[1] == (int)nextPozSim[1] - 1)) {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        if(figure == 3){
            i = 1;
            while(i < 9){
                if((int)curPozSim[1] - i == (int)nextPozSim[1] & (int)curPozSim[0] - i == (int)nextPozSim[0]){
                    counter++;
                }
                else if((int)curPozSim[1] + i == (int)nextPozSim[1] & (int)curPozSim[0] + i == (int)nextPozSim[0]){
                    counter++;
                }
                else if((int)curPozSim[1] + i == (int)nextPozSim[1] & (int)curPozSim[0] - i == (int)nextPozSim[0])
                {
                    counter++;
                }
                else if((int)curPozSim[1] - i == (int)nextPozSim[1] & (int)curPozSim[0] + i == (int)nextPozSim[0])
                {
                    counter++;
                }
                i++;
            }
            if (counter>0){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        if(figure == 4){
            if (curPozSim[0] == nextPozSim[0] | curPozSim[1] == nextPozSim[1]){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        if(figure == 5){
            i = 1;
            while(i < 9){
                if((int)curPozSim[1] - i == (int)nextPozSim[1] & (int)curPozSim[0] - i == (int)nextPozSim[0]){
                    counter++;
                }
                else if((int)curPozSim[1] + i == (int)nextPozSim[1] & (int)curPozSim[0] + i == (int)nextPozSim[0]){
                    counter++;
                }
                else if((int)curPozSim[1] + i == (int)nextPozSim[1] & (int)curPozSim[0] - i == (int)nextPozSim[0])
                {
                    counter++;
                }
                else if((int)curPozSim[1] - i == (int)nextPozSim[1] & (int)curPozSim[0] + i == (int)nextPozSim[0])
                {
                    counter++;
                }
                i++;
            }
            if (counter>0 | (curPozSim[0] == nextPozSim[0] | curPozSim[1] == nextPozSim[1])){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        if(figure == 6) {
            if (curPozSim[0] == nextPozSim[0] & ((int) curPozSim[1] == (int) nextPozSim[1] + 1 | (int) curPozSim[1] == (int) nextPozSim[1] - 1)) {
                System.out.println("True");
            } else if (curPozSim[1] == nextPozSim[1] & ((int) curPozSim[0] == (int) nextPozSim[0] + 1 | (int) curPozSim[0] == (int) nextPozSim[0] - 1)) {
                System.out.println("True");
            } else if (((int) curPozSim[1] == (int) nextPozSim[1] + 1 & (int) curPozSim[0] == (int) nextPozSim[0] + 1) |
                    ((int) curPozSim[1] == (int) nextPozSim[1] + 1 & (int) curPozSim[0] == (int) nextPozSim[0] - 1) |
                    ((int) curPozSim[1] == (int) nextPozSim[1] - 1 & (int) curPozSim[0] == (int) nextPozSim[0] + 1) |
                    ((int) curPozSim[1] == (int) nextPozSim[1] - 1 & (int) curPozSim[0] == (int) nextPozSim[0] - 1)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }


        //Задача 3

        int j = 0;
        int counter1 = 0;
        System.out.println("Задача 3");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите буквы в верном порядке");
        String words = sc3.nextLine();
        System.out.println("Введите слово");
        String str = sc3.nextLine();
        char[] WordsSim = words.toCharArray();
        char[] StrSim = str.toCharArray();
        for(j = 0;j < WordsSim.length - 1; j++){
            for(int i1 = 0; i1<StrSim.length - 1; i1++){
                if(StrSim[i1] == WordsSim[j]){
                    counter1++;
                    j++;
                    if(j == WordsSim.length){
                        break;
                    }
                }
            }
        }
        if(counter1 == words.length() - 1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


        //Задача 4

        int num = 0;
        int nextNum = 1;
        System.out.println("Задача 4");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите колличсетво числе");
        int size = sc3.nextInt();
        int[] Nums = new int[size];
        System.out.println("Введите числа по очереди");
        for(int h = 0; h < size; h++){
            Nums[h] = sc3.nextInt();
        }
        for(int h = 0; h < size; h++){
            num = num + Nums[h];
        }
        String strNum = "" + num;
        while (strNum.length() > 1){
            for(int h = 0; h < strNum.length(); h++){
                nextNum = nextNum * Integer.parseInt(""+ strNum.charAt(h));
            }
            strNum = "" + nextNum;
            nextNum = 1;
        }
        System.out.println(strNum);


        //Задача 5

        char[] vowels={'a', 'e', 'i', 'j', 'o', 'q', 'u', 'y'};
        int counter2 = 0;
        StringBuffer vowelsWord1 = new StringBuffer();
        System.out.println("Задача 5");
        Scanner sc5 = new Scanner(System.in);
        Scanner sc5_1 = new Scanner(System.in);
        System.out.println("Введите колличсетво слов");
        int size1 = sc5.nextInt();
        String[] Words = new String[size1];
        System.out.println("Введите слова по очереди");
        for(int h = 0; h < Words.length; h++){
            Words[h] = sc5_1.nextLine();
        }
        char[] word1Sim = Words[0].toCharArray();
        for(int h = 0; h < word1Sim.length; h++){
            for(int k = 0; k < vowels.length; k++){
                if(word1Sim[h] == vowels[k]){
                    vowelsWord1.append(word1Sim[h]);
                }
            }
        }
        for(int h = 0; h < Words.length; h++) {
            for (int k = 0; k < Words[h].length(); k++) {
                for(int l = 0; l < vowelsWord1.length(); l++){
                    if (Words[h].charAt(k) == vowelsWord1.charAt(l)){
                        counter2++;
                    }
                }
            }
            if (counter2 > 0){
                System.out.println(Words[h]);
            }
            counter2 = 0;
        }


        //Задача 6

        System.out.println("Задача 6");
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Введите номер карты");
        String creditNumber = sc6.nextLine();
        int sum = 0;
        char lastSim = creditNumber.charAt(creditNumber.length()-1);
        creditNumber = creditNumber.substring(0, creditNumber.length() - 1);
        if (creditNumber.length() >=14 & creditNumber.length() <= 19) {
            char[] nums = creditNumber.toCharArray();
            char[] reversNums = new char[creditNumber.length()];
            int g = creditNumber.length() - 1;
            for (int k = 0; k < creditNumber.length(); k++) {
                reversNums[k] = nums[g];
                g--;
            }
            System.out.println(reversNums);
            int[] numsArr = new int[reversNums.length];
            for (int k = 0; k < reversNums.length; k++) {
                numsArr[k] = reversNums[k] - '0';
            }
            for (int k = 1; k < numsArr.length; k = k + 2) {
                numsArr[k] = numsArr[k] * 2;
                if (numsArr[k] > 10) {
                    numsArr[k] = (numsArr[k] / 10) * (numsArr[k] % 10);
                }
            }
            for (int k = 0; k < numsArr.length; k++) {
                sum = sum + numsArr[k];
            }
            int lastInt = Character.getNumericValue(lastSim);
            if (10 - sum % 10 == lastInt) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        else{
            System.out.println("Много/мало цифр");
        }


        //Задача 7

        System.out.println("Задача 7");
        Scanner sc7 = new Scanner(System.in);
        Scanner sc7_1 = new Scanner(System.in);

        String[] ruPrimeNum = {"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять"};
        String[] ruDoublDigit = {"десять","одинадцать","двенадцать","тринадцать","четырнадцать","пятнадцать","шестнадцать","семнадцать","восемнадцать","девятьнадцать"};
        String[] ruDoublDigitZero = {"двадцать","тридцать","сорок","пятьдесят","шестьдеся","семдесят","восемдесят","девяносто"};
        String[] ruHundreds = {"сто","двести","триста","четыресто","пятьсот","шестьсот","семьсот","восемьсот","девятьсот"};

        String[] enPrimeNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] enDoublDigit = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] enDoublDigitZero = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        System.out.println("Введите число от 0 до 999");
        int num1 = sc7.nextInt();
        System.out.println("Русский или англисйикий язык?");
        System.out.println("1 - Русский 2 -англисйикий язык");
        int lang = sc7_1.nextInt();

        if(lang == 1){
            if (num1 <= 999 & num1 >= 0){
                if(num1 < 100){
                    if(num1 <= 9){
                        System.out.println(ruPrimeNum[num1]);
                    }
                    if(num1 >= 10 & num1 <= 19){
                        System.out.println(ruDoublDigit[num1%10]);
                    }
                    if(num1%10 == 0){
                        System.out.println(ruDoublDigitZero[num1/10 - 2]);
                    }
                    if(num1 >= 20 & num1%10 !=0){
                        System.out.println(ruDoublDigitZero[num1/10 - 2] + " " + ruPrimeNum[num1%10]);
                    }
                }
                if(num1 >= 100){
                    if(num1%100 == 0){
                        System.out.println(ruHundreds[num1/100]);
                    }
                    if(num1%100 <= 9 & num1%100 >= 1){
                        System.out.println(ruHundreds[num1/100] + " " + ruPrimeNum[num1%10]);
                    }
                    if(num1%100 >= 10 & num1%100 <= 19){
                        System.out.println(ruHundreds[num1/100] + " " + ruDoublDigit[num1%10]);
                    }
                    if(num1%10 == 0){
                        System.out.println(ruHundreds[num1/100] + " " + ruDoublDigitZero[(num1%100)/10 - 2]);
                    }
                    if(num1 >= 120 & num1%100 != 0 & num1%100 >= 19 & num1%10 != 0){
                        System.out.println(ruHundreds[num1/100 - 1] + " " + ruDoublDigitZero[(num1%100)/10 - 2] + " " + ruPrimeNum[num1%10]);
                    }
                }
            }
            else{
                System.out.println("Число слишком большое/малькое");
            }
        }
        if(lang == 2) {
            if (num1 <= 999 & num1 >= 0) {
                if (num1 < 100) {
                    if (num1 >= 0 & num1 <= 9) {
                        System.out.println(enPrimeNum[num1]);
                    }
                    if (num1 >= 10 & num1 <= 19) {
                        System.out.println(enDoublDigit[num1 % 10]);
                    }
                    if (num1 % 10 == 0) {
                        System.out.println(enDoublDigitZero[num1 / 10 - 2]);
                    }
                    if (num1 >= 20 & num1 <= 99 & num1 % 10 != 0) {
                        System.out.println(enDoublDigitZero[num1 / 10 - 2] + "-" + enPrimeNum[num1 % 10]);
                    }
                }
                if (num1 >= 100) {
                    if (num1 % 100 == 0) {
                        System.out.println(enPrimeNum[num1 / 100] + " hundred");
                    }
                    if (num1 % 100 <= 9 & num1 % 100 >= 1) {
                        System.out.println(enPrimeNum[num1 / 100] + " hundred and " + enPrimeNum[num1 % 10]);
                    }
                    if (num1 % 100 >= 10 & num1 % 100 <= 19) {
                        System.out.println(enPrimeNum[num1 / 100] + " hundred and " + enDoublDigit[num1 % 10]);
                    }
                    if (num1 % 10 == 0) {
                        System.out.println(enPrimeNum[num1 / 100] + " hundred and " + enDoublDigitZero[(num1 % 100) / 10 - 2]);
                    }
                    if (num1 >= 120 & num1 % 100 != 0 & num1 % 100 >= 19 & num1 % 10 != 0) {
                        System.out.println(enPrimeNum[num1 / 100] + " hundred and " + enDoublDigitZero[(num1 % 100) / 10 - 2] + "-" + enPrimeNum[num1 % 10]);
                    }
                }
            } else {
                System.out.println("Число слишком большое/малькое");
            }
        }
        // Задача 8

        System.out.println("Задача 8");
        Scanner sc8 = new Scanner(System.in);
        System.out.println("Введите строку для кодировки в SHA-256");
        String uncrypted = sc8.nextLine();

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(uncrypted.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int k = 0; k < hash.length; k++) {
                String hex = Integer.toHexString(0xff & hash[k]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            System.out.println(hexString.toString());
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }

        //Задача 9

        System.out.println("Задача 9");
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Введите строку");
        String casestr = sc9.nextLine();
        StringBuffer sbEndstr = new StringBuffer();
        String[] StrSimarr = new String[casestr.length()];
        for(int k = 0; k < casestr.length(); k++){
            StrSimarr[k] = "" + casestr.charAt(k);
        }
        sbEndstr.append(StrSimarr[0].toUpperCase());
        for(int k = 1; k < casestr.length(); k++){
            if(!StrSimarr[k].equals(" ") | !StrSimarr[k].equals(",") | !StrSimarr[k].equals(".") | !StrSimarr[k].equals("-")){
                if(StrSimarr[k-1].equals(" ")){
                    sbEndstr.append(StrSimarr[k].toUpperCase());
                }
                else{
                    sbEndstr.append(StrSimarr[k].toLowerCase());
                }
            }
        }
        String Endstr = sbEndstr.toString();
        Endstr = Endstr.replace(" And ", " and ");
        Endstr = Endstr.replace(" In ", " in ");
        Endstr = Endstr.replace(" The ", " the ");
        Endstr = Endstr.replace(" Of ", " of ");
        System.out.println(Endstr);

        //Задача 10
        System.out.println("Задача 10");
        System.out.println("Ведите число для построения фрактала");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() - 1;
        j = 0;
        for(i = 1; n > 0; i++){
            n = n - i * 6;
            j = i + 1;
        }
        if (n == 0){
            String col = "";
            int cols = j * 2 - 1;
            int elemsInCol = j;
            int spaces = j - 1;
            for (int z = cols; z > 0; z--){
                for (i = 0; i < spaces; i ++){
                    col = col + " ";
                }
                for (i = 0; i < elemsInCol; i++){
                    col = col +"o ";
                }
                if (z > j){
                    spaces = spaces - 1;
                    elemsInCol = elemsInCol + 1;
                }
                else{
                    spaces = spaces + 1;
                    elemsInCol = elemsInCol - 1;
                }
                System.out.println(col);
                col = "";
            }
        }
        else {
            System.out.print("Invalid");
        }
    }
}

