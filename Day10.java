import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0,maxSum=0;
        while(n>0){
            if(n%2 == 1){
                sum++;
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
            else{
                sum = 0;
            }
            n = n/2;
        }
        System.out.println(maxSum);
        scan.close();
    }
}