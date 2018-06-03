import java.util.Arrays;

public class Proba {

    public static void main(String[] args) {

        int[] big = new int[101];

        int i;
        for (i = 0; i <= big.length; i++) {
           System.out.print(i+", ");
            big[i] = i++;
//            System.out.println
        }
        int wynik= 0 ;
        for (int a = 0; a < 100; a++) {
            wynik = wynik + big[a];

        }

        String arrays = Arrays.toString(big);
        System.out.println("\n" + arrays);
        System.out.println(wynik);
    }


}