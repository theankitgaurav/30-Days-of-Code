import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            boolean flag = true;
            if(n<=1){
                System.out.println("Not prime");
            }
            else{
                for(int j=2; j<Math.sqrt(n); j++){
                    if(n%j == 0){
                        flag = false;
                    }
                }
                if(flag){
                    System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
            }
        }
    }
}