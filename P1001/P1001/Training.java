package P1001;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if (a==0 & b==0) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(a);
        } else System.out.println(Math.max(a, b));
    }
}
