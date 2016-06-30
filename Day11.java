import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int i,j,k=0;
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0,tempSum=0;
        int[] ghSum = new int[16];
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                ghSum[k] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                //System.out.println(ghSum[k]);
                k++;
            }
        }
        Arrays.sort(ghSum);
        System.out.println(ghSum[15]);
        in.close();
    }
}
