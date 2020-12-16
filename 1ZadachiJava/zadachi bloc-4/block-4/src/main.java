import java.util.Scanner;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        //Задача 1
        int l = 0;
        int spaceCounter = 0;
        int wordNum = 0;
        System.out.println("Задача 1");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите эссе");
        String essay = sc1.nextLine();
        System.out.println("Колличество символов в строке");
        int k = sc1.nextInt();
        String[] WordArr = essay.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < WordArr.length; i++){
            if(str.length() - spaceCounter + WordArr[i].length() - 1 < k){
                str.append(WordArr[i]);
                str.append(" ");
                spaceCounter++;
            }
            else{
                str.setLength(str.length() - 1);
                System.out.println(str);
                str.setLength(0);
                spaceCounter = 0;
                i--;
            }
        }
        System.out.println(str);

        //Задача 2
        System.out.println("Задача 2");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите скобки");
        String brec = sc2.nextLine();
        char[] BrecSim = brec.toCharArray();
        int open = 0;
        int closed = 0;
        int counter = 0;
        for (int i = 0; i < brec.length(); i++) {
            if (BrecSim[i] == '(') {
                open++;
            } else {
                closed++;
            }
            if (closed == open) {
                open = 0;
                closed = 0;
                counter++;
            }
        }
        String[] BrecStr = new String[counter];
        counter = 0;
        for (int i = 0; i < BrecStr.length; i++) {
            BrecStr[i] = "";
        }
        for (int i = 0; i < brec.length(); i++) {
            if (BrecSim[i] == '(') {
                open++;
                BrecStr[counter] += BrecSim[i];
            } else {
                closed++;
                BrecStr[counter] += BrecSim[i];
            }
            if (closed == open) {
                open = 0;
                closed = 0;
                counter++;
            }
        }
        for (int i = 0; i < BrecStr.length; i++) {
            System.out.println(BrecStr[i]);
        }

        //Задача 3
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Задача 3");
        System.out.println("Введите строку");
        String scc = sc3.nextLine();
        System.out.println("Введиет 1, если хотите перевести CamelCase в SnakeCase или 2, если хотите перевести SnakeCase в CamelCase");
        int h = sc3.nextInt();
        if (h == 1) {
            // Regular Expression
            String regex = "([a-z])([A-Z]+)";
            String replacement = "$1_$2";
            scc = scc.replaceAll(regex, replacement).toLowerCase();
        } else {
            while (scc.contains("_")) {
                scc = scc.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(scc.charAt(scc.indexOf("_") + 1))));
            }
        }
        System.out.println(scc);


        //Задача 4
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Задача 3");
        System.out.println("Введите начало рабочего дня");
        float start = sc4.nextFloat();
        System.out.println("Введите конец рабочего дня");
        float end = sc4.nextFloat();
        System.out.println("Введите почасовую ставку");
        float hPay = sc4.nextFloat();
        System.out.println("Введите множитель свехурочных работ");
        float hMulti = sc4.nextFloat();
        float salary = 0;
        float s = 0;
        for (float i = start; i < end; i++) {
            if (start % 1 != 0) {
                s = start % (int) start;
                start -= s;
                i = (int) start + 1;
                salary = salary + (1 - s) * hPay;
            }
            if (end % 1 != 0) {
                s = end % (int) end;
                end -= s;
                salary = salary + s * hPay;
            }
            if (i >= 9 && i < 17) {
                salary += hPay;
            } else {
                salary = salary + hPay * hMulti;
            }
        }
        System.out.println("За данный рабочий день будет заработанно $");
        System.out.printf("%.2f", salary);

        //Задача 5
        System.out.println("Введите вес и рост ");
        Scanner sc5 = new Scanner(System.in);
        String mass = sc5.nextLine();
        String rost = sc5.nextLine();
        double rostVar = 0;
        double massVar = 0;
        double BMI = 0;
        int n1 = 1;
        int pounds = mass.indexOf("фунтов");
        int inches = rost.indexOf("дюймов");
        //int kilo = mass.indexOf("килограмм");
        //int meters = mass.indexOf("метров");
        char[] massSim = mass.toCharArray();
        char[] rostSim = rost.toCharArray();
        for (int i = rost.length() - 1; i >= 0; i--) {
            if (Character.isDigit(rostSim[i])) {
                rostVar = rostVar + Character.getNumericValue(rostSim[i]) * n1;
                n1 = n1 * 10;
            }
        }
        n1 = 1;
        for (int i = mass.length() - 1; i >= 0; i--) {
            if (Character.isDigit(massSim[i])) {
                massVar = massVar + Character.getNumericValue(massSim[i]) * n1;
                n1 = n1 * 10;
            }
        }
        if (pounds > 0) {
            massVar = massVar * 0.45;
        }
        if (inches > 0) {
            rostVar = rostVar * 0.025;
        }
        BMI = (massVar / (rostVar * rostVar));
        if (BMI < 18.5) {
            System.out.printf("%.1f", BMI);
            System.out.println(" Дрищуган");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("%.1f", BMI);
            System.out.println(" Нормальный вес");
        } else {
            System.out.printf("%.1f", BMI);
            System.out.println(" Ожирение");
        }

        //Задача 6
        System.out.println("Задача 6");
        System.out.println("Введите число, чтобы найти мультипликативное постоянство");
        Scanner sc6 = new Scanner(System.in);
        String num = sc6.nextLine();
        char[] numSim = num.toCharArray();
        int result5 = 1;
        int f = 0;
        while (f < numSim.length) {
            result5 = result5 * Character.getNumericValue(numSim[f]);
            f++;
            if (numSim.length == 1) {
                break;
            }
            if (f == numSim.length) {
                f = 0;
                numSim = String.valueOf(result5).toCharArray();
                result5 = 1;
            }
        }
        if(Integer.parseInt(num) < 10){
            System.out.println("0");
        }
        else {
            System.out.println(result5);
        }

        //Задача 7
        System.out.println("Задача 6");
        System.out.println("Введите строку для подсчета");
        Scanner sc7 = new Scanner(System.in);
        String str7 = sc7.nextLine();
        if (str7.length() != 0) {
            int counterSim = 1;
            char[] str7Sim = str7.toCharArray();
            int u = 1;
            StringBuffer result7 = new StringBuffer(" ");
            while (u < str7.length()) {
                if (str7Sim[u - 1] == str7Sim[u]) {
                    counterSim += 1;
                } else {
                    if (counterSim == 1) {
                        result7 = result7.insert((result7.length()), str7Sim[u - counterSim]);
                    } else {
                        result7 = result7.insert((result7.length()), str7Sim[u - counterSim] + "*" + counterSim);
                        counterSim = 1;
                    }
                }
                u++;
            }
            String result71 = result7.toString();
            result71 = result71.replaceAll(" ", "");
            result7 = new StringBuffer(result71);
            if (counterSim == 1) {
                result7 = result7.insert((result7.length()), str7Sim[u - counterSim]);
            } else {
                result7 = result7.insert((result7.length()), str7Sim[u - counterSim] + "*" + counterSim);
            }
            System.out.println(result7);
        }
        else{
            System.out.println("");
        }

        //Задача 8
        System.out.println("Задача 8");
        Scanner sc8 = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String st1 = sc8.nextLine();
        System.out.println("Введите вторую строку");
        String st2 = sc8.nextLine();
        String gl = "aeiouyAEIOUY";
        st1 = st1.replace(".","");
        st1 = st1.replace("!","");
        st1 = st1.replace(",","");
        st1 = st1.replace("?","");
        st1 = st1.replace("'","");
        st2 = st2.replace(".","");
        st2 = st2.replace("!","");
        st2 = st2.replace(",","");
        st2 = st2.replace("?","");
        st2 = st2.replace("'","");

        char[] strToArray1 = st1.toCharArray();
        char[] strToArray2 = st2.toCharArray();
        char[] glToArray = gl.toCharArray();
        counter = 0;

        for(int i = 0; i < strToArray1.length; i++) {
            for (int j = glToArray.length - 1; j >=0; j --) {
                if (glToArray[j] == strToArray1[strToArray1.length - 1 - i]) {
                    for (int u = glToArray.length - 1; u >= 0; u--) {
                        if (glToArray[u] == strToArray2[strToArray2.length - 1 - i]) {
                            if (strToArray1[strToArray1.length - 1 - i] == strToArray2[strToArray2.length - 1 - i]) {
                                counter++;

                            }
                        }
                    }
                }
            }
        }
        if (counter>0){
            System.out.println("True"); }
        else{
            System.out.println("False");
        }


        //Задача 9
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Введите первое число");
        String num1 = sc9.nextLine();
        System.out.println("Введите второе число");
        String num2 = sc9.nextLine();
        char[] num1Sim = num1.toCharArray();
        char[] num2Sim = num2.toCharArray();
        int col = 1;
        int colTrue = 0;
        char nummer = ' ';
        for(int i = 1; i< num1Sim.length; i++) {
            if (num1Sim[i] == num1Sim[i - 1]) {col++;}
            else {col = 1;}
            if (col == 3) {nummer = num1Sim[i];}
        }
        col = 1;
        for(int i = 0; i< num2Sim.length; i++){
            if(num2Sim[i] == nummer){ col++;}
            else{col = 1;}
            if (col == 2){colTrue++;}
        }
        if (colTrue > 0){System.out.println("true");}
        else{System.out.println("false");}


        //Задача 10
        Scanner sc10 = new Scanner(System.in);
        System.out.println("Введите книгу");
        String book = sc10.nextLine();
        System.out.println("Введите разделитель");
        String ender = sc10.nextLine();
        char[] bookSim = book.toCharArray();
        char endSim = ender.charAt(0);
        StringBuffer bookstr = new StringBuffer();
        for(int i = 0; i < bookSim.length; i++){
            if(bookSim[i] == endSim){
                i++;
                while(bookSim[i] != endSim){
                    bookstr.append(bookSim[i]);
                    i++;
                }
            }
        }
        System.out.println(bookstr);
        String bookstr1 = bookstr.toString();
        StringBuilder unicSim = new StringBuilder();
        int idx;
        for (int i = 0; i < bookstr1.length(); i++) {
            char c = bookstr1.charAt(i);
            idx = bookstr1.indexOf(c, i + 1);
            if (idx == -1) {
                unicSim.append(c);
            }
        }
        String unicSim1 = unicSim.toString();
        System.out.println(unicSim1.length());


    }
}