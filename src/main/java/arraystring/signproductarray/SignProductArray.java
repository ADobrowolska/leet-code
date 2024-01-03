package arraystring.signproductarray;

public class SignProductArray {
    /*
    There is a function signFunc(x) that returns:
    1 if x is positive.
    -1 if x is negative.
    0 if x is equal to 0.
    You are given an integer array nums. Let product be the product of all values in the array nums.
    Return signFunc(product).
     */

    public static int arraySign(int[] nums) {
        double x = 1;
        for (int i = 0; i < nums.length; i++) {
            x *= nums[i];
        }
        if (x > 0) {
            return 1;
        } else if(x < 0) {
            return -1;
        } else {
            return 0;
        }
    }



}
