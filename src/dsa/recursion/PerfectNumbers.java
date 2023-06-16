package dsa.recursion;
import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 1000; // Example value of n
        
        List<Integer> perfectNumbers = findPerfectNumbers(n);
        
        System.out.println("Perfect numbers between 1 and " + n + ":");
        for (int number : perfectNumbers) {
            System.out.println(number);
        }
    }
    
    public static List<Integer> findPerfectNumbers(int n) {
        List<Integer> perfectNumbers = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                perfectNumbers.add(i);
            }
        }
        
        return perfectNumbers;
    }
    
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = getDivisorsSum(number, number - 1);
        return sum == number;
    }
    
    public static int getDivisorsSum(int number, int divisor) {
        if (divisor == 1) {
            return 1;
        }
        
        if (number % divisor == 0) {
            return divisor + getDivisorsSum(number, divisor - 1);
        } else {
            return getDivisorsSum(number, divisor - 1);
        }
    }
}
