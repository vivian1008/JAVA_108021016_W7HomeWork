import java.util.*;
public class HW23{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1;
        for(int i = 1 ; i <= n; i++){
           a = a * i;
        }
        System.out.println(a);
    }
}