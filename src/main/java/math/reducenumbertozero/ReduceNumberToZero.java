package math.reducenumbertozero;

/*
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.
 */

public class ReduceNumberToZero {
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num -= 1;
                count++;
                if (num == 0) {
                    return count;
                }
            }
            num /= 2;
            count++;
        }
        return count;
    }
}
