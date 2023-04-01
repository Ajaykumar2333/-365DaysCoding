package DAY1;

import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sb = new HashSet<>();
        for(int n: nums){
            if(sb.contains(n)){
                return true;
            }
            sb.add(n);
        }
        return false;


    }
}

