import java.util.*;
public class HW22{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char c =scn.next().charAt(0);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
