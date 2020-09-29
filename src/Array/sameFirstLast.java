package Array;

import java.util.Arrays;

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */
public class sameFirstLast {
    public static void main(String[] args) {

    int[] nums={1,2,3};
    int [] numRotate= new int[3];

    nums[0]=nums[1];
    nums[1]=nums[2];
    nums[2]=nums[0];
        System.out.println(Arrays.toString(nums));
   /* numRotate[0]=nums[1];// 2
    numRotate[1]=nums[2];   //  3
    numRotate[2]=nums[0];    //  1
*/
        System.out.println(Arrays.toString(numRotate));
        }
    }




