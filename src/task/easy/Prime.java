package task.easy;

import java.util.stream.IntStream;

/**
 * @author Sergey Yanushevskiy
 */
public class Prime {
    public static int countSomething(int i) {
        System.out.println(i);
        return i;
    }
    public static int countPrimes(int n) {
        if (n < 2) return 0;
        int countPrime = 0;
        boolean [] notPrimes = new boolean[n+1];

        for (int i = 2; i < n; i++) {
            for (int j=i, k=i*j; j < n/i; j++, k=i*j) {
                notPrimes[k] = true;
                if (isPrime(k)){
                    System.out.println(String.format("i=%d, j=%d, k=%d", i, j, k));
                }
            }
            if (!notPrimes[i]) {
                countPrime++;
            }
        }
        return countPrime;
    }
    public static void main(String[] args) {
        int n = 0;
        
//        System.out.println(65541 * 65539);
//        System.out.println(65541 * 65532);
////        System.out.println((long)65541 * 65539);
//        System.out.println((long)65541 * 65539 - Integer.MAX_VALUE - Integer.MAX_VALUE -2);
//        System.out.println( (14 & 14));
//        System.out.println( (14 ^ 14));
//        System.out.println( (1 ^ 2));
        //[1,2,3,2,1]
        System.out.println( (1 ^ 2 ^ 3 ^ 2 ^ 1 ^ 8 ^ 9 ^ 8 ^ 3));

//        System.out.println(isPrime(524303));
       // countPrimes(999999);
                IntStream.range(0, 10)
//                         .filter(MaximumSubarray::isPrime)
                         .forEach(i-> {
                             final String s = Integer.toBinaryString(i);
                             StringBuilder sb = new StringBuilder();

                             IntStream.range(0, 8 - s.length()).forEach(p-> sb.append("0"));

                             System.out.printf("%d - %s%n", i, sb.toString() + s);
                         });

    }
    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 4;  i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
