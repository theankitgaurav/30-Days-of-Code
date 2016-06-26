//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> dicto = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dicto.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dicto.containsKey(s)){
                int res = dicto.get(s);
                System.out.println(s+"="+res);
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}