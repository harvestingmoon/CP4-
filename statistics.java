import java.util.*;
public class statistics {
    private void run() {
        Scanner sc = new Scanner(System.in);
        int caseCount = 0;
        while (sc.hasNext()) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int n = sc.nextInt();
            for (int i = 0; i < n; i ++) {
                int x = sc.nextInt();
                if (min > x) min = x;
                if (max < x) max = x; 
            }
            System.out.println("Case " + ++caseCount+": "+min+" "+max+" "+(max-min));
        }
        
    }
    
    public static void main(String[] args) {
        statistics obj = new statistics();
        obj.run();
    }
}
