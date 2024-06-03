/* - use of single line comments
   - limit to 80 characters per line */
// import statements
import java.util.Scanner;
import java.math.*;

/* - uses one top level class per file 
   - filename matches class name */ 
// main class
public class Aniceto_DarylJett_MidtermReq {
    // method is short and only serves one purpose
    // compute nth digit in fibonacci sequence
    public static BigInteger Fibo(int n) {

        // uses camel case
        BigInteger fibo1 = new BigInteger("-1");
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger currentSum = BigInteger.ZERO;

        /* - use space after keyword 
           - use braces for control structures
           - no unnecessary spaces */ 
        for (int i = 1; i <= n; i++) {
            currentSum = fibo1.add(fibo2);
            fibo1 = fibo2;
            fibo2 = currentSum;
        }
        return currentSum;
    }
    // main method
    public static void main(String[] args) {
        // take user input for value of n and call fibo method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Nth number in Fibonacci Sequence to print: ");
        int n = input.nextInt();
        input.close();

        System.out.println(Fibo(n));
    }
}
