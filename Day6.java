import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int j=0; j<t; j++){
            String str = sc.nextLine();
            int i;
            char[] str1= str.toCharArray();
            for(i = 0; i<str.length(); i= i+2){
                System.out.print(str1[i]);
            }
            System.out.print(" ");
            for(i=1; i<str.length(); i=i+2){
                System.out.print(str1[i]);
            }
            System.out.println("");
        }
    }
}S