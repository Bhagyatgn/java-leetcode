//7-Reverse Order
import java.lang.*;
import java.util.*;
public class ReverseOrder {
;   
    public int reverse(int x) {
        boolean negative = x < 0;
        String s=String.valueOf(Math.abs(x));//"123"
        int n=String.valueOf(Math.abs(x)).length();//3
        String w="";
        for (int i=n-1;i>=0;i--){
             char c=s.charAt(i);
              w=w+c;
        }
    int result= Integer.parseInt(w); 
    if (negative)  {
        result=-result;
    }
    return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k= new ReverseOrder().reverse(x);

        System.out.println(k);
    }
}

