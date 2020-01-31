package com.techelevator;

public class Less20 {
    /*
         Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
         and 39 return true, but 40 returns false.
         (Hint: Think "mod".)
         less20(18) → true
         less20(19) → true
         less20(20) → false
     */
    public boolean isLessThanMultipleOf20(int n) {
       if (n != 0 && n % 20 == 0 || (n - 1) % 20 == 0 || (n - 2) % 20 == 0 || (n + 1) % 20 == 0 || (n + 2) % 20 == 0) {
    	   return true;
       }
       else return false;
    }
}
//    	boolean oneLessThanMultipleOf20 = (n +1) % 20 <= 1 || (n - 1) % 20 <= 1;
//        boolean twoLessThanMultipleOf20 = (n +2) %20  <= 2 || (n - 2) % 20 <= 2;
//        boolean exactMultipleOf20 = (n % 20 == 0);
//        boolean twoLessThan20 = (n == 18);
//        if (n = twoLessThan20) {
//        	return true;
//        }
//        return exactMultipleOf20 || oneLessThanMultipleOf20 || twoLessThanMultipleOf20 || twoLessThan20;
//}
//}