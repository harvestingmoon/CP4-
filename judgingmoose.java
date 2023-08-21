import java.util.*;
public class judgingmoose {

    private void run() {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt(), right = sc.nextInt();
        if ( (left == right) && (left + right) > 0) {
            System.out.println("Even " + (left *2));

        }
        else if ((left + right) == 0) {
            System.out.println("Not a moose");
        }
        else {
            int higher = Math.max(left,right);
            System.out.println("Odd " + (higher *2));
        }

    }
    public static void main(String[] args) {
        judgingmoose obj = new judgingmoose();
        obj.run();
    }
}
