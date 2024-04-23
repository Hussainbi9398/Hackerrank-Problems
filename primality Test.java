import java.io.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger number = new BigInteger(bufferedReader.readLine());
            if (number.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        } catch (IOException e) {
            System.out.println("Could not validate input");
        }
    }
}
