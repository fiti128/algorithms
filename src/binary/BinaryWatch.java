package binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Yanushevskiy
 */
public class BinaryWatch {
    private int counter = 0;
    public static void main(String[] args) {
        new BinaryWatch().readBinaryWatch(4);
//        int mask = Integer.parseInt("10000", 2);
//        int loopMask = 1 << 2;
//        int result = mask | loopMask;
//        loop();
//        System.out.println(-1 >>> 32-2);
//        System.out.println(String.format("Mask before: %s%n, Loop Mask: %s%n, Result: %s",
//                                         Integer.toBinaryString(mask),
//                                         Integer.toBinaryString(loopMask),
//                                         Integer.toBinaryString(result)));
    }
    public static String toBinary(int number, int bits) {
        return String.format("%"+bits + "s", Integer.toBinaryString(number)).replace(' ', '0');
    }
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        solve(num, 0,0, res);
        return res;
    }
    public static void loop() {
        int n = 2;
        int start = -1 >>> 32-n;
        System.out.println(toBinary(start, 10));
        System.out.println(toBinary((start << 1 | 1 << 5), 10));
        for (int i = n; i < 10; i++) {
            System.out.println(toBinary(start | 1 << i, 10));
        }
    }

    void solve(int num, int mask,int start, List<String> res) {
        System.out.println(String.format("Num: %d, Mask: %s, Start: %d. Counter %d",
                                         num, toBinary(mask, 10), start, counter));
        counter++;
        if (num == 0) {
            int min = mask & ((1 << 6) - 1);
            int hour = mask >> 6;
            if (hour > 11 || min > 59) return;
            res.add(String.format("%d:%02d", hour, min));
            return;
        }

        for (int i = start; i < 10; i++) {
            solve(num - 1, mask | (1 << i),i + 1, res);
        }
    }
}
