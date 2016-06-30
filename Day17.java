//Write your code here
import java.lang.*;
class Calculator{
    int power(int i, int j) throws Exception{
        if(i<0 || j<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            int power = 1;
            while(j>0){
                power = power*i;
                j--;
            }
            return power;
        }
    }
}