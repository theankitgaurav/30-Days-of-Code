import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> names = new ArrayList();
        Pattern p = Pattern.compile("[a-z]+@gmail\\.com");
        for(int i=0; i<n; i++){
            String name = in.next();
            String email = in.next();
            Matcher m = p.matcher(email);
            if( m.find() ) {
                names.add(name);
            }
        }
        Collections.sort(names);
        for(String name: names){
            System.out.println(name);
        }
    }
}