import java.util.*;
public class chicken {
    private void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = b - a;
        if (diff > 1) {
            System.out.println("Dr. Chaz will have " + diff + " pieces of chicken left over!");
        }
        else if (diff == 1) {
            System.out.println("Dr. Chaz will have " + diff + " piece of chicken left over!");
        }
        else if (diff == -1) {
            diff = Math.abs(diff);
            System.out.println("Dr. Chaz needs " + diff + " more piece of chicken!");
        }
        else {
            diff = Math.abs(diff);
            System.out.println("Dr. Chaz needs " + diff + " more pieces of chicken!");
        }
    }
    public static void main(String[] args) {
        chicken obj = new chicken();
        obj.run();
    }
}
