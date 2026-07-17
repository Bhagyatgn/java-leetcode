//1291-Sequentiial Digits
import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits="123456789";
        List<Integer> result = new ArrayList<>();
        for ( int len=1;len <=9;len++){
            for (int i=0;i+len<=9;i++){
                int num=Integer.parseInt(digits.substring(i,i+len));
                if (num>=low && num<=high){
                    result.add(num);
                }
            }
  


        }
    return result;


    }
}

