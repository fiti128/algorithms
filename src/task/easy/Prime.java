package task.easy;

/**
 * @author Sergey Yanushevskiy
 */
public class Prime {
    public static int countSomething(int i) {
        System.out.println(i);
        return i;
    }
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0,  k =1; countSomething(6) < 10 && k > 10; i++, n = k*n) {
            System.out.println(n);
        }
        //        IntStream.range(0, 100)
        //                 .filter(MaximumSubarray::isPrime)
        //                 .forEach(i-> {
        //                     final String s = Integer.toBinaryString(i);
        //                     StringBuilder sb = new StringBuilder();
        //
        //                     IntStream.range(0, 8 - s.length()).forEach(p-> sb.append("0"));
        //
        //                     System.out.printf("%d - %s%n", i, sb.toString() + s);
        //                 });

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
