import java.io.*;
import java.util.*;

public class moscowdream{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),n = sc.nextInt();
        if ((a >= 1) && ( b >=1) && (c>=1 ) && (n >= 3) && (a+b+c>= n)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");

        }
    }
}