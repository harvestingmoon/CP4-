import java.util.*;
public class qaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt(); sc.nextLine();
        double sum = 0;
        //int p = 0;
        for (int p = 0; p < numLines; p++) {
            double one = sc.nextDouble();
            double two = sc.nextDouble();
            sum += (one * two);

        }
        System.out.println(sum);
        
    }
}
