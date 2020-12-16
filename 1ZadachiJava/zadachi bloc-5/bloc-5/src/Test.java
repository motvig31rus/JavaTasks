import java.security.MessageDigest;
import java.util.Scanner;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int j = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() - 1;
        j = 0;
        for(int i = 1; n > 0; i++){
            n = n - i * 6;
            j = i + 1;
        }
        if (n == 0){
            String col = "";
            int cols = j * 2 - 1;
            int elemsInCol = j;
            int spaces = j - 1;
            for (int z = cols; z > 0; z--){
                for (int i = 0; i < spaces; i ++){
                    col = col + " ";
                }
                for (int i = 0; i < elemsInCol; i++){
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