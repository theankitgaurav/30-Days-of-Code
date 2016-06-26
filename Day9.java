import java.io.*;
import java.util.*;

public class Solution {
    private static int factorial(int n){
        if(n<2){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
        
    }
}