import java.util.*;
public class HW24{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double a = 0;
        for(double i = 1; i <= n; i++) {
            a = a + (1/(((2 * i) - 1) * (2 * i)));
        }
        System.out.println(a);
    }
}