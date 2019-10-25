import java.util.*;
public class HW25{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double a = 0;
        for(double i = 1; i <= n; i++){
               a = a + Math.pow(2, i);
        }
        System.out.println((int)a);
    }
}