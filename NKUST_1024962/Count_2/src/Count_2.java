import java.awt.*;
import java.util.ArrayList;

public class Count_2 {
    public static void main(String[] args) {
        ArrayList<Integer> primeArray = new ArrayList<>();
        primeArray.add(2);
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i, primeArray)) {
                primeArray.add(i);
            }
        }
        for (int i = 0; i <= primeArray.size() - 1; i++) {
            System.out.println(primeArray.get(i));
        }
    }

    private static boolean isPrime(int num, ArrayList<Integer> primeArray) {
        for (int i = 0; i <= primeArray.size() - 1; i++) {
            if (num % primeArray.get(i) == 0) {
                return false;
            }
        }
        return true;
    }
}
