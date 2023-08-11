import java.util.*;
public class tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int month = sc.nextInt();
        int original = x;
        for (int i = 0; i < month; i++) {
            int usage = sc.nextInt();
            original += x - usage;
        }
        System.out.println(original);
    }
}
