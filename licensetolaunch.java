import java.util.*;

public class licensetolaunch {
    private void run() {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int number_days = 0;
        for (int i = 0; i < days ; i++) {
            int x = sc.nextInt();
            if (min > x) {
                min = x;
                number_days = i;
            }
        }
        System.out.println(number_days);

    }
    
    public static void main(String args[]) {
        licensetolaunch obj = new licensetolaunch();
        obj.run();
    }
}
