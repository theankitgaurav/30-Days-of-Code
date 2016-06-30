import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=6;int fine = 0;
        int[] a = new int[t];
        for(int i=0; i<t; i++){
            a[i] = in.nextInt();
        }
        
        if(a[2] > a[5]){
            fine = 10000;
        }
        else if(a[2] == a[5]){
            if(a[1] > a[4]){
                fine = 500 * (a[1] - a[4]);
            }
            else if(a[1] == a[4] && a[0] > a[3]){
                fine = 15 * (a[0] - a[3]);
            }
        }
        System.out.println(fine);
    }
}